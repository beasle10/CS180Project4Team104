import java.util.Scanner;

/**
 * Class to handle teachers
 */

public class TeacherPortal {
    private static final boolean USER_TYPE = FileAccessor.TEACHER;

    public static void start(int userID, Scanner scan) {
        String[] options = new String[]{"Quiz Menu", "Grade Menu", "User Menu", "Quit"};
        while (true) {
            switch (Menu.optionMenu(options, scan)) {
                case 1:
                    if (!quizMenu(userID, scan))
                        return;
                    break;
                case 2:
                    if (!gradeMenu(userID, scan))
                        return;
                    break;
                case 3:
                    if (!userMenu(userID, scan))
                        return;
                    break;
                case 4:
                    return;
            }
        }
    }

    public static boolean quizMenu(int userID, Scanner scan) {
        return true;
    }

    public static boolean gradeMenu(int userID, Scanner scan) {
        return true;
    }

    public static boolean userMenu(int userID, Scanner scan) {
        return true;
    }
}
