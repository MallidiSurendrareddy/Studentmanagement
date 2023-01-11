import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("hi");

        List<Student> array = new ArrayList<>();

        while (1>0) {
            System.out.println("--------Welcome to the Student Management System--------");
            System.out.println("1 Add Students");
            System.out.println("2 Delete Students");
            System.out.println("3 Modify Students");
            System.out.println("4 View all students");
            System.out.println("5 Sign out");
            System.out.println("Please enter your choice:");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    add(array);
                    break;
                case 2:
                    delete(array);
                    break;
                case 3:
                    update(array);
                    break;
                case 4:
                    selectAll(array);
                    break;
                case 5:
                    System.out.println("Thank you for using");
                    break ;
            }

        }
    }

    private static void add(List<Student> array) {
        //   String sid = null;
        while (true) {
            System.out.println("Please enter the student's number:");
            String  sid = sc.next();
            if (hasSid(array, sid)) {
                System.err.println("The number you entered has been occupied. Please re-enter the number");
            } else {
                break;
            }
        }
        System.out.println("enter student id");
        String sid = sc.next();
        System.out.println("enter student name");
        String name = sc.next();
        System.out.println("enter student address");
        String address = sc.next();
        System.out.println("enter student mobile");
        long mobile = sc.nextLong();
        System.out.println("enter student aadhar number");
        long adhar_no = sc.nextLong();
        System.out.println("enter student class");
        int Class1 = sc.nextInt();
        Student student = new Student(sid, name, address,mobile,adhar_no,Class1);
        array.add(student);
        System.out.println("Successful addition of student information");
    }
    //View Students
    private static void selectAll(List<Student> array) {
        if (array.isEmpty()) {
            System.err.println("No information, Please add message and query again!");
            return;
        }

        System.out.println("student id\t\t Full name\t\t Residence\t\t mobile\t\t aadhar \t\t class\n" );

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t"  + s.getAddress()+"\t\t" +s.getMobile()+"\t\t"+s.getAdhar_no()+"\t\t" +s.getClass1());
        }
    }
    //Delete Students
    private static void delete(List<Student> array) {
        String sid;
        while(true) {
            System.out.println("Please enter the student number to delete");
            sid = sc.next();
            if (!hasSid(array, sid)) {
                System.err.println("This information does not exist, please re-enter it");
            } else {
                break;
            }
        }
        for(int i=0; i<array.size(); i++) {
            if(sid.equals(array.get(i).getSid())) {
                array.remove(i);
            }
        }
        System.out.println("Student Information Deleted Successfully");
    }
    //Modify Student Information
    private static void update(List<Student> array) {
        //String sid;
        while(true) {
            System.out.println("Please enter the student number to modify the information");
            String  sid = sc.next();
            if (!hasSid(array, sid)) {
                System.err.println("This information does not exist, please re-enter it");
            } else {
                break;
            }
        }
        System.out.println("enter student id");
        String sid = sc.next();
        System.out.println("enter student name");
        String name = sc.next();
        System.out.println("enter student address");
        String address = sc.next();
        System.out.println("enter student mobile");
        long mobile = sc.nextLong();
        System.out.println("enter student aadhar number");
        long adhar_no = sc.nextLong();
        System.out.println("enter student class");
        int Class1 = sc.nextInt();
        Student student = new Student(sid, name, address,mobile,adhar_no,Class1);
        for(int i=0; i<array.size(); i++) {
            if(sid.equals(array.get(i).getSid())) {
                array.set(i,student);
            }
        }
        System.out.println("Successful Student Information Modification");
    }

    private static boolean hasSid(List<Student> array, String sid) {
        for(int i=0; i<array.size(); i++) {
            if(sid.equals(array.get(i).getSid())) {
                return true;
            }
        }
        return false;
    }

}
