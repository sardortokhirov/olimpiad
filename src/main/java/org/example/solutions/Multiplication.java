package org.example.solutions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Date-10/30/2023
 * By Sardor Tokhirov
 * Time-6:22 AM (GMT+5)
 */
public class Multiplication {
    public static void main(String[] argv) throws IOException {
        new Multiplication().run();
    }

    PrintWriter pw;
    Scanner sc;

    public void run() throws IOException {
        sc = new Scanner(new File("input.txt"));
        long z = sc.nextLong();
        pw = new PrintWriter("output.txt");
        double za=Math.sqrt(z);
        boolean a=false;
        if (za*za==z){
            a=true;
        }
        if(z<0) z *= -1;
        if (z == 1) {
            pw.print(2);
            pw.close();
        }
        if (z == 0) {
            pw.print(-1);
            pw.close();
        } else {
            LinkedList<Integer> list = new LinkedList<>();
            Set<Long> integerSet = new HashSet<>();
            long i = 2;
            while (z >= i) {
                if (z % i != 0) {
                    i++;
                    continue;
                } else {
                    if (integerSet.contains(i)) {
                        list.set(list.size() - 1, list.get(list.size() - 1) + 1);
                    } else {
                        integerSet.add(i);
                        list.add(1);
                    }
                    z /= i;
                }
            }
            int p = 1;
            for (int j = 0; j < list.size(); j++) {
                p *= list.get(j) + 1;
            }
            if (a) p++;
            pw.print(p);

            pw.close();
        }
    }
}
