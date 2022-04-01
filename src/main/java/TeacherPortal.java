import java.util.Scanner;

/**
 * Class to handle teachers
 */

public class TeacherPortal {
    private static final boolean USER_TYPE = FileAccessor.TEACHER;

    /**
     * The start menu:
     *      0 - Quiz Menu
     *      1 - Grade Menu
     *      2 - User Menu
     *      3 - Quit
     */
    public static void start(int userID, Scanner scan) {
        String[] options = new String[]{"Quiz Menu", "Grade Menu", "User Menu", "Quit"};
        while (true) {
            switch (Menu.optionMenu(options, scan)) {
                case 0:
                    if (!quizMenu(userID, scan))
                        return;
                    break;
                case 1:
                    if (!gradeMenu(userID, scan))
                        return;
                    break;
                case 2:
                    if (!userMenu(userID, scan))
                        return;
                    break;
                case 3:
                    return;
            }
        }
    }

    /**
     * QuizMenu:
     *      0 - View Quiz
     *      1 - Modify Quiz
     *      2 - Create Quiz
     *      3 - Delete Quiz
     *      4 - Back
     * Returns false to exit program
     */
    public static boolean quizMenu(int userID, Scanner scan) {
        return true;
    }

    /**
     * GradeMenu:
     *      0 - View Grade Distribution
     *      1 - View Student Grade
     *      2 - Grade Quiz
     *      3 - View Quiz Grade
     *      4 - Back
     * Returns false to exit program
     */
    public static boolean gradeMenu(int userID, Scanner scan) {
        return true;
    }

    /**
     * UserMenu:
     *      0 - View User Information
     *      1 - Change Username
     *      2 - Change Password
     *      3 - Back
     * Returns false to exit program
     */
    public static boolean userMenu(int userID, Scanner scan) {
        return true;
    }
}
