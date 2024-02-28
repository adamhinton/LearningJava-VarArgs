package dev.lpa;

public class Main {
    public static void main(String... args) {

        System.out.println("Hello world again");

        // split works the same as JS
        String[] splitStrings = "Hello world again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello", "jfieoasfsad", "fjadsiofas");

    }

    // var args param gives us a lot more options
    // We can pass an array, or a simple string

    // Can pass str[] or as many ind strs as we want
    private static void printText(String... textList){
        for(String t : textList){
            System.out.println(t);
        }
    }
}