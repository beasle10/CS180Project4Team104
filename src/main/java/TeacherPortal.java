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

    /**
     * QuizView:
     *      quizSearcher
     *      quiz.view
     *      0 - View Another Quiz
     *      1 - Modify Quiz
     *      2 - Delete Quiz
     *      3 - Back
     *
     */
    public void quizView(int userID, Scanner scan) {
        String[] options = new String[]{"view Another Quiz", "Modify Quiz", "Delete Quiz", "Back"};
        Quiz quiz = quizSearcher(userID, scan);
        // quiz.view
        while (true) {
            switch (menu.optionMenu(options, scan)) {
                case 0:
                    quiz = quizSearcher(userID, scan);
                    // quiz.view
                case 1:
                    quizModifyMenu(quiz);
                    break;
                case 2:
                    quizDeleteMenu(quiz);
                    break;
                case 3:
                    return;
            }
        }
    }

    /**
     * QuizModify:
     *      quizSearch
     *      quizModifyMenu
     *      0 - Modify Another Quiz
     *      1 - Back
     */
    public void quizModify(int userID, Scanner scan) {
        String[] options = new String[]{"Modify Another Quiz", "Back"};
        quizModifyMenu(quizSearcher(userID, scan));
        while (true) {
            switch (menu.optionMenu(options, scan)) {
                case 0:
                    quizModifyMenu(quizSearcher(userID, scan));
                    break;
                case 1:
                    return;
            }
        }
    }

    /**
     * QuizModifyMenu:
     *      TODO
     *
     */
    public void quizModifyMenu(Quiz quiz) {

    }

    /**
     * QuizCreate:
     *      0 - Use QuizFile
     *      1 - Create new Quiz
     *      2 - Back
     */
    public void quizCreate(int unitID, Scanner scan) {
        String[] options = new String[]{"Use QuizFile", "Create new Quiz", "Back"};
        String[] options2 = new String[]{"Create another Quiz", "Back"};
        while (true) {
            switch (menu.optionMenu(options, scan)) {
                case 0:
                    quizCreateFile(scan);
                    break;
                case 1:
                    quizCreateNew(scan);
                    break;
                case 2:
                    return;
            }
            switch (menu.optionMenu(options2, scan)) {
                case 0:
                    break;
                case 1:
                    return;
            }
        }
    }

    public void quizCreateFile(Scanner scan) {

    }

    public void quizCreateNew(Scanner scan) {

    }

    /**
     * QuizDelete:
     *      quizSearcher
     *      quizDeleteMenu
     *      0 - Delete Another Quiz
     *      1 - Back
     *
     */
    public void quizDelete(int userID, Scanner scan) {
        String[] options = new String[]{"Delete Another Quiz", "Back"};
        quizDeleteMenu(quizSearcher(userID, scan));
        while (true) {
            switch (menu.optionMenu(options, scan)) {
                case 0:
                    quizModifyMenu(quizSearcher(userID, scan));
                    break;
                case 1:
                    return;
            }
        }
    }

    /**
     * QuizDeleteMenu:
     *      TODO
     *
     */
    public void quizDeleteMenu(Quiz quiz) {
        
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
