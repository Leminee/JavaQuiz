package pr;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizModel extends Question implements ActionListener {

    QuizView quizView = new QuizView();
    private int seconds = 30;
    private int correctAnswers = 0;
    private int index;
    private char answer;
    private final int ALL_QUESTIONS = questions.length;

    Timer timer = new Timer(1000, e -> {
        seconds--;
        quizView.getSecondsLeft().setText(String.valueOf(seconds));
        if(seconds<=0) {
            displayAnswer();
        }
    });

    public void nextQuestion() {
        if (index >= ALL_QUESTIONS) {
            results();

        } else {

            System.out.println("test");

            quizView.getTextArea().setText("Fragen " +(index + 1));
            quizView.getTextArea().setText(questions[index]);
            quizView.getAnswerA().setText(options[index][0]);
            quizView.getAnswerB().setText(options[index][1]);
            quizView.getAnswerC().setText(options[index][2]);
            timer.start();

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        quizView.getButtonA().setEnabled(false);
        quizView.getButtonB().setEnabled(false);
        quizView.getButtonC().setEnabled(false);

        if (e.getSource() == quizView.getButtonA()) {
            answer = 'A';
            if (answer == answers[index]) {
                correctAnswers++;
            }
        }
        if (e.getSource() == quizView.getButtonA()) {
            answer = 'B';
            if (answer == answers[index]) {
                correctAnswers++;
            }
        }
        if (e.getSource() == quizView.getButtonB()) {
            answer = 'C';
            if (answer == answers[index]) {
                correctAnswers++;
            }
        }
        displayAnswer();
    }


    public void displayAnswer() {

        timer.stop();

        quizView.getButtonA().setEnabled(false);
        quizView.getButtonB().setEnabled(false);
        quizView.getButtonC().setEnabled(false);

        if(answers[index] != 'A')
           quizView.getAnswerA().setForeground(QuizView.RED);
        if(answers[index] != 'B')
            quizView.getAnswerB().setForeground(QuizView.RED);
        if(answers[index] != 'C')
            quizView.getButtonC().setForeground(QuizView.RED);

        Timer pause = new Timer(2000, e -> {

            quizView.getAnswerA().setForeground(QuizView.GREEN);
            quizView.getAnswerB().setForeground(QuizView.GREEN);
            quizView.getButtonC().setForeground(QuizView.GREEN);

            answer = ' ';
            seconds=10;
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


    public void results() {

        quizView.getButtonA().setEnabled(false);
        quizView.getAnswerB().setEnabled(false);
        quizView.getAnswerC().setEnabled(false);

        int result = (int) ((correctAnswers / (double) ALL_QUESTIONS) * 100);

        quizView.getTextField().setText("QuizView Ergebnis");
        quizView.getTextArea().setText("");
        quizView.getAnswerA().setText("");
        quizView.getAnswerB().setText("");
        quizView.getAnswerC().setText("");

        quizView.getNumberRight().setText(correctAnswers + "/" + ALL_QUESTIONS);
        quizView.getPercentage().setText(result + "%");

        quizView.add(quizView.getNumberRight());
        quizView.add(quizView.getPercentage());

    }

}