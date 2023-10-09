package onlineResumeBuilder;
import java.util.Scanner;

class Resume {
    private String name;
    private String qualification;
    private String certifications;
    private String hobbies;
    private String workExperience;
    private int age;
    private String email;
    private String contact;
    private String currentWorkplace;

    public Resume(String name, String qualification, String certifications, String hobbies, String workExperience,
                  int age, String email, String contact, String currentWorkplace) {
        this.name = name;
        this.qualification = qualification;
        this.certifications = certifications;
        this.hobbies = hobbies;
        this.workExperience = workExperience;
        this.age = age;
        this.email = email;
        this.contact = contact;
        this.currentWorkplace = currentWorkplace;
    }

    public void displayResume() {
        System.out.println("\n======== Resume ========");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Qualification: " + qualification);
        System.out.println("Certifications: " + certifications);
        System.out.println("Hobbies: " + hobbies);
        System.out.println("Work Experience: " + workExperience);
        System.out.println("Email: " + email);
        System.out.println("Contact: " + contact);
        System.out.println("Current Workplace: " + currentWorkplace);
        System.out.println("=========================");
    }
}

public class Main {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Age: ");
	        int age = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        System.out.print("Enter Qualification: ");
	        String qualification = scanner.nextLine();

	        System.out.print("Enter Certifications: ");
	        String certifications = scanner.nextLine();

	        System.out.print("Enter Hobbies: ");
	        String hobbies = scanner.nextLine();

	        System.out.print("Enter Work Experience: ");
	        String workExperience = scanner.nextLine();

	        System.out.print("Enter Email: ");
	        String email = scanner.nextLine();

	        System.out.print("Enter Contact: ");
	        String contact = scanner.nextLine();

	        System.out.print("Enter Current Workplace: ");
	        String currentWorkplace = scanner.nextLine();

	        Resume resume = new Resume(name, qualification, certifications, hobbies, workExperience, age, email, contact, currentWorkplace);
	        resume.displayResume();
		

	}

}
