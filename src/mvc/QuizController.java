package mvc;


public class QuizController {

    private QuizView quizView;
    private QuizModel quizModel;

    public QuizController(QuizView quizView, QuizModel quizModel) {
        this.quizView = quizView;
        this.quizModel = quizModel;

    }
}
