package university;

import java.util.ArrayList;

class Department {

    String name;

    ArrayList<Student> students;
    ArrayList<Teacher> teacher;
    ArrayList<Course> course;

    Department(String name, ArrayList<Student> students, ArrayList<Teacher> teacher, ArrayList<Course> course) {
        this.name = name;
        this.students = students;
        this.teacher = teacher;
        this.course = course;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeacher() {
        return teacher;
    }

    public ArrayList<Course> getcourse() {
        return course;
    }

}
