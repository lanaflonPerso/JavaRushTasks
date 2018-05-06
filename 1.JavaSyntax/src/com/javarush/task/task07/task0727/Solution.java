package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }

        for (int i = 0; i < listUpperCase.size(); i++) {
            System.out.println(listUpperCase.get(i));
        }

        // удвоение строк
        ArrayList<String> result = doubleValues(list);
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));// Вывести на экран result
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {

        for (int i=0;i<list.size();i++) {
            list.add(i,list.get(i));
            i++;
        }
        return list;
    }

}
