package pr;

import java.awt.*;
import javax.swing.*;

public class QuizView extends JFrame {

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
    private final JTextField percentage = new JTextField();
    public static final Color WHITE = new Color(255, 255,255);
    public static final Color RED = new Color(255, 0, 0);
    public static final Color GREEN = new Color(25, 255, 0);


    public void init() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(680, 640);
        getContentPane().setBackground(new Color(50, 50, 50));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);


        textField.setBounds(0, -10, 680, 80);
        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(111, 86, 1, 218));
        textField.setFont(new Font("Arial Black", Font.BOLD, 35));
        textField.setBorder(BorderFactory.createBevelBorder(1));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);



        textArea.setBounds(0, 68, 750, 50);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(25, 25, 25));
        textArea.setForeground(WHITE);
        textArea.setFont(new Font("Default", Font.BOLD, 23));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setEditable(false);


        buttonA.setBounds(0, 120, 100, 100);
        buttonA.setFont(new Font("Default", Font.BOLD, 25));
        buttonA.setFocusable(false);
        buttonA.setText("A");

        buttonB.setBounds(0, 220, 100, 100);
        buttonB.setFont(new Font("Default", Font.BOLD, 25));
        buttonB.setFocusable(false);
        buttonB.setText("B");

        buttonC.setBounds(0, 320, 100, 100);
        buttonC.setFont(new Font("Default", Font.BOLD, 25));
        buttonC.setFocusable(false);
        buttonC.setText("C");

        answerA.setBounds(125, 115, 500, 100);
        answerA.setBackground(new Color(50, 50, 50));
        answerA.setForeground(WHITE);
        answerA.setFont(new Font("Default", Font.PLAIN, 20));

        answerB.setBounds(125, 210, 500, 100);
        answerB.setBackground(new Color(50, 50, 50));
        answerB.setForeground(WHITE);
        answerB.setFont(new Font("Default", Font.PLAIN, 20));

        answerC.setBounds(125, 320, 500, 100);
        answerC.setBackground(new Color(50, 50, 50));
        answerC.setForeground(WHITE);
        answerC.setFont(new Font("Default", Font.PLAIN, 20));


        secondsLeft.setBounds(300, 500, 100, 100);
        secondsLeft.setBackground(new Color(25, 25, 25));
        secondsLeft.setForeground(new Color(255, 0, 0));
        secondsLeft.setFont(new Font("Ink Free", Font.BOLD, 60));
        secondsLeft.setBorder(BorderFactory.createBevelBorder(1));
        secondsLeft.setOpaque(true);
        secondsLeft.setHorizontalAlignment(JTextField.CENTER);


        numberRight.setBounds(225, 225, 200, 100);
        numberRight.setBackground(new Color(25, 25, 25));
        numberRight.setForeground(new Color(25, 255, 0));
        numberRight.setFont(new Font("Ink Free", Font.BOLD, 50));
        numberRight.setBorder(BorderFactory.createBevelBorder(1));
        numberRight.setHorizontalAlignment(JTextField.CENTER);
        numberRight.setEditable(false);

        percentage.setBounds(225, 320, 200, 100);
        percentage.setBackground(new Color(25, 25, 25));
        percentage.setForeground(new Color(25, 255, 0));
        percentage.setFont(new Font("Ink Free", Font.BOLD, 50));
        percentage.setBorder(BorderFactory.createBevelBorder(1));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);

        add(textField);
        add(textArea);
        add(buttonA);
        add(buttonB);
        add(buttonC);
        add(answerA);
        add(answerB);
        add(answerC);
        add(secondsLeft);

        setVisible(true);

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

    public JLabel getSecondsLeft() {
        return secondsLeft;
    }

    public JTextField getNumberRight() {
        return numberRight;
    }

    public JTextField getPercentage() {
        return percentage;
    }
}

