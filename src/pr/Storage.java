package pr;


import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Storage {


    private final String DATA = "/Users/lem/Desktop/datei.txt";
    private static double averageCorrectAnswers;
    private final List<String> amountCorrectAnswers = new ArrayList<>();

    public void storeData() {

        try {

            LocalDateTime now;
            FileWriter data;

            data = new FileWriter(DATA, true);
            QuizView quizView = new QuizView();
            int numberCorrectAnswers = quizView.getCorrectAnswers();

            now = LocalDateTime.now();
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

        double sum = 0;
        for (int i = 0; i < amountCorrectAnswers.size() - 1; i++) {


            sum += Integer.parseInt(amountCorrectAnswers.get(i));
        }

        averageCorrectAnswers = sum/amountCorrectAnswers.size();

    }

    private boolean isEven(int number) {

        return number % 2 == 0;
    }

    public double getAverageCorrectAnswers() {
        return averageCorrectAnswers;
    }
}
