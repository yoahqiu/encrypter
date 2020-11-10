package main;

import java.util.Scanner;

public class EncryptionProcedures {

    public static String input;
    public static String twoChar;
    public static String oneChar;
    public static String replacement;
    public static String output = "";

    private static final String[] arrPeriodicTableValues = {"h", "he", "li", "be", "b", "c", "n", "o", "f", "ne", "na",
            "mg", "al", "si", "p", "s", "cl", "ar", "k", "ca", "sc", "ti", "v", "cr", "mn", "fe", "co", "ni", "cu", "zn",
            "ga", "ge", "as", "se", "br", "kr", "rb", "sr", "y", "zr", "nb", "mo", "tc", "ru", "rh", "pd", "ag", "cd",
            "in", "sn", "sb", "te", "i", "xe", "cs", "ba", "la", "ce", "pr", "nd", "pm", "sm", "eu", "gd", "tb", "dy",
            "ho", "er", "tm", "yb", "lu", "hf", "ta", "w", "re", "os", "ir", "pt", "au", "hg", "tl", "pb", "bi", "po",
            "at", "rn", "fr", "ra", "ac", "th", "pa", "u", "np", "pu", "am", "cm", "bk", "cf", "es", "fm", "md", "no",
            "lr", "rf", "db", "sg", "bh", "hs", "mt", "ds", "rg", "cn", "nh", "fl", "mc", "lv", "ts", "og"};

    public static void retrieveInput() {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter the message to be encrypted: ");
        input = console.nextLine() + " ";
    }

    public static String periodicEncrypt() {

        for (int i = 0; i < input.length() - 1; i++) {
            replacement = "";
            twoChar = input.substring(i, i + 2);

            for (int j = 0; j < arrPeriodicTableValues.length; j++) {
                if (twoChar.toLowerCase().equals(arrPeriodicTableValues[j])) {
                    replacement = (j + 1) + "";
                    i++;
                    break;
                }
            }

            if (replacement.length() == 0) {
                oneChar = twoChar.charAt(0) + "";

                for (int j = 0; j < arrPeriodicTableValues.length; j++) {
                    if (oneChar.toLowerCase().equals(arrPeriodicTableValues[j])) {
                        replacement = (j + 1) + "";
                        break;
                    }
                }

                if(replacement.length() == 0) {
                    replacement = oneChar;
                }
            }

            output += replacement;
        }

        return output;
    }

}
