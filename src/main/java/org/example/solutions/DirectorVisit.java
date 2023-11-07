package org.example.solutions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Date-10/30/2023
 * By Sardor Tokhirov
 * Time-5:27 AM (GMT+5)
 */
public class DirectorVisit {

    public static void main(String[] argv) throws IOException {
        new DirectorVisit().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        long a=sc.nextLong(), b=sc.nextLong();
        pw = new PrintWriter("output.txt");
        pw.print(a*b);
        pw.close();
    }
}
