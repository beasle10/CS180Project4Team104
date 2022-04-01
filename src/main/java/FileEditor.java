/**
 * Class for all File Output
 *  only one should exist
 *
 * @version 3/31/2022
 * @author Aaron Boes
 */
public class FileEditor {

    //File formats:
    //  UserFile:
    //      FileName:
    //          UserFile.txt (only one should exist)
    //      Format:
    //          (for each user)
    //          Username|Password|Type|UserID\n
    //      Username - the username used to log in
    //      Password - the password used to log in
    //      Type - the type of the account, true - teacher, false - student
    //      UserID - the ID used by the system
    //
    //  QuizFile:
    //      FileName:
    //          Q[QuizNum].txt
    //      Format:
    //          line0:  QuizName|NumQuestions|RandomizationInformation\n
    //          line1+: QuestionNum|Prompt|Type|TypeInformation\n
    //      QuizName - name of the quiz
    //      NumQuestions - number of questions in the quiz (can be thought of as groups)
    //      RandomizationInformation - information needed for randomization and customization
    //      QuestionNum - question number that this question has a chance of being
    //      Prompt - question text
    //      Type - the type of question
    //      TypeInformation - the information needed for the type of question
    //
    //  QuizAnswerFile:
    //      FileName:
    //          QA[QuizNum].txt
    //      Format:
    //          UserID|Graded|Answers/n
    //      UserID - ID of the user who gave the answers
    //      Graded - true if the Answers have been graded, false if they have not
    //      Answers - '.' separated list of answers
    //
    //  GradeFile:
    //      FileName:
    //          G[UserID].txt
    //      Format:
    //          QuizNum|Grade/n
    //      QuizNum - the ID of the quiz graded
    //      Grade - grade given on quiz
    //
    //  QuizListFile:
    //      FileName:
    //          QuizList.txt (There should only be one)
    //      Format:
    //          QuizNum|QuizName
    //      QuizNum - the ID of the quiz
    //      QuizName - the name of the quiz


    /**
     * Takes username, password, and userType
     * Returns false if username is already taken
     * Else returns true
     */
    public boolean createUser(String username, String password, boolean userType) {
        return true;
    }

    /**
     * Takes userID and new username
     * Returns true if username is changed
     * Else returns false
     *
     * Throws UserNotFoundException if userID does not correspond to an existing user
     */
    public boolean changeUsername(int userID, String username) throws UserNotFoundException {
        return true;
    }

    /**
     * Takes userID and new password
     * Returns true if password is changed
     * Else returns false
     *
     * Throws UserNotFoundException if userID does not correspond to an existing user
     */
    public boolean changePassword(int userID, String password) throws UserNotFoundException {
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
     * Throws UserNotFoundException if userID does not correspond to an existing GradeFile
     */
    public boolean modifyGrade(int userID, int quizNum, double grade) throws UserNotFoundException, QuizNotFoundException {
        return true;
    }
}
