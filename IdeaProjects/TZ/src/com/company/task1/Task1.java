package com.company.task1;

import java.util.Scanner;

public class Task1 {
    private int n, m, x, y, ox, oy, minL;
    Scanner scanner = new Scanner(System.in);

    public int makeTask() {
        minL = 1999999999;
        n = scanner.nextInt();
        m = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();
        if (m > n) {
            ox = m;
            oy = n;
        } else {
            ox = n;
            oy = m;
        }
        if (x < minL)
            minL = x;
        if(ox-x>0 && ox-x<minL)
            minL=ox-x;
        if(y<minL)
            minL=y;
        if(oy-y>0 && oy-y<minL){
            minL=oy-y;
        }

        return minL;
    }

}
