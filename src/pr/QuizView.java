package pr;

import java.awt.*;
import javax.swing.*;

public class QuizView {

    private final JFrame frame = new JFrame();
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
    private final Color white = new Color(255, 255,255);
    private final Color red = new Color(255, 0, 0);
    private final Color green = new Color(25, 255, 0);


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
        buttonA.setText("A");

        buttonB.setBounds(0, 200, 100, 100);
        buttonB.setFont(new Font("MV Boli", Font.BOLD, 35));
        buttonB.setFocusable(false);
        buttonB.setText("B");

        buttonC.setBounds(0, 300, 100, 100);
        buttonC.setFont(new Font("MV Boli", Font.BOLD, 35));
        buttonC.setFocusable(false);
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

    public Color getRed() {
        return red;
    }

    public Color getGreen() {
        return green;
    }

}

