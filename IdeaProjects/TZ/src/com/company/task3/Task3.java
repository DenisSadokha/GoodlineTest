package com.company.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task3 {
    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<Integer> arrayList1 = new ArrayList<>();
    int[][] arr2;
    Scanner scanner = new Scanner(System.in);
    int length;

    public void makeTask() {
        length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            Integer k = scanner.nextInt();
            if (arrayList.contains(k)){
                arrayList1.remove(k);

            } else arrayList1.add(k);
            arrayList.add(k);

        }
        for (int i: arrayList1) {
            System.out.println(i);
        }


    }



}
