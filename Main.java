import java.util.Scanner;

abstract class Info {
    private String subject;
    private String instructor;
    private int duration;

    public String getSubject() {
        return subject;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getDuration() {
        return duration;
    }

    public Info(String subject, String instructor, int duration) {
        this.subject = subject;
        this.instructor = instructor;
        this.duration = duration;
    }

    public abstract void displayDetails();
}

class MathClass extends Info {
    public MathClass(String instructor, int duration) {
        super("Mathematics", instructor, duration);
    }

    @Override
    public void displayDetails() {
        System.out.println("Subject: " + getSubject());
        System.out.println("Instructor: " + getInstructor());
        System.out.println("Duration: " + getDuration() + " hrs");
    }
}

class ScienceClass extends Info {
    public ScienceClass(String instructor, int duration) {
        super("Science", instructor, duration);
    }

    @Override
    public void displayDetails() {
        System.out.println("Subject: " + getSubject());
        System.out.println("Instructor: " + getInstructor());
        System.out.println("Duration: " + getDuration() + " hrs");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("=========================");
        System.out.println("1. Math Coaching Details....");
        System.out.println("2. Science Coaching Details....");
        System.out.println("=========================");
        System.out.print("Enter Your Choice: ");
        int key = sc.nextInt();
        sc.nextLine();  // Consume the newline character after the int input
        System.out.println("=========================");
        System.out.print("Enter Instructor Name: ");
        String instructor = sc.nextLine();  // Read the entire line for the instructor's name
        System.out.println();
        System.out.print("Enter Duration (in hours): ");
        int duration = sc.nextInt();
        Info info = null;
        
        switch (key) {
            case 1:
                info = new MathClass(instructor, duration);
                break;
            case 2:
                info = new ScienceClass(instructor, duration);
                break;
            default:
                System.out.println("Invalid Choice....!");
                break;
        }
        
        if (info != null) {
            System.out.println();
            System.out.println("=========================");
            info.displayDetails();
            System.out.println("=========================");
        }

        sc.close();
    }
}
