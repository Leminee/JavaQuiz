package mvc;

import quiz.Question;
import quiz.Storage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class QuizModel implements ActionListener {

    private int seconds = 10;
    private static int correctAnswers = 0;
    private int index;
    private char answer;
    private final int ALL_QUESTIONS = Question.questions.length;
    QuizView quizView = new QuizView();

    public QuizModel() throws IOException {
    }

    public void QuizView() throws IOException {
    }

    Timer timer = new Timer(1000, e -> {
        seconds--;
        quizView.getSecondsLeft().setText(String.valueOf(seconds));
        if(seconds <= 0 ) {
            displayAnswer();
        }
    });

    public void nextQuestion() throws IOException {
        if (index >= ALL_QUESTIONS) {
            results();

        } else {

            quizView.getTextArea().setText("Fragen " + (index + 1));
            quizView.getTextArea().setText(Question.questions[index]);
            quizView.getAnswerA().setText(Question.options[index][0]);
            quizView.getAnswerB().setText(Question.options[index][1]);
            quizView.getAnswerC().setText(Question.options[index][2]);
            timer.start();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        quizView.getButtonA().setEnabled(false);
        quizView.getButtonB().setEnabled(false);
        quizView.getAnswerC().setEnabled(false);

        if (e.getSource() == quizView.getButtonA()) {
            answer = 'A';
            if (answer == Question.answers[index]) {
                correctAnswers++;
            }
        }
        if (e.getSource() == quizView.getButtonB()) {
            answer = 'B';
            if (answer == Question.answers[index]) {
                correctAnswers++;
            }
        }
        if (e.getSource() == quizView.getButtonC()) {
            answer = 'C';
            if (answer == Question.answers[index]) {
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

        if(Question.answers[index] != 'A')
            quizView.getAnswerA().setForeground(QuizView.RED);
        if(Question.answers[index] != 'B')
            quizView.getAnswerB().setForeground(QuizView.RED);
        if(Question.answers[index] != 'C')
            quizView.getAnswerC().setForeground(QuizView.RED);

        Timer pause = new Timer(2000, e -> {

            quizView.getAnswerA().setForeground(QuizView.GREEN);
            quizView.getAnswerB().setForeground(QuizView.GREEN);
            quizView.getAnswerC().setForeground(QuizView.GREEN);

            answer = ' ';
            seconds = 10;
            quizView.getSecondsLeft().setText(String.valueOf(seconds));
            quizView.getButtonA().setEnabled(true);
            quizView.getButtonB().setEnabled(true);
            quizView.getButtonC().setEnabled(true);
            index++;

            try {
                nextQuestion();

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        pause.setRepeats(false);
        pause.start();
    }


    public void results()  {

        Storage storage = new Storage();

        storage.storeData();
        storage.readData();
        storage.calculateAverage();

        quizView.getButtonA().setEnabled(false);
        quizView.getButtonB().setEnabled(false);
        quizView.getButtonC().setEnabled(false);

        int amount = storage.getAverageCorrectAnswers();
        quizView.getTextField().setText("Quiz Ergebnis");
        quizView.getTextArea().setText("Im Durchschnitt haben Spieler " + amount + " richtige Antworten");
        quizView.getAnswerA().setText("");
        quizView.getAnswerB().setText("");
        quizView.getButtonC().setText("");

        quizView.getNumberRight().setText(correctAnswers + "/" + ALL_QUESTIONS);
        quizView.add(quizView.getNumberRight());
        quizView.getNumberRight().setText("0");

    }

}