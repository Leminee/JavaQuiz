package pr;

import java.io.Serializable;

public class Question implements Serializable {

    public static final String[] questions = {
            "Was ist int?",
            "Was ist Integer?",
            "Welcher dieser Datentypen ist kein primitiver Datentyp?",
            "Was wird mit System.gc() aufgerufen?",
            "Woran erkennt man eine Methode ohne Rückgabetyp?",
            "Wofür steht OOP?",
            "Welche dieser Methoden besitzt die String-Klasse nicht?",
            "Wie erzeugt man in Java einen Einzeiligen Kommentar?",
            "Wie wandelt man einen String (str) in einen int um?",
            "Wo ist der Unterschied zwischen i++ und ++i?"
    };


    public static final String[][] options = {
            {"Utility Klasse", "Wrapper Klasse", "primitiver Datentyp"},
            {"Liste", "Wrapper Klasse", "primitiver Datentyp"},
            {"Long", "int", "double"},
            {"Garbage Collector", "Exit", "Reader"},
            {"static", "void", "public"},
            {"Operating Object Programming", "Object Or Parameter", "Objekt Orientierte Programmierung"},
            {"concat", "append", "getString()"},
            {"///Kommentar", "**/Kommentar", "//Kommentar"},
            {"int number = Integer.parseInt(str);", "int number = String.valueOf(str);", " int number = str;"},
            {"Es gibt keinen Unterschied", "Beide erhöhen i um 1, der Rückgabewert von i++ ist aber der vorherige Wert, während der Rückgabewert von ++i der neue Wert ist.", "i++ erhöht i um 1, ++i erhöht i um 2"},
    };
    public static final char[] answers = {
            'C',
            'B',
            'A',
            'A',
            'B',
            'C',
            'C',
            'C',
            'A',
            'B'
    };

}
