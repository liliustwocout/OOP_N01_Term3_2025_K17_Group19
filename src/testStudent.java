import java.util.ArrayList;
import java.util.Scanner;

public class testStudent {
    ArrayList<Student> sl = new ArrayList<Student>();

    public void testEditDelete() {

        ArrayList<Student> sl = new ArrayList<Student>();
        Student s1 = new Student("Nguyen Thi Lan Anh", 12345);
        Student s2 = new Student("Tran Van Minh", 2);
        Student s3 = new Student("Nguyen An", 101010);

        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        StudentList stuList = new StudentList();
        stuList.addStudent(s1);
        stuList.addStudent(s2);
        stuList.addStudent(s3);

        // cap nhat thong tin

        System.out.println("Enter student ID");
        Scanner studentID = new Scanner(System.in);

        int s = studentID.nextInt();

        System.out.println("Enter student fullname");

        Scanner fullname = new Scanner(System.in); // Create a Scanner object

        String newName = fullname.nextLine();

        stuList.getEditStudent(newName, s);

        stuList.printStudentList();

        System.out.print("test xoa:");

       
        System.out.println("Enter student ID");
        Scanner ID = new Scanner(System.in);

        int studentDel = ID.nextInt();
        stuList.getDeleteStudent(studentDel);
        System.out.print("danh sach sau khi xoa:");
        stuList.printStudentList();
       
    }

   

}