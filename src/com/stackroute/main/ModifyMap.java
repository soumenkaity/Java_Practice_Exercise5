package com.stackroute.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ModifyMap {
    public Map<String,String> modify(Map<String,String> hashMap) {
        hashMap.put("val2",hashMap.get("val1"));
        hashMap.put("val1"," ");
        return hashMap;
    }
    public void addToMap(){
        Map<String,String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of key 'val1' : ");
        map.put("val1", scanner.nextLine());
        System.out.println("Enter the value of key 'val2' : ");
        map.put("val2", scanner.nextLine());
        System.out.println("The map "+map.toString()+" should return "+modify(map).toString());
    }

    public static void main(String[] args) {
        ModifyMap modifyMap = new ModifyMap();
        modifyMap.addToMap();
    }
}
