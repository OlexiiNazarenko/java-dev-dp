package service;

public interface ConsoleWriter {
    static void printMessage(Object object) {
        String output = object.toString();
        System.out.println(output);
    }

    static void printText(String text) {
        System.out.println(text);
    }
}
