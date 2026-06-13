package university;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        {
            Teacher t1 = new Teacher(1, "waseem");
            Teacher t2 = new Teacher(2, "yasir");
            ArrayList<Teacher> CSteacherAL = new ArrayList<Teacher>();
            CSteacherAL.add(t1);
            CSteacherAL.add(t2);

            ArrayList<Teacher> MGTteacherAL = new ArrayList<Teacher>();
            Teacher t3 = new Teacher(3, "Adeel");
            Teacher t4 = new Teacher(4, "salman");
            MGTteacherAL.add(t3);
            MGTteacherAL.add(t4);

            Student s1 = new Student("aaa", 1);
            Student s2 = new Student("bbb", 2);
            ArrayList<Student> CSstudentsAL = new ArrayList<>();
            CSstudentsAL.add(s1);
            CSstudentsAL.add(s2);

            Student s3 = new Student("ccc", 1);
            Student s4 = new Student("ddd", 2);
            ArrayList<Student> MGTstudentsAL = new ArrayList<>();
            MGTstudentsAL.add(s3);
            MGTstudentsAL.add(s4);

            Course c1 = new Course("csc241", "oop");
            Course c2 = new Course("csc240", "Database");
            ArrayList<Course> CScoursesAL = new ArrayList<Course>();
            CScoursesAL.add(c1);
            CScoursesAL.add(c2);

            Course c3 = new Course("csc211", "FA");
            Course c4 = new Course("csc220", "ITM");
            ArrayList<Course> MgtcourseAL = new ArrayList<Course>();
            MgtcourseAL.add(c3);
            MgtcourseAL.add(c4);

            Department computerScience = new Department("CS", CSstudentsAL, CSteacherAL, CScoursesAL);
            Department managmentScience = new Department("MGT", MGTstudentsAL,MGTteacherAL, MgtcourseAL);

            ArrayList<Department> departments = new ArrayList<>();
            departments.add(computerScience);
            departments.add(managmentScience);

            University obj = new University("CUI", departments);
            
             System.out.println("students in CS: "+computerScience.getStudents());
             
             System.out.println("students in CS: "+computerScience.getTeacher());
             
             

        }
    }

}
