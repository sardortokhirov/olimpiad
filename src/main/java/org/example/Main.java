package org.example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        String a = sc.nextLine(),b = sc.nextLine();
        PrintWriter pw = new PrintWriter("output.txt");
        if (a.length() > b.length()) {
            pw.print(numAdder(a, b));
        } else {
            pw.print(numAdder(b, a));
        }
        pw.close();
    }

    public static String numAdder(String bigOne, String smallOne) {
        StringBuilder num = new StringBuilder();
        int sizeS = smallOne.length() - 1;
        int sizeB = bigOne.length() - 1;
        boolean left = false;
        while (sizeS >= 0) {
            int tempNum = (int) bigOne.charAt(sizeB) + (int) smallOne.charAt(sizeS) - 96;
            if (left) {
                tempNum++;
                left = false;
            }
            if (tempNum / 10 > 0) left = true;
            num.append(tempNum % 10);
            sizeB--;
            sizeS--;
        }
        if (sizeB >= 0) {
            for (int i = sizeB; i >= 0; i--) {
                int n = (int) bigOne.charAt(sizeB) - 48;
                if (left) {
                    n++;
                    left = false;
                }
                if (n / 10 > 0) left = true;
                num.append(n % 10);
                sizeB--;
            }
        }
        if (left) num.append("1");
        return num.reverse().toString();
    }
}