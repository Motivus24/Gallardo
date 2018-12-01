import java.util.Scanner;
public class StudentInformation {

    
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your name:");
	String name = sc.nextLine();
	
	System.out.println("Enter Your Age:");
	int age = sc.nextInt();

	System.out.println("Enter Your Gender: (M/F)");
	char sex = sc.next().charAt(0);

	System.out.println("Your name is "+ name);
	System.out.println("You are "+age+" years old");
	System.out.println("Your gender is "+sex);
	
	
	}
}