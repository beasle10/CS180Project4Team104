/**
 * Class for all File Input
 *
 * @author Aaron Boes
 */
public class FileAccessor {
    // UserType named variables
    public static final boolean TEACHER = true;
    public static final boolean STUDENT = false;

    /**
     * Takes a username, password and userType (true = teacher)
     * Returns userID if username and password are associated with an account of the given type
     * Else throws UserNotFoundException
     */
    public int userCheck(String username, String password, boolean userType) throws UserNotFoundException {
        return 0;
    }

    /**
     * Return a list of every quiz
     *
     * Format:
     *      QuizName|QuizNum
     */
    public String[] getQuizList() {
        return null;
    }

    /**
     * Return the Name of the quizNum.
     * Throws QuizNotFound Exception if quizNum is invalid.
     */
    public String getQuizName(int quizNum) throws QuizNotFoundException {
        return null;
    }

    /**
     * Return the quizNums corresponding to a quizName.
     * Throws QuizNotFound Exception if quizName is invalid. (none are found)
     */
    public int[] getQuizName(String quizName) throws QuizNotFoundException {
        return null;
    }

    /**
     * Takes quizNum and userType
     *
     * Format:
     *  String[0]:      QuizName|NumQuestions|RandomizationInformation
     *  String[1+]:     QuestionNum|Prompt|Type|TypeInformation
     *
     * If no quiz exists associated with quizNum throws QuizNotFoundException
     */
    public String[] getQuiz(int quizNum, boolean userType) throws QuizNotFoundException {
        return null;
    }

    /**
     * Takes the quizNum and the userID
     * Returns String[] of student answers
     * If quizNum not associated with a quiz throws QuizNotFoundException
     * If userID not associated with quiz throw UserNotFoundException
     */
    public String[] getStudentAnswers(int quizNum, int userID) throws QuizNotFoundException, UserNotFoundException {
        return null;
    }

    /**
     * Takes the quizNum
     * Returns String[][] of student answers,
     *
     *      Format: String[Student][Answers]
     *
     * If quizNum not associated with a quiz throws QuizNotFoundException
     * If no students associated with quiz return null
     */
    public String[][] getAnswers(int quizNum) throws QuizNotFoundException {
        return null;
    }

    /**
     * Takes quizNum and userID
     * Returns double of student grade
     * If quizNum not associated with a quiz throws QuizNotFoundException
     * If userID not associated with quiz throws UserNotFoundException
     */
    public double getGrade(int quizNum, int userID) throws QuizNotFoundException, UserNotFoundException {
        return 0;
    }
}
