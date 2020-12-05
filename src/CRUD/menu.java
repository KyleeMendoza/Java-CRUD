package CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu {
	//Create account arraylist objects to store future objects
	List<account> allAccounts = new ArrayList<account>();
	Scanner keyboardInput = new Scanner(System.in);

	public void dialog() {
		
		System.out.println("----------------------------------------");
		System.out.println("\nWELCOME TO CRUD SYSTEM \n");
		System.out.print("1.Create account\n2.Read list account\n3.Update account\n4.Delete account\n\nEnter desired choice: ");
		int choice = keyboardInput.nextInt();
		switch(choice) {
		case 1:
			createAccount();
			break;
		case 2:
			readAccount();
			break;
		case 3:
			updateAccount();
			break;
		case 4:
			deleteAccount();
			break;
		default:
			System.out.print("Invalid Entry!!");
			pressAnyKeyToContinue();
			break;
		}
	}
	//method for defualt key
	private void pressAnyKeyToContinue() {
		
		System.out.println("\nPress Enter key to continue...");
        try
        {
            System.in.read();
            dialog();
        }  
        catch(Exception e)
        {}
	 }
	
	public void createAccount() {
		System.out.println("----------------------------------------");
		System.out.println("\n<CREATING ACCOUNT>\n\n");
		System.out.print("Enter First Name: ");
		String Fname = keyboardInput.next();
		System.out.print("Enter Last Name: ");
		String Lname = keyboardInput.next();
		System.out.print("Enter Username: ");
		String username = keyboardInput.next();
		System.out.print("Enter Password: ");
		String password = keyboardInput.next();
		//Check for no duplication of username
		for (int i = 0; i<allAccounts.size(); i++) {
			if (username.equals(allAccounts.get(i).getUsername())) {
				System.out.println("Username is already taken...\nPlease try again.\n");
				createAccount();
			}
		}
		allAccounts.add(new account(Fname, Lname, username, password));
		System.out.print("\nSuccessfully Created!");
		pressAnyKeyToContinue();
	}
	public void readAccount() {	
		System.out.println("----------------------------------------");
		System.out.println("\n<DISPLAY ALL ACCOUNT>\n\n");
		System.out.print("\nMembers Registered: " + allAccounts.size());

		if(allAccounts.size() == 0) {
			System.out.println("\nThere is no registered account");
			pressAnyKeyToContinue();
		}
		else {
			System.out.print("\nfirstName\tlastName\tUsername\tPassword");
			for (int i = 0; i<allAccounts.size(); i++) {
				System.out.print("\n" + allAccounts.get(i).getFname() + "\t\t" + allAccounts.get(i).getLname() + "\t\t" + allAccounts.get(i).getUsername() + "\t\t" + allAccounts.get(i).getPassword());
			}
			pressAnyKeyToContinue();
		}
		
	}
	public void updateAccount() {
		System.out.println("----------------------------------------");
		System.out.println("\n<UPDATE ACCOUNT>\n\n");
		if (allAccounts.size() == 0) {
			System.out.print("There is no account registered...\n");
			pressAnyKeyToContinue();
		}
		System.out.print("Enter username: ");
		String newUsername = keyboardInput.next();
		for (int i = 0; i<allAccounts.size(); i++) {
			if (newUsername.equals(allAccounts.get(i).getUsername())) {
				System.out.println("\nAccount Found!");
				System.out.print("\nfirstName\tlastName\tUsername\tPassword");
				System.out.print("\n" + allAccounts.get(i).getFname() + "\t\t" + allAccounts.get(i).getLname() + "\t\t" + allAccounts.get(i).getUsername() + "\t\t" + allAccounts.get(i).getPassword() + "\n");
				System.out.print("\nEnter First Name: ");
				String Fname = keyboardInput.next();
				System.out.print("Enter Last Name: ");
				String Lname = keyboardInput.next();
				System.out.print("Enter Username: ");
				String username = keyboardInput.next();
				System.out.print("Enter Password: ");
				String password = keyboardInput.next();
				//Check for no duplication of username
				for (int j = 0; j<allAccounts.size(); j++) {
					if (username.equals(allAccounts.get(j).getUsername())) {
						System.out.println("Username is already taken...\nPlease try again.\n");
						updateAccount();
					}
				}
				//remove old account
				allAccounts.remove(i);
				//update new entered account
				allAccounts.add(new account(Fname, Lname, username, password));
				System.out.print("\nSuccessfully Updated!");
				pressAnyKeyToContinue();
			}
		}
		System.out.print("\nAccount not found!");
		pressAnyKeyToContinue();
	}
	public void deleteAccount() {
		System.out.println("----------------------------------------");
		System.out.println("\n<DELETE ACCOUNT>\n\n");
		if (allAccounts.size() == 0) {
			System.out.print("There is no account registered...\n");
			pressAnyKeyToContinue();
		}
		System.out.print("Enter username: ");
		String newUsername = keyboardInput.next();
		for (int i = 0; i<allAccounts.size(); i++) {
			if (newUsername.equals(allAccounts.get(i).getUsername())) {
				//display account to be deleted
				System.out.println("\nAccount Found!");
				System.out.print("\nfirstName\tlastName\tUsername\tPassword");
				System.out.print("\n" + allAccounts.get(i).getFname() + "\t\t" + allAccounts.get(i).getLname() + "\t\t" + allAccounts.get(i).getUsername() + "\t\t" + allAccounts.get(i).getPassword() + "\n");
				allAccounts.remove(i);
				System.out.print("\nSuccessfully Deleted!");
				pressAnyKeyToContinue();
			}
		}
		System.out.print("\nAccount not found!");
		pressAnyKeyToContinue();
	}
	
}






















