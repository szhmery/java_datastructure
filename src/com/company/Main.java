package com.company;
import java.util.*;
import java.lang.Integer;



public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        int Totalnum = 0;
        System.out.println(list);
        for (Integer node: list) {
            for (Integer nodetemp:list) {
                if (nodetemp == node) {
                    Totalnum++;
                    System.out.println("Totalnum = " + Totalnum);
                }

            }
            if (Totalnum > 1) {
                System.out.println(node + " double!! Totalnum = " + Totalnum);

            }
            Totalnum = 0;
        }
    }
}
