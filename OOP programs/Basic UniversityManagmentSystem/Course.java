package university;

public class Course {

    String coursecode;
    String coursename;

    public Course(String coursecode, String coursename) {
        this.coursecode = coursecode;
        this.coursename = coursename;
    }

    @Override
    public String toString() {
        return "Course{" + "coursecode=" + coursecode + ", coursename=" + coursename + '}';
    }

}
