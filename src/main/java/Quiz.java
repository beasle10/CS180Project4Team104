import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
*Author Austin Beasley
*
*/
public class Quiz {
    private String name;
    private int numQuestions;
    private int randomizer;
    private ArrayList<String> questionList;

    /**
     * for creating new quizzes
     */

    public Quiz(String name, int numQuestions) {
        this.name = name;
        this.numQuestions = numQuestions;
        int random = (int) (Math.random() * (1000 - 1)) + 1;
        this.randomizer = random;
    }

    /**
     * for reading from a file
     */
    public Quiz(String name, int numQuestions, int randomizer, ArrayList<String> questionList) {
        this.name = name;
        this.numQuestions = numQuestions;
        this.randomizer = randomizer;
        this.questionList = questionList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    public int getRandomizer() {
        return randomizer;
    }

    public void setRandomizer(int randomizer) {
        this.randomizer = randomizer;
    }

    public ArrayList<String> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(ArrayList<String> questionList) {
        this.questionList = questionList;
    }

    public void saveQuiz() throws IOException {
        File quiz = new File(this.getName() + ".txt");
        try {
            if (quiz.createNewFile()) {
                System.out.println("File created: " + quiz.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(quiz))) {

            bw.write(this.toString());
            bw.flush();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return;
        }

        System.out.println("File saved");
    }

    // lets you see all the questions in the format they are saved in the file for easy access.
    public void seeAllQuestion() {
        for (int i = 0 ; i < this.getQuestionList().size() ; i++) {
            System.out.println(this.getQuestionList().get(i));
        }
    }
    public void addQuestion(String question) {
        ArrayList<String> questionList =  this.getQuestionList();
        questionList.add(question);
        this.setQuestionList(questionList);
        System.out.println("Question Added");
    }
    public void removeQuestion(String question) {
        ArrayList<String> questionList =  this.getQuestionList();
        questionList.remove(question);
        this.setQuestionList(questionList);
        System.out.println("Question removed");
    }

    /**
     * this to string is used for saving the quiz not for showing
     * @return
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName() + "," + String.valueOf(this.getNumQuestions()) + "," + String.valueOf(this.getRandomizer()) + "\n");
        for (int i = 0 ; i < this.getQuestionList().size() ; i++){
            sb.append(this.getQuestionList().get(i) + "\n");
        }
        return sb.toString();

    }
}
