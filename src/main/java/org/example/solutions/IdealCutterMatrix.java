package org.example.solutions;

import java.io.*;


public class IdealCutterMatrix {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            String[] dimensions = reader.readLine().split(" ");
            int rows = Integer.parseInt(dimensions[0]);
            int cols = Integer.parseInt(dimensions[1]);

            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                String[] values = reader.readLine().split(" ");
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = Integer.parseInt(values[j]);
                }
            }

            int result = idealMatrix(matrix);
            writer.write(Integer.toString(result));

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int idealMatrix(int[][] matrix) {
        int count = 0;
        int lenX = matrix[0].length, lenY = matrix.length;
        int lenYM = lenY - 1;
        int tmp = matrix[0][0];
        int x = 0, y = 0;
        while (y < lenYM) {
               for (int i = y + 1; i < lenY; i++) {
                   for (int j = x + 1; j < lenX; j++) {
                       if (matrix[i][j] == tmp) {
                           count++;
                       }
                   }
                   for (int j = 0; j < x; j++) {
                       if (matrix[i][j] == tmp) {
                           count++;
                       }
                   }
               }
            x++;
            if (x == lenX) {
                x = 0;
                y++;
            }
            tmp = matrix[y][x];
        }

        return count;
    }

}
