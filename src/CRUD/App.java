package CRUD;
import java.util.Scanner;

public class App {
	
	//MAIN CLASS
	public static void main(String [] args) {
		//Initialized admin password to access crud 
		String adminUsername = "admin";
		String adminPassword = "admin";
		//Creating menu object to access menu methods
		menu menu = new menu();
		int error = 0;
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("<<<LOGIN>>>\n");

		//Login limit to 3 attempt
		while (error != 3) {
			System.out.print("Enter your username: ");
			String username = keyboardInput.nextLine();
			System.out.print("Enter your password: ");
			String password = keyboardInput.nextLine();
			
			if (adminUsername.equals(username) && adminPassword.equals(password)) {
				menu.dialog();
				System.exit(0); 
			}
			else {
				if (error == 2) {
					break;
				}
				else {
					System.out.println("You've entered incorrect username or password! ");
					error++;
				}
			}
		}
		System.out.println("Please try again later....");
		System.exit(0); 
		
	}
}






















