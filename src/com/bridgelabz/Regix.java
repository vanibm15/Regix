package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regix {

    static Pattern pattern=Pattern.compile("^([A-Z]){3,}$");

    public static void main(String[] args) {
        String testString="VANIMANAVACHARI";
        Matcher matcher= pattern.matcher(testString);
        if (matcher.matches()){
            System.out.println("Matches");
        }
        else {
            System.out.println("not matching");
        }
    }
}

