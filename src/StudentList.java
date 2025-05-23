
import java.util.ArrayList;

public class StudentList {

    ArrayList<Student> st = new ArrayList<Student>();

    public ArrayList<Student> addStudent(Student stu) {

        st.add(stu);
        return st;

    }

    public ArrayList<Student> getEditStudent(String fullname, int studentID) {

        for (int i = 0; i < st.size(); i++) {

            if (st.get(i).studentId == studentID) {

                System.out.print("true");

                st.get(i).fullname = fullname;
            }

        }

        return st;
    }

    public ArrayList<Student> getDeleteStudent(int studentID) {

        for (int i = 0; i < st.size(); i++) {

            if (st.get(i).studentId == studentID) {

                st.remove(i);

            }

        }

        return st;
    }

    public void printStudentList() {
        int len = st.size();

        for (int i = 0; i < len; i++) {
            System.out.println("Student ID: " + st.get(i).studentId + " Fullnane: " + st.get(i).fullname);

        }

    }
}
