/**
 * Class for all File Output
 *
 * @version 3/31/2022
 * @author Aaron Boes
 */
public class FileEditor {

    /**
     * Takes username, password, and userType
     * Returns false if username is already taken
     * Else returns true
     */
    public boolean createUser(String username, String password, boolean userType) {
        return true;
    }

    /**
     * Takes Quiz in format:
     *      quiz[0]:      QuizName,NumQuestions,RandomizationInformation
     *      quiz[1+]:     QuestionNum,Prompt,Type,TypeInformation
     *  Writes QuizFile
     *
     *  Returns true on creation of new quiz
     *  Returns false if file cannot be written
     */
    public boolean createQuiz(String[] quiz) {
        return true;
    }

    /**
     * Takes quizNum and quiz.
     * Quiz in format:
     *      quiz[0]:      QuizName,NumQuestions,RandomizationInformation
     *      quiz[1+]:     QuestionNum,Prompt,Type,TypeInformation
     *  Writes QuizFile
     *
     *  Returns true on modification of quiz
     *  Returns false if file cannot be written
     *  Throws QuizNotFoundException if quizNum does not correspond to an existing quiz
     */
    public boolean modifyQuiz(int quizNum, String[] quiz) throws QuizNotFoundException {
        return true;
    }

    /**
     * Takes userID, quizNum and answers
     *
     * Returns true if addition is successful
     * Returns false if file cannot be written to
     * Throws QuizNotFoundException if quizNum does not correspond to an existing quiz
     */
    public boolean addAnswers(int userID, int quizNum, String[] answers) throws QuizNotFoundException {
        return true;
    }

    /**
     * Takes userID, quizNum, and grade
     *
     * Returns true if addition is successful
     * Returns false if file cannot be written to
     *
     * Automatically creates new GradeFile if one is not found
     */
    public boolean addGrade(int userID, int quizNum, double grade) {
        return true;
    }

    /**
     * Takes userID, quizNum, and grade
     *
     * Returns true if addition is successful
     * Returns false if file cannot be written to
     * Throws QuizNotFoundException if quizNum does not correspond to an existing quiz grade
     * throws UserNotFoundException if userID does not correspond to an existing GradeFile
     */
    public boolean modifyGrade(int userID, int quizNum, double grade) throws UserNotFoundException, QuizNotFoundException {
        return true;
    }
}
