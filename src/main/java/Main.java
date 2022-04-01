import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usernames = new ArrayList<>();
        System.out.println("Welcome to the learning management system!");
        do {
            System.out.println("Are you creating, editing, deleting an account? (Enter 1, 2, 3, 4)\n" +
                    "1. Creating an account\n" +
                    "2. Editing an account\n" +
                    "3. Deleting an account\n" +
                    "4. Exit");
            String initialSelection = scanner.nextLine();
            if (initialSelection.equals("1")){
                System.out.println("Please enter Username");
                String username = scanner.nextLine();
                for (int i = 0; i < usernames.size(); i++) {
                    if (usernames.get(i).equals(username)) {
                        System.out.println("Username already taken. Please try again!");
                    }
                }
                System.out.println("Please enter Password");
                String password = scanner.nextLine();
                usernames.add(Integer.parseInt(username),password);
            } else if (initialSelection.equals("2")){

            }

        } while(true);


    }
}
