package pr;

public class Question {

    public static final String[] questions = {
            "Was ist int?",
            "Was ist Integer?",
            "Welcher dieser Datentypen ist kein primitiver Datentyp?",
            "Was wird mit System.gc() aufgerufen?",
            "woran erkennt man eine Methode ohne Rückgabewert?",
            "Wofür steht OOP",
            "Wie erzeugt man in Java einen Mehrzeiligen Kommentar?",
            "Wie erzeugt man in Java einen Einzeiligen Kommentar?",
            "Bei welcher Antwort handelt es sich um Mathematische Funktionen?",
            "Welche 3 wichtige Eigenschaften hat ein Objekt?"
    };


    public static final String[][] options = {
            {"Utility Klasse", "Wrapper Klasse", "Primitiver Datentyp"},
            {"Liste", "Wrapper Klasse", "Primitiver Datentyp"},
            {"Long", "int", "double"},
            {"Garbage Collector", "exit", "Reader"},
            {"static", "void", "public"},
            {"Operating Object Programming", "Object Or Parameter", "Objekt Orientierte Programmierung"},
            {"ArrayIndexOutOfBoundsExeption", "NullPointerExeption", "ArrayLenghtExeption"},
            {"/* Kommentar */", "/# Kommentar #/", "**/ Kommentar **/"},
            {"///Kommentar", "**/Kommenter", "// Kommentara"},
            {"Math.plus, Math.minus,Math.geteilt", "Math.sin(x), Math.sqrt(x), Math.log(x)", "funktion.max(x,y), funktion.min(x,y) funktion.cos(x)"},
    };
    public static final char[] answers = {
            'C',
            'B',
            'A',
            'A',
            'B',
            'C',
            'B',
            'C',
            'A',
            'B'
    };

}
