/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lmscourserasda;
import javax.swing.*;
import java.awt.*;
import java.util.*;

/* =========================
   MODEL CLASSES
========================= */

class User {
    String username, password;
    public User(String u, String p) {
        username = u;
        password = p;
    }
}

class Course {
    String title, content;
    boolean premium;

    public Course(String t, String c, boolean p) {
        title = t;
        content = c;
        premium = p;
    }

    public String toString() {
        return title + (premium ? " (Premium)" : "");
    }
}

class LMSModel {
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();
    HashMap<String, ArrayList<Course>> enrolledCourses = new HashMap<>();

    public LMSModel() {
        courses.add(new Course("Java Basics",
                "Variables\nLoops\nOOP\nMethods", false));
        courses.add(new Course("Data Structures",
                "Arrays\nStacks\nQueues\nTrees", false));
        courses.add(new Course("Software Architecture",
                "MVC\nLayered\nDesign Patterns", true));
        courses.add(new Course("Operating Systems",
                "Processes\nThreads\nScheduling", false));
    }

    boolean register(String u, String p) {
        for (User user : users)
            if (user.username.equals(u)) return false;
        users.add(new User(u, p));
        return true;
    }

    User login(String u, String p) {
        for (User user : users)
            if (user.username.equals(u) && user.password.equals(p))
                return user;
        return null;
    }

    void enroll(String username, Course c) {
        enrolledCourses.putIfAbsent(username, new ArrayList<>());
        if (!enrolledCourses.get(username).contains(c))
            enrolledCourses.get(username).add(c);
    }
}

/* =========================
   VIEW CLASSES
========================= */

class LoginView extends JFrame {
    JTextField user = new JTextField();
    JPasswordField pass = new JPasswordField();
    JButton login = new JButton("Login");
    JButton register = new JButton("Register");

    public LoginView() {
        setTitle("LMS Login");
        setLayout(new GridLayout(4, 2));
        add(new JLabel("Username:"));
        add(user);
        add(new JLabel("Password:"));
        add(pass);
        add(login);
        add(register);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

class RegisterView extends JFrame {
    JTextField user = new JTextField();
    JPasswordField pass = new JPasswordField();
    JButton submit = new JButton("Register");

    public RegisterView() {
        setTitle("Register");
        setLayout(new GridLayout(3, 2));
        add(new JLabel("Username:"));
        add(user);
        add(new JLabel("Password:"));
        add(pass);
        add(submit);
        setSize(300, 150);
    }
}

class CourseListView extends JFrame {
    JList<Course> list;
    JButton view = new JButton("View Content");

    public CourseListView(ArrayList<Course> courses) {
        setTitle("Courses");
        list = new JList<>(courses.toArray(new Course[0]));
        add(new JScrollPane(list), BorderLayout.CENTER);

        JPanel bottom = new JPanel();
        bottom.add(view);
        add(bottom, BorderLayout.SOUTH);

        setSize(400, 300);
    }
}

class ContentView extends JFrame {
    JTextArea content = new JTextArea();
    JButton back = new JButton("Back");

    public ContentView() {
        setTitle("Course Content");
        content.setEditable(false);
        add(new JScrollPane(content), BorderLayout.CENTER);
        add(back, BorderLayout.SOUTH);
        setSize(400, 300);
    }
}

/* =========================
   CONTROLLER
========================= */

class LMSController {
    LMSModel model = new LMSModel();
    LoginView loginView = new LoginView();
    CourseListView courseView;
    ContentView contentView;
    User currentUser;

    public LMSController() {
        loginView.setVisible(true);
        loginView.login.addActionListener(e -> login());
        loginView.register.addActionListener(e -> openRegister());
    }

    void openRegister() {
        RegisterView r = new RegisterView();
        r.setVisible(true);

        r.submit.addActionListener(e -> {
            boolean ok = model.register(
                    r.user.getText(),
                    new String(r.pass.getPassword()));
            JOptionPane.showMessageDialog(r,
                    ok ? "Registered Successfully" : "User already exists");
            if (ok) r.dispose();
        });
    }

    void login() {
        currentUser = model.login(
                loginView.user.getText(),
                new String(loginView.pass.getPassword()));

        if (currentUser == null) {
            JOptionPane.showMessageDialog(loginView, "Invalid credentials");
            return;
        }

        loginView.dispose();
        openCourseList();
    }

    void openCourseList() {
        courseView = new CourseListView(model.courses);
        courseView.setVisible(true);
        courseView.view.addActionListener(e -> openContent());
    }

    void openContent() {
        Course c = courseView.list.getSelectedValue();
        if (c == null) return;

        int choice = JOptionPane.showConfirmDialog(
                courseView,
                "Do you want to enroll in this course?",
                "Enrollment (Optional)",
                JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            if (c.premium)
                JOptionPane.showMessageDialog(courseView,
                        "Payment successful (simulated)");
            model.enroll(currentUser.username, c);
        }

        contentView = new ContentView();
        contentView.content.setText(c.content);
        contentView.setVisible(true);
        courseView.setVisible(false);

        contentView.back.addActionListener(e -> {
            contentView.dispose();
            courseView.setVisible(true);
        });
    }
}

/* =========================
   MAIN
========================= */

public class LMSCourseraSDA {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(LMSController::new);
    }
}