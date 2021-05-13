package pr;

public class Question {

    private final String[] questions = {
            "Was ist int?",
            "Was ist Integer",
            "Welcher dieser Datentypen ist kein primitiver Datentyp?",
            "Wie lautet der Rumpf der Methode, die beim Aufruf des Programms aufgerufen wird?",
            "Durch welchen Operator l�sst man eine Klasse von einer anderen (normalen Klasse) vererben?",
            "Wie hei�t die Exception die auftritt, wenn man auf das 13. Element eines Arrays zugreift, welches nur eine L�nge von 10 hat?",
            "Wie erzeugt man in Java einen Mehrzeiligen Kommentar?",
            "Wie erzeugt man in Java einen Einzeiligen Kommentar?",
            "Bei welcher Antwort handelt es sich um Mathematische Funktionen?",
            "Welche 3 wichtige Eigenschaften hat ein Objekt?"
    };

    private final String[][] options = {
            {"Utility Klasse", "Wrapper Klasse", "Primitiver Datentyp"},
            {"123443", "Wrapper Klasse", "Primitiver Datentyp"},
            {"Klasse", "Wrapper Klasse", "Utility Klasse"},
            {"int", "double", "String"},
            {"puclic int main()", "public static void start(String[] args)", "public static void main(String() args)"},
            {"Implements", "Extends", "inherits"},
            {"ArrayIndexOutOfBoundsExeption", "NullPointerExeption", "ArrayLenghtExeption"},
            {"/* Kommentar */", "/# Kommentar #/", "**/ Kommentar **/"},
            {"///Kommentar", "**/Kommenter", "// Kommentara"},
            {"Math.plus, Math.minus,Math.geteilt", "Math.sin(x), Math.sqrt(x), Math.log(x)", "funktion.max(x,y), funktion.min(x,y) funktion.cos(x)"},
            {"Charakter, Aussehen, Benehmen", "Identit�t, Zustand, Verhalten", "Struktur, Datenmenge, Entwicklungsumgebung"}
    };
    public final char[] answers = {
            'A',
            'B',
            'C'
    };
    public String[] getQuestions() {
        return questions;
    }

    public String[][] getOptions() {
        return options;
    }

    public char[] getAnswers() {
        return answers;
    }

}
