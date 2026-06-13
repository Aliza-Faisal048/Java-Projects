package university;

import java.util.ArrayList;

class University {

    String instituteName;
    ArrayList<Department> departments;

    University(String instituteName, ArrayList<Department> departments) {

        this.instituteName = instituteName;
        this.departments = departments;
    }

}
