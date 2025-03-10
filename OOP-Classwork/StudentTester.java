import java.util.*;
public class StudentTester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
       
        System.out.println("Enter your name: ");
            s1.set_name(sc.nextLine());
        System.out.println("Enter your GPA: ");
            s1.set_gpa(sc.nextDouble());
            sc.nextLine();
        System.out.println("Enter your age: ");
            s1.set_age(sc.nextInt());
            sc.nextLine();

        System.out.println("Data entered for student one.\n");

        System.out.println("Enter your name: ");
            s2.set_name(sc.nextLine());
        System.out.println("Enter your GPA: ");
            s2.set_gpa(sc.nextDouble());
            sc.nextLine();
        System.out.println("Enter your age: ");
            s2.set_age(sc.nextInt());
            sc.nextLine();

        System.out.println("Data entered for student two.\n");


        System.out.println("Student one's name: " + s1.get_name());
        System.out.println("Student one's GPA: " + s1.get_gpa());
        System.out.println("Student one's age: " + s1.get_age());

        System.out.println();

        System.out.println("Student two's name: " + s2.get_name());
        System.out.println("Student two's GPA: " + s2.get_gpa());
        System.out.println("Student two's age: " + s2.get_age());

        System.out.println();

        s1.set_gpa(4.0);
        System.out.println("Student ones new GPA is now a " +s1.get_gpa());
        System.out.println("Student one's GPA: " + s1.get_gpa());
    }
}   
