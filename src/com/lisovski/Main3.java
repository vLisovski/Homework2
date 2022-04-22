package com.lisovski;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int r1,r2,r3;
        Scanner scanner = new Scanner(System.in);
        r1 = scanner.nextInt();
        r2 = scanner.nextInt();
        r3 = scanner.nextInt();
        if((2*r2+2*r3)<=2*r1) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
