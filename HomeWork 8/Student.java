import java.util.Scanner;

public class Student {

    Scanner scanner = new Scanner(System.in);

    private String name;
    private String email;
    private int age;

    public Student(String name, String email, int age){
        this.name = name;
        this.email= email;
        this.age= age;
    }

    public void student_name(){

        System.out.print("Enter the Student's name: ");
        name = scanner.nextLine();

        System.out.println("The Student's name is: " + name);
    }

    public void student_email(){

        System.out.print("\nEnter the Student's email: ");
        email = scanner.nextLine();

        System.out.println("The Student;s email is: " + email);
    }

    public void student_age(){

        System.out.print("\nEnter the Student's age: ");
        age = scanner.nextInt();

        System.out.println("The Student's age is: " + age);
    }

    public static void main(String[] args) {
        
        Student student1 = new Student("null", "null", 0);
        student1.student_name();
        student1.student_email();
        student1.student_age();
    }
    
}