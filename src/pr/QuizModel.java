package pr;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizModel extends Question implements ActionListener {

    private int seconds = 30;
    private int correctAnswers = 0;
    private int index;
    private char answer;
    private final int allQuestions = questions.length;



    QuizView quizView = new QuizView();

    Timer timer = new Timer(1000, e -> {
        seconds--;
        quizView.getSecondsLeft().setText(String.valueOf(seconds));
        if (seconds <= 0) {
            displayAnswer();
        }
    });


    public void nextQuestion() {

        if (index >= allQuestions) {
            results();

        } else {

            quizView.getTextArea().setText("Fragen " + (index + 1));
            quizView.getTextArea().setText(questions[index]);
            quizView.getAnswerA().setText(options[index][0]);
            quizView.getAnswerB().setText(options[index][1]);
            quizView.getAnswerC().setText(options[index][2]);

            timer.start();
        }
    }

    public void results() {

        quizView.getButtonA().setEnabled(false);
        quizView.getAnswerB().setEnabled(false);
        quizView.getAnswerC().setEnabled(false);

        int result = (int) ((correctAnswers / (double) allQuestions) * 100);

        quizView.getTextField().setText("QuizView Ergebnis");
        quizView.getTextArea().setText("");
        quizView.getAnswerA().setText("");
        quizView.getAnswerB().setText("");
        quizView.getAnswerC().setText("");

        quizView.getNumberRight().setText(correctAnswers + "/" + allQuestions);
        quizView.getPercentage().setText(result + "%");

        quizView.getFrame().add(quizView.getNumberRight());
        quizView.getFrame().add(quizView.getPercentage());

    }

    public void displayAnswer() {

        timer.stop();

        quizView.getButtonA().setEnabled(false);
        quizView.getButtonB().setEnabled(false);
        quizView.getButtonC().setEnabled(false);

        if (Question.answers[index] != 'A')
            quizView.getAnswerA().setForeground(quizView.getRed());
        if (Question.answers[index] != 'B')
            quizView.getAnswerB().setForeground(quizView.getRed());
        if (Question.answers[index] != 'C')
            quizView.getAnswerC().setForeground(quizView.getRed());

        Timer pause = new Timer(2000, e -> {

            quizView.getAnswerA().setForeground(quizView.getGreen());
            quizView.getButtonB().setForeground(quizView.getGreen());
            quizView.getButtonC().setForeground(quizView.getGreen());

            answer = ' ';
            seconds = 30;
            quizView.getSecondsLeft().setText(String.valueOf(seconds));
            quizView.getButtonA().setEnabled(true);
            quizView.getButtonB().setEnabled(true);
            quizView.getButtonC().setEnabled(true);
            index++;
            nextQuestion();
        });
        pause.setRepeats(false);
        pause.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        QuizView quizView = new QuizView();

        quizView.getButtonA().setEnabled(false);
        quizView.getButtonB().setEnabled(false);
        quizView.getButtonC().setEnabled(false);

        if (e.getSource() == quizView.getButtonA()) {
            answer = 'A';
            if (answer == Question.answers[index]) {
                correctAnswers++;
            }
        }
        if (e.getSource() == quizView.getButtonA()) {
            answer = 'B';
            if (answer == Question.answers[index]) {
                correctAnswers++;
            }
        }
        if (e.getSource() == quizView.getButtonB()) {
            answer = 'C';
            if (answer == Question.answers[index]) {
                correctAnswers++;
            }
        }

        displayAnswer();

        nextQuestion();

    }

}
