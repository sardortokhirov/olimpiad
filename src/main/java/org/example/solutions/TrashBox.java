package org.example.solutions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TrashBox {
    public static void main(String[] argv) throws IOException {
        new TrashBox().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        pw = new PrintWriter("output.txt");
        int a=sc.nextInt(), b=sc.nextInt(),c=sc.nextInt();
        ArrayList<Integer> list=new ArrayList();
        while (sc.hasNext()){
            list.add(sc.nextInt());
        }
        for (int i = 0; i <list.size() ; i++) {
            pw.println(list.get(i)<=a?"BOX":"TRASH");
        }
        pw.close();
    }
}
