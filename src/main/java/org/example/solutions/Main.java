package org.example.solutions;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            int a = Integer.parseInt(reader.readLine()), b = Integer.parseInt(reader.readLine());
            if (a>b){
                writer.write("Ali");
            }else if (a<b){
                writer.write("Vali");
            }else {
                writer.write("Same");
            }
        }
    }
}
