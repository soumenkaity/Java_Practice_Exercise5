package com.stackroute.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberCounts {
    public void frequencyNumber(){
        System.out.println("Enter the string : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex="[^a-zA-Z]";         //not letters
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        input=matcher.replaceAll(" ").trim();    // replaces non letters with space
        Map<String, Integer> hm = new HashMap<String, Integer>();
        String[] strings=input.split("\\s+");
        for (String i :strings) {
            Integer j = hm.get(i);
            hm.put(i,(j == null) ? 1 : j + 1);
        }
        System.out.println(hm.toString());
    }

    public static void main(String[] args) {
        NumberCounts numberCounts = new NumberCounts();
        numberCounts.frequencyNumber();
    }
}
