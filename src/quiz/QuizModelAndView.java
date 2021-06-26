package quiz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.*;

public class QuizModelAndView extends UnicastRemoteObject implements ActionListener, Serializable,IQuizModelAndView{

    private final JTextField textField = new JTextField();
    private final JTextArea textArea = new JTextArea();
    private final JButton buttonA = new JButton();
    private final JButton buttonB = new JButton();
    private final JButton buttonC = new JButton();
    private final JLabel answerA = new JLabel();
    private final JLabel answerB = new JLabel();
    private final JLabel answerC = new JLabel();
    private final JLabel secondsLeft = new JLabel();
    private final JTextField numberRight = new JTextField();
    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color RED = new Color(255, 0, 0);
    public static final Color GREEN = new Color(25, 255, 0);
    public static final Color BLACK = new Color(25, 25, 25);
    public static final Color ANO = new Color(50, 50, 50);

    private int seconds = 15;
    private static int correctAnswers = 0;
    private int index;
    private char answer;
    private final int ALL_QUESTIONS = Question.questions.length;

    public QuizModelAndView() throws IOException {


    }


    Timer timer = new Timer(1000, e -> {
        seconds--;
        secondsLeft.setText(String.valueOf(seconds));
        if(seconds <= 0 ) {
            displayAnswer();
        }
    });

    JFrame jFrame = new JFrame();

    @Override
    public void init() throws IOException {



        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(680, 640);
        jFrame.getContentPane().setBackground(new Color(50, 50, 50));
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        jFrame.setResizable(false);


        textField.setBounds(0, -10, 680, 80);
        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(111, 86, 1, 218));
        textField.setFont(new Font("Arial Black", Font.BOLD, 35));
        textField.setBorder(BorderFactory.createBevelBorder(1));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);


        textArea.setBounds(0, 68, 750, 45);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(25, 25, 25));
        textArea.setForeground(WHITE);
        textArea.setFont(new Font("Default", Font.CENTER_BASELINE, 23));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setEditable(false);


        buttonA.setBounds(0, 120, 100, 100);
        buttonA.setFont(new Font("Default", Font.BOLD, 25));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        buttonB.setBounds(0, 220, 100, 100);
        buttonB.setFont(new Font("Default", Font.BOLD, 25));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");

        buttonC.setBounds(0, 320, 100, 100);
        buttonC.setFont(new Font("Default", Font.BOLD, 25));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("C");

        answerA.setBounds(125, 115, 500, 100);
        answerA.setBackground(ANO);
        answerA.setForeground(WHITE);
        answerA.setFont(new Font("Default", Font.PLAIN, 20));

        answerB.setBounds(125, 210, 500, 100);
        answerB.setBackground(ANO);
        answerB.setForeground(WHITE);
        answerB.setFont(new Font("Default", Font.PLAIN, 20));

        answerC.setBounds(125, 320, 500, 100);
        answerC.setBackground(new Color(50, 50, 50));
        answerC.setForeground(WHITE);
        answerC.setFont(new Font("Default", Font.PLAIN, 20));


        secondsLeft.setBounds(300, 500, 100, 100);
        secondsLeft.setBackground(BLACK);
        secondsLeft.setForeground(new Color(255, 0, 0));
        secondsLeft.setFont(new Font("Ink Free", Font.BOLD, 60));
        secondsLeft.setBorder(BorderFactory.createBevelBorder(1));
        secondsLeft.setOpaque(true);
        secondsLeft.setHorizontalAlignment(JTextField.CENTER);


        numberRight.setBounds(225, 225, 200, 100);
        numberRight.setBackground(BLACK);
        numberRight.setForeground(new Color(25, 255, 0));
        numberRight.setFont(new Font("Ink Free", Font.BOLD, 50));
        numberRight.setBorder(BorderFactory.createBevelBorder(1));
        numberRight.setHorizontalAlignment(JTextField.CENTER);
        numberRight.setEditable(false);

        jFrame.add(textField);
        jFrame.add(textArea);
        jFrame.add(buttonA);
        jFrame.add(buttonB);
        jFrame.add(buttonC);
        jFrame.add(answerA);
        jFrame.add(answerB);
        jFrame.add(answerC);
        jFrame.add(secondsLeft);

        nextQuestion();
    }


    public void nextQuestion() throws IOException {
        if (index >= ALL_QUESTIONS) {
            results();

        } else {

            answerA.setForeground(WHITE);
            answerB.setForeground(WHITE);
            answerC.setForeground(WHITE);

            textField.setText("Frage " +(index + 1));
            textArea.setText(Question.questions[index]);
            answerA.setText(Question.options[index][0]);
            answerB.setText(Question.options[index][1]);
            answerC.setText(Question.options[index][2]);

            timer.start();

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);

        if (e.getSource() == buttonA) {
            answer = 'A';
            if (answer == Question.answers[index]) {
                correctAnswers++;
            }
        }

        if (e.getSource() == buttonB) {
            answer = 'B';
            if (answer == Question.answers[index]) {
                correctAnswers++;
            }
        }
        if (e.getSource() == buttonC) {
            answer = 'C';
            if (answer == Question.answers[index]) {
                correctAnswers++;
            }
        }
        displayAnswer();
    }

    public void displayAnswer() {

        timer.stop();

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);

        if(Question.answers[index] != 'A')
            answerA.setForeground(RED);
        if(Question.answers[index] != 'B')
            answerB.setForeground(RED);
        if(Question.answers[index] != 'C')
            answerC.setForeground(RED);

        if(Question.answers[index] == 'A')
            answerA.setForeground(GREEN);
        if(Question.answers[index] == 'B')
            answerB.setForeground(GREEN);
        if(Question.answers[index] == 'C')
            answerC.setForeground(GREEN);


        Timer pause = new Timer(2000, e -> {

            answer = ' ';
            seconds = 15;
            secondsLeft.setText(String.valueOf(seconds));
            buttonA.setEnabled(true);
            buttonB.setEnabled(true);
            buttonC.setEnabled(true);
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

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);

        int amount = storage.getAverageCorrectAnswers();
        textField.setText("Quiz Ergebnis");
        textArea.setText("Im Durchschnitt haben Spieler " + amount + " richtige Antworten");
        answerA.setText("");
        answerB.setText("");
        answerC.setText("");

        numberRight.setText(correctAnswers + "/" + ALL_QUESTIONS);
        jFrame.add(numberRight);
        secondsLeft.setText("0");

    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }
}
