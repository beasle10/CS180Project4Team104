/**
 * Class for all File Input
 *
 * @version 3/31/2022
 * @author Aaron Boes
 */
public class FileAccessor {

    /**
     * Takes a userName, passWord and userType (true = teacher)
     * Returns true if userName and passWord are associated with an account of the given type
     * else returns false
     */
    public boolean userCheck(String userName, String passWord, boolean userType) {
        return false;
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
     * Takes the quizNum and the studentID
     * Returns String[] of student answers
     * If quizNum not associated with a quiz throws QuizNotFoundException
     * If studentID not associated with quiz return null
     */
    public String[] getStudentAnswers(int quizNum, int studentID) throws QuizNotFoundException {
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
     * Takes quizNum and studentID
     * Returns double of student grade
     * If quizNum not associated with a quiz throws QuizNotFoundException
     * If studentID not associated with quiz return -1
     */
    public double getGrade(int quizNum, int studentID) throws QuizNotFoundException {
        return -1;
    }
}
