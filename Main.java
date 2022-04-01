import Project4.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> usernames = new ArrayList<>();
        System.out.println("Welcome to the learning management system!");
        System.out.println("Are you creating, editing, deleting an account? (Enter 1, 2, 3, 4)\n" +
                    "1. Creating an account\n" +
                    "2. Editing an account\n" +
                    "3. Deleting an account\n" +
                    "4. Exit\n");
        String initialSelection = scanner.nextLine();
        if (initialSelection.equals("1")){
            System.out.println("Please enter Username");
            String username = scanner.nextLine();
            

        }




    }
}
