package org.example.solutions;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Date-11/6/2023
 * By Sardor Tokhirov
 * Time-6:52 AM (GMT+5)
 */
public class FuckIt {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int arrayLength = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            arr[i] =  Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for (int i = 0; i < arrayLength; i++) {
            bw.write(arr[i] + " ");
        }

        bw.close();
    }
}
