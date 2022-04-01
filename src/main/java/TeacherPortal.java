import java.util.Scanner;

/**
 * Class to handle teachers
 *
 * Only one should exist
 * @author Aaron Boes
 */

public class TeacherPortal {
    private static final boolean USER_TYPE = FileAccessor.TEACHER;
    private static final Menu menu = new Menu();

    /**
     * The start menu:
     *
     *      0 - Quiz Menu
     *      1 - Grade Menu
     *      2 - User Menu
     *      3 - Quit
     */
    public void start(int userID, Scanner scan) {
        String[] options = new String[]{"Quiz Menu", "Grade Menu", "User Menu", "Quit"};
        while (true) {
            switch (menu.optionMenu(options, scan)) {
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
     *
     *      0 - View Quiz
     *      1 - Modify Quiz
     *      2 - Create Quiz
     *      3 - Delete Quiz
     *      4 - Back
     *
     * Returns false to exit program
     */
    public boolean quizMenu(int userID, Scanner scan) {
        String[] options = new String[]{"View Quiz", "Modify Quiz", "Create Quiz", "Delete Quiz", "Back", "Quit"};
        while (true) {
            switch (menu.optionMenu(options, scan)) {
                case 0:
                    quizView(userID, scan);
                    break;
                case 1:
                    quizModify(userID, scan);
                    break;
                case 2:
                    quizCreate(userID, scan);
                    break;
                case 3:
                    quizDelete(userID, scan);
                    break;
                case 4:
                    return true;
                case 5:
                    return false;
            }
        }
    }

    public void quizView(int userID, Scanner scan) {
        String[] options = new String[]{"view Another Quiz", "Modify Quiz", "Delete Quiz", "back"};
        Quiz quiz = quizSearcher(userID, scan);
        // quiz.view
        while (true) {
            switch (menu.optionMenu(options, scan)) {
                case 0:
                    quiz = quizSearcher(userID, scan);
                    // quiz.view
                case 1:
                    modifyMenu(quiz);
                    break;
            }
        }
    }

    /**
     * Quiz Searcher:
     *      0 - Search by Quiz name
     *      1 - Search by QuizID
     *      2 - Back
     */
    public Quiz quizSearcher(int userID, Scanner scan) {
        String[] options = new String[]{"Search by Quiz name", "Search by QuizID", "Back"};
        Quiz quizRet = null;
        while (true) {
            switch (menu.optionMenu(options, scan)) {
                case 0:
                     quizRet = quizSearchName(userID, scan);
                     if (quizRet != null)
                         return quizRet;
                     break;
                case 1:
                    quizRet = quizSearchID(userID, scan);
                    if (quizRet != null)
                        return quizRet;
                    break;
                case 2:
                    return null;
            }
        }
    }

    /**
     * Quiz Search name:
     *      Please enter the name of the Quiz
     *
     */
    public Quiz quizSearchName(int userID, Scanner scan) {
        System.out.println("Please enter the name of the Quiz");
        return null;
    }

    /**
     * Quiz Search ID:
     *      Please enter the QuizID
     *
     */
    public Quiz quizSearchID(int userID, Scanner scan) {
        System.out.println("Please enter the QuizID");
        return null;
    }

    /**
     * GradeMenu:
     *      0 - View Grade Distribution
     *      1 - View Student Grade
     *      2 - Grade Quiz
     *      3 - View Quiz Grade
     *      4 - Back
     *
     * Returns false to exit program
     */
    public boolean gradeMenu(int userID, Scanner scan) {
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
    public boolean userMenu(int userID, Scanner scan) {
        return true;
    }
}
