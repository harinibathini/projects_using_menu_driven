package studentmanagement;
import java.util.*;

public class Student {
    public int rollNo;
    public String name;
    public String division;
    public int age;
    public String address;


    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", division='" + division + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    List<Student> studentDetails = new ArrayList<>();

    public void inputStudentDetails(){
                   Scanner sc = new Scanner(System.in);

                    System.out.println("Enter Student RollNo--");
                    rollNo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Student Name--");
                    name = sc.nextLine();
                    System.out.println("Enter Student Division--");
                    division = sc.nextLine();
                    System.out.println("Enter Student Age--");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Student Address--");
                    address = sc.nextLine();

    }
    public void addStudent(){
        Student student = new Student();
        studentDetails.add(student);
    }
    public void displayStudents(){
        for(int i=0;i<studentDetails.size();i++) {
            for (Student a : studentDetails) {
                System.out.println(a);
            }
        }
    }

}
//    Scanner sc = new Scanner(System.in);
//    List<AddStudent> studentDetails = new ArrayList<>();
//    AddStudent Student;
//        Student = new AddStudent(1,"Harini","B",22,"Pune");
//                //studentDetails.add(AddStudent);
//                System.out.println(studentDetails);
//AddStudent addStudent = new AddStudent(sc.nextInt(),sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextLine());
// studentDetails.add(addStudent);
//    TreeSet<Integer> rollNoSet = new TreeSet<Integer>();
//    TreeSet<String> nameSet = new TreeSet<String>();
//    TreeSet<String> divisionSet = new TreeSet<String>();
//    TreeSet<Integer> ageSet = new TreeSet<Integer>();
//    TreeSet<String> addressSet = new TreeSet<String>();
//        System.out.println("Enter the Student Roll no: ");
//        rollNo = sc.nextInt();
//        System.out.println("Enter student Name: ");
//        name = sc.nextLine();
//        System.out.println("Enter student Division: ");
//        division = sc.nextLine();
//        System.out.println("Enter student Age: ");
//        age = sc.nextInt();
//        System.out.println("enter student Address: ");
//        address = sc.nextLine();
//public void addStudentDetails() {
//    Scanner sc = new Scanner(System.in);
//    boolean flag1 = true;
//    while (flag1) {
//        System.out.println("Enter 'yes' to add a Student and 'no' to exit");
//        String choice1 = sc.nextLine();
//        switch (choice1) {
//            case "yes":
//                System.out.println("Enter the student details--");
//                inputDetails();
//                break;
//            case "no":
//                System.out.println("Exit--");
//                flag1 = false;
//            default:
//                System.out.println("--Please enter a valid choice--");
//        }
//    }
//}

//    boolean flag1 = true;
//                    while(flag1) {
//                            System.out.println("-- Enter 'yes' to add a Student and 'no' to exit --");
//                            sc.nextLine();
//                            String choice1 = sc.nextLine();
//                            switch (choice1) {
//                            case "yes":
//                            System.out.println("------------------------------");
//                            System.out.println("enter the Details as prompted:");
//                            student.inputDetails();
//                            studentDetails.add(student);
//                            System.out.println("------------------------------");
//                            break;
//                            case "no":
//                            System.out.println("-- exiting from AddStudent--");
//                            flag1 = false;
//                            break;
//default:
//        System.out.println("enter a valid choice");
//        break;
//        }
//        }
//        System.out.println(studentDetails);
//
//        break;

//    public Student(int rollNo,String name,String division,int age,String address){
//        this.rollNo = rollNo;
//        this.name = name;
//        this.division = division;
//        this.age = age;
//        this.address = address;
//    }