package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int x = r*c;
        for (int i = 0; i < r; i++) ;
        {
            for (int j = 0; j < c; j++) {
                System.out.printf("%d ",x--);
            }
            System.out.println();
        }

    }
}
