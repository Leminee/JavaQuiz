package store;

import javax.swing.*;
import java.awt.*;

public class StoreClass {




    /*int seconds = 30;
    int correctAnswers = 0;
    int index;
    char answer;
    int allQuestions = questions.length;
    int result;*/

        JFrame frame = new JFrame();

        JTextField textField = new JTextField();
        JTextArea textArea = new JTextArea();
        JButton buttonA = new JButton();
        JButton buttonB = new JButton();
        JButton buttonC = new JButton();
        JLabel answerA = new JLabel();
        JLabel answerB = new JLabel();
        JLabel answerC = new JLabel();
        JLabel time = new JLabel();
        JLabel secondsLeft = new JLabel();
        JTextField numberRight = new JTextField();
        JTextField percentage = new JTextField();
        Color white = new Color(255, 255,255);


   /* Timer timer = new Timer(1000, e -> {
        seconds--;
        secondsLeft.setText(String.valueOf(seconds));
        if (seconds <= 0) {
            displayAnswer();
        }
    });*/


    /*public void nextQuestion() {

        if (index >= allQuestions) {
            results();
        } else {
            textField.setText("Fragen " + (index + 1));
            textArea.setText(Question.questions[index]);
            answerA.setText(options[index][0]);
            answerB.setText(options[index][1]);
            answerC.setText(options[index][2]);
            timer.start();
        }
    }*/

        // @Override
   /* public void actionPerformed(ActionEvent e) {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);

        if (e.getSource() == buttonA) {
            answer = 'A';
            if (answer == answers[index]) {
                correctAnswers++;
            }
        }
        if (e.getSource() == buttonB) {
            answer = 'B';
            if (answer == answers[index]) {
                correctAnswers++;
            }
        }
        if (e.getSource() == buttonC) {
            answer = 'C';
            if (answer == answers[index]) {
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

        if (answers[index] != 'A')
            answerA.setForeground(new Color(255, 0, 0));
        if (answers[index] != 'B')
            answerB.setForeground(new Color(255, 0, 0));
        if (answers[index] != 'C')
            answerC.setForeground(new Color(255, 0, 0));

        Timer pause = new Timer(2000, e -> {

            answerA.setForeground(new Color(25, 255, 0));
            answerB.setForeground(new Color(25, 255, 0));
            answerC.setForeground(new Color(25, 255, 0));

            answer = ' ';
            seconds = 30;
            secondsLeft.setText(String.valueOf(seconds));
            buttonA.setEnabled(true);
            buttonB.setEnabled(true);
            buttonC.setEnabled(true);
            index++;
            nextQuestion();
        });
        pause.setRepeats(false);
        pause.start();
    }

    public void results() {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);

        result = (int) ((correctAnswers / (double) allQuestions) * 100);

        textField.setText("QuizView Ergebnis");
        textArea.setText("");
        answerA.setText("");
        answerB.setText("");
        answerC.setText("");

        numberRight.setText("(" + correctAnswers + "/" + allQuestions + ")");
        percentage.setText(result + "%");

        frame.add(numberRight);
        frame.add(percentage);

    }*/


        public void init() {

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(700, 650);
            frame.getContentPane().setBackground(new Color(40, 40, 40));
            frame.setLocationRelativeTo(null);
            frame.setLayout(null);

            textField.setBounds(0, 0, 750, 60);
            textField.setBackground(new Color(25, 25, 25));
            textField.setForeground(new Color(200, 174, 5, 218));
            textField.setFont(new Font("Ink Free", Font.BOLD, 35));
            textField.setBorder(BorderFactory.createBevelBorder(1));
            textField.setHorizontalAlignment(JTextField.CENTER);
            textField.setEditable(false);

            textArea.setBounds(0, 60, 750, 55);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setBackground(new Color(25, 25, 25));
            textArea.setForeground(white);
            textArea.setFont(new Font("MV Boli", Font.BOLD, 30));
            textArea.setBorder(BorderFactory.createBevelBorder(1));
            textArea.setEditable(false);

            buttonA.setBounds(0, 110, 100, 100);
            buttonA.setFont(new Font("MV Boli", Font.BOLD, 35));
            buttonA.setFocusable(false);
            //buttonA.addActionListener(this);
            buttonA.setText("A");

            buttonB.setBounds(0, 200, 100, 100);
            buttonB.setFont(new Font("MV Boli", Font.BOLD, 35));
            buttonB.setFocusable(false);
            //buttonB.addActionListener(this);
            buttonB.setText("B");

            buttonC.setBounds(0, 300, 100, 100);
            buttonC.setFont(new Font("MV Boli", Font.BOLD, 35));
            buttonC.setFocusable(false);
            //buttonC.addActionListener(this);
            buttonC.setText("C");



            answerA.setBounds(125, 100, 500, 100);
            answerA.setBackground(new Color(50, 50, 50));
            answerA.setForeground(white);
            answerA.setFont(new Font("MV Boli", Font.PLAIN, 35));

            answerB.setBounds(125, 200, 500, 100);
            answerB.setBackground(new Color(50, 50, 50));
            answerB.setForeground(white);
            answerB.setFont(new Font("MV Boli", Font.PLAIN, 35));

            answerC.setBounds(125, 300, 500, 100);
            answerC.setBackground(new Color(50, 50, 50));
            answerC.setForeground(white);
            answerC.setFont(new Font("MV Boli", Font.PLAIN, 35));



            secondsLeft.setBounds(535, 510, 100, 100);
            secondsLeft.setBackground(new Color(25, 25, 25));
            secondsLeft.setForeground(new Color(255, 0, 0));
            secondsLeft.setFont(new Font("Ink Free", Font.BOLD, 60));
            secondsLeft.setBorder(BorderFactory.createBevelBorder(1));
            secondsLeft.setOpaque(true);
            secondsLeft.setHorizontalAlignment(JTextField.CENTER);
            //secondsLeft.setText(String.valueOf(seconds));

            time.setBounds(535, 475, 100, 25);
            time.setBackground(new Color(50, 50, 50));
            time.setForeground(new Color(255, 0, 0));
            time.setFont(new Font("MV Boli", Font.PLAIN, 16));
            time.setHorizontalAlignment(JTextField.CENTER);
            time.setText("Zeit läuft...");

            numberRight.setBounds(225, 225, 200, 100);
            numberRight.setBackground(new Color(25, 25, 25));
            numberRight.setForeground(new Color(25, 255, 0));
            numberRight.setFont(new Font("Ink Free", Font.BOLD, 50));
            numberRight.setBorder(BorderFactory.createBevelBorder(1));
            numberRight.setHorizontalAlignment(JTextField.CENTER);
            numberRight.setEditable(false);

            percentage.setBounds(225, 325, 200, 100);
            percentage.setBackground(new Color(25, 25, 25));
            percentage.setForeground(new Color(25, 255, 0));
            percentage.setFont(new Font("Ink Free", Font.BOLD, 50));
            percentage.setBorder(BorderFactory.createBevelBorder(1));
            percentage.setHorizontalAlignment(JTextField.CENTER);
            percentage.setEditable(false);

            frame.add(time);
            frame.add(secondsLeft);
            frame.add(answerA);
            frame.add(answerB);
            frame.add(answerC);
            frame.add(buttonA);
            frame.add(buttonB);
            frame.add(buttonC);
            frame.add(textArea);
            frame.add(textField);
            frame.setVisible(true);

            // nextQuestion();
        }

        public JFrame getFrame() {
            return frame;
        }

        public JTextField getTextField() {
            return textField;
        }

        public JTextArea getTextArea() {
            return textArea;
        }

        public JButton getButtonA() {
            return buttonA;
        }

        public JButton getButtonB() {
            return buttonB;
        }

        public JButton getButtonC() {
            return buttonC;
        }

        public JLabel getAnswerA() {
            return answerA;
        }

        public JLabel getAnswerB() {
            return answerB;
        }

        public JLabel getAnswerC() {
            return answerC;
        }

        public JLabel getTime() {
            return time;
        }

        public JLabel getSecondsLeft() {
            return secondsLeft;
        }

        public JTextField getNumberRight() {
            return numberRight;
        }

        public JTextField getPercentage() {
            return percentage;
        }

        public Color getWhite() {
            return white;
        }
    }

