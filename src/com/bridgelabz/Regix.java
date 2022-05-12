package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regix {

    static Pattern pattern=Pattern.compile("[0-9]{2} [0-9]{10}");

    public static void main(String[] args) {
        String testString="91 1234567895";
        Matcher matcher= pattern.matcher(testString);
        if (matcher.matches()){
            System.out.println("Matches");

        }
        else {
            System.out.println("not matching");
        }
    }
}

