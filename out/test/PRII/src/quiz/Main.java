package quiz;


import java.io.IOException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Main{

    private final static String URL = "rmi://localhost:1099/quiz";

    public static void main(String[] args) {

        try {


            QuizModelAndView quizModelAndView = new QuizModelAndView();
            quizModelAndView.init();
            LocateRegistry.createRegistry(1099);
            Naming.rebind(URL,quizModelAndView);
            System.out.println(quizModelAndView);

            quizModelAndView.jFrame.setVisible(true);

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }



    }
}


