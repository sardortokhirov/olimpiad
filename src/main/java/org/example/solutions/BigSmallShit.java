package org.example.solutions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Date-10/30/2023
 * By Sardor Tokhirov
 * Time-4:08 AM (GMT+5)
 */
public class BigSmallShit {
    public static void main(String[] argv) throws IOException {
        new BigSmallShit().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        int a=sc.nextInt(), b=sc.nextInt();
        pw = new PrintWriter("output.txt");
        if (a>b){
            pw.print(">");
        }else if(a<b){
            pw.print("<");
        }else {
            pw.print("=");
        }

        pw.close();
    }
}
