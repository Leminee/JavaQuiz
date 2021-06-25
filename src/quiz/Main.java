package quiz;

import mvc.QuizView;

import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException {

        QuizModelAndView quizModelAndView = new QuizModelAndView();
        quizModelAndView.init();

       quizModelAndView.setVisible(true);
    }
}


