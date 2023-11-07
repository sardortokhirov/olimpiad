package org.example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Date-10/30/2023
 * By Sardor Tokhirov
 * Time-3:22 AM (GMT+5)
 */
public class SomeShitAlgo {

    public static void main(String[] argv) throws IOException {
        new SomeShitAlgo().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        int a=sc.nextInt(), b=sc.nextInt();
        pw = new PrintWriter("output.txt");
        pw.print(a+b);
        pw.close();
    }
}
