package pr;


import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException {

        QuizView quizView = new QuizView();
        quizView.init();

        QuizModel quizModel = new QuizModel();

        QuizController quizController = new QuizController(quizView, quizModel);
        quizView.setVisible(true);
    }
}


