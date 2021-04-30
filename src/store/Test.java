package store;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int points = 0;

        String[] questionOne = {
                "Was ist der maximale Wert von int?",
                "2147483647",
                "123456677",
                "29999011119"
        };


        String[] questionTwo = {
                "Was ist die korrekte Synthax, um Hello World zu printen? ",
                "Console.WriteLine('Hello World')",
                "Console.log('Hello World')",
                "System.out.println('Hello World')"
        };


        String[][] quizAnswers= {
                questionOne, questionTwo
        };

        for (String sOne: questionOne) {
            System.out.println(sOne);
        }

        String answerOne = sc.nextLine();

        if (answerOne.equalsIgnoreCase(quizAnswers[0][1])) {
            points++;
            System.out.println("Richtige Antwort!");
            System.out.println("Punkte = " + points);

        }
        else {
            System.out.println("Antwort ist nicht richtig!");
        }

        for (String sTwo: questionTwo) {
            System.out.println(sTwo);
        }

        String answerTwo = sc.nextLine();

        if (answerTwo.equalsIgnoreCase(quizAnswers[1][3])) {
            points++;
            System.out.println("Richtige Antwort!");
            System.out.println("Punkte = " + points);

        }
        else {

            System.out.println("Antwort ist nicht richtig!");
        }

    }

}
