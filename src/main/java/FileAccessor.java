/**
 * Class for all File Input
 *
 * @version 3/31/2022
 * @author Aaron Boes
 */
public class FileAccessor {

    /**
     * Takes a username, password and userType (true = teacher)
     * Returns userID if username and password are associated with an account of the given type
     * Else throws UserNotFoundException
     */
    public int userCheck(String username, String password, boolean userType) throws UserNotFoundException {
        return 0;
    }

    /**
     * Takes quizNum and userType
     * Returns String[] of quiz questions, with answers if userType == true (teacher)
     * If no quiz exists associated with quizNum throws QuizNotFoundException
     */
    public String[] getQuiz(int quizNum, boolean userType) throws QuizNotFoundException {
        return null;
    }

    /**
     * Takes the quizNum and the userID
     * Returns String[] of student answers
     * If quizNum not associated with a quiz throws QuizNotFoundException
     * If userID not associated with quiz return null
     */
    public String[] getStudentAnswers(int quizNum, int userID) throws QuizNotFoundException, UserNotFoundException {
        return null;
    }

    /**
     * Takes the quizNum
     * Returns String[][] of student answers, Format: String[Student][Answers]
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
