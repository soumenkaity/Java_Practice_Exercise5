package com.stackroute.main;

import java.util.*;

public class SetSorting {
    public void sortTheSet(){
        System.out.println("Enter the names : ");
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(" ");
        SortedSet<String> sortedSet = new TreeSet<>(Arrays.asList(names));
        System.out.println("Sorted Set : "+sortedSet.toString());
        ArrayList<String> sortedArrayList = new ArrayList<>(sortedSet);
        System.out.println("ArrayList from Set : "+sortedArrayList);
    }

    public static void main(String[] args) {
        SetSorting setSorting = new SetSorting();
        setSorting.sortTheSet();
    }
}
