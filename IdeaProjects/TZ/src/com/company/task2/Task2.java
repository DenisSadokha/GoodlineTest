package com.company.task2;

import java.util.Scanner;

public class Task2 {
    private int s;
    private int v, t;
    private int v1;
    private boolean check;
    int i;
    Scanner scanner = new Scanner(System.in);

    public int makeTask() {
        v = scanner.nextInt();
        t = scanner.nextInt();
        if (v >= 0) {
            s = v * t;
            check = true;
        } else {
            s = (v * t) * (-1);

            check = false;
        }

        if (s > 108) {
            while (s > 108) {
                s = s - 109;

            }


        }

        if (!check)
            s = 109 - s;

        return s;
    }
}
