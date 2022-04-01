import java.util.Scanner;

/**
 * Class for user interaction
 *
 * @author Aaron Boes
 */

public class Menu {

    /**
     * General Menu:
     *
     *      0 - option[0]
     *      1 - option[1]
     *      2 - option[2]
     *      .   .   .   .
     *      .   .   .   .
     *      .   .   .   .
     *
     * Returns user response.
     * user response is always valid.
     */
    public int optionMenu(String[] options, Scanner scanner) {
        while (true) {
            for (int i = 0; i < options.length; i++) {
                System.out.printf("%d - %s\n", i, options[i]);
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
