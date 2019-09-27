package com.stackroute.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordMoreThanOnce {
    public void checkAppearance(){
        System.out.println("Enter the length of array of String : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        String[] wordsArray = new String[number];
        for (int i=0; i<number; i++){
            wordsArray[i] = scanner.nextLine();
        }
        Map<String, Integer> integerHashMap = new HashMap<String, Integer>();
        Map<String, Boolean> booleanHashMap = new HashMap<String, Boolean>();
        for (String i :wordsArray) {
            Integer j = integerHashMap.get(i);
            integerHashMap.put(i, (j == null) ? 1 : j + 1);
            int k=integerHashMap.get(i);
            booleanHashMap.put(i,(k>1) ? true: false);
        }
        System.out.println(booleanHashMap.toString());
    }

    public static void main(String[] args) {
        WordMoreThanOnce wordMoreThanOnce = new WordMoreThanOnce();
        wordMoreThanOnce.checkAppearance();
    }
}
