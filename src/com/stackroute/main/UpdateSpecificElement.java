package com.stackroute.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UpdateSpecificElement {
    public <E> ArrayList<E> update(ArrayList<E> al,E oldElement,E newElement)
    {
        int index=al.indexOf(oldElement);
        if(index == -1){
            System.out.println(oldElement+" is not there in ArrayList");
            return al;
        }
        al.set(index,newElement);
        return al;
    }
    public <E> ArrayList<E> removeAll(ArrayList<E> al){
        al.clear();
        return al;
    }
    public void addArrayList(){
        ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList("Apple","Grape","Melon","Berry"));
        System.out.println("Input : "+myArrayList.toString());
        myArrayList = update(myArrayList, "Apple", "Kiwi");
        myArrayList = update(myArrayList, "Melon", "Mango");
        System.out.println("Output : "+myArrayList.toString());
        myArrayList.clear();
        System.out.println("ArrayList after removing all elements : "+myArrayList.toString());
    }

    public static void main(String[] args) {
        UpdateSpecificElement updateSpecificElement = new UpdateSpecificElement();
        updateSpecificElement.addArrayList();
    }
}
