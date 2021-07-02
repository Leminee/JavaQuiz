package quiz;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Storage implements Serializable{

    private final String DATA = "storage.txt";
    private static int averageCorrectAnswers;
    private final List<String> amountCorrectAnswers = new ArrayList<>();

    public void storeData() {

        try {

            FileWriter data = new FileWriter(DATA, true);
            QuizModelAndView quizModelAndView = new QuizModelAndView();
            int numberCorrectAnswers = quizModelAndView.getCorrectAnswers();

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

            BufferedWriter bufferedWriter = new BufferedWriter(data);
            bufferedWriter.write("\nAnzahl der richtigen Antworten: " + numberCorrectAnswers);
            bufferedWriter.write("\nGespielt am: " + dtf.format(now));

            bufferedWriter.close();

        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public void readData() {

        try {

            FileReader data = new FileReader(DATA);

            BufferedReader bufferedReader = new BufferedReader(data);

            String line;


            int amount = 0;
            while ((line = bufferedReader.readLine()) != null) {

                if (isEven(amount)) {

                    if (line.length() < 32) {
                        return;
                    }
                    amountCorrectAnswers.add(line.substring(32, 33));
                }
                amount++;
            }

            bufferedReader.close();

        } catch (IOException io) {
            io.printStackTrace();

        }
    }

    public void calculateAverage() {

        int sum = 0;
        for (String amountCorrectAnswer : amountCorrectAnswers) {

            sum += Integer.parseInt(amountCorrectAnswer);
        }
        if (amountCorrectAnswers.size() == 0) {
            return;
        }
        averageCorrectAnswers = sum / amountCorrectAnswers.size();
    }

    private boolean isEven(int number) {

        return number % 2 == 0;
    }

    public int getAverageCorrectAnswers() {
        return averageCorrectAnswers;
    }
}
