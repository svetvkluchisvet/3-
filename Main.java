package com.company;

//package com.base;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[] arraySize = new int[] {1000, 50000, 100000};
        System.out.println("---------------------------------------------");
        System.out.println("| Size of list  | ArrayList  |  LinkedList  |");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> tmp1 = new ArrayList<>();
            LinkedList<Integer> tmp2 = new LinkedList<>();
            System.out.print("Add  | ");
            System.out.printf("%8d", arraySize[i]);
            System.out.print(" |");
            System.out.printf("%11d", new TimeTest().addList(tmp1, arraySize[i]));
            System.out.print(" |");
            System.out.printf("%12d", new TimeTest().addList(tmp2, arraySize[i]));
            System.out.println("  |");
            System.out.println("---------------------------------------------");
            System.out.print("Get | ");
            System.out.printf("%8d", arraySize[i]);
            System.out.print(" |");
            System.out.printf("%11d", new TimeTest().getList(tmp1,  arraySize[i]));
            System.out.print("  |");
            System.out.printf("%12d", new TimeTest().getList(tmp2,  arraySize[i]));
            System.out.println("  |");
            System.out.println("---------------------------------------------");
            System.out.print("Rem | ");
            System.out.printf("%8d", arraySize[i]);
            System.out.print(" |");
            System.out.printf("%11d", new TimeTest().removeList(tmp1,  arraySize[i]));
            System.out.print("  |");
            System.out.printf("%12d", new TimeTest().removeList(tmp2,  arraySize[i]));
            System.out.println("  |");
            System.out.println("---------------------------------------------");
        }
    }
}

