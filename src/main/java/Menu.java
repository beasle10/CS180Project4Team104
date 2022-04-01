import java.util.Scanner;

public class Menu {

    public static int optionMenu(String[] options, Scanner scanner) {
        while (true) {
            System.out.println("What would you like to do");
            for (int i = 0; i < options.length; i++) {
                System.out.printf("%d - %s", i, options[i]);
            }
            try {
                int ret = Integer.parseInt(scanner.nextLine());
                if (ret >= 0 && ret < options.length)
                    return ret;
                System.out.println("Please enter a valid option");
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer");
            }
        }
    }
}