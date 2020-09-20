package com.company.task5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;


public class Task5 {

    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<Integer> arrayList1 = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void makeTask() {
        int lengthF = scanner.nextInt();
        for (int i = 0; i < lengthF; i++) {
            int k = scanner.nextInt();
           arrayList.add(k);

        }
        int lengthS= scanner.nextInt();
        for (int i = 0;i<lengthS;i++){
            Integer k = scanner.nextInt();
            if(arrayList.contains(k)){
                arrayList1.add(k);
            }

        }
        Collections.sort(arrayList1);
        for (int i:arrayList1) {
            System.out.println(i);

        }

    }
}
