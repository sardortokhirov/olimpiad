package org.example.solving;

import org.example.solutions.BigSmallShit;

import java.io.*;
import java.util.Scanner;


/**
 * Date-10/30/2023
 * By Sardor Tokhirov
 * Time-10:58 AM (GMT+5)
 */


public class Main {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("input.txt");
            PrintWriter writer = new PrintWriter("output.txt");
            Scanner scanner = new Scanner(file);
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            writer.print(right(matrix, 0, 0));

            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int right(int[][] matrix, int x, int y) {
        int num = 0;
        int currentY = y + 1, currentX = x;
        while (currentY < matrix.length && currentX < matrix[0].length) {
            if (matrix[currentY][currentX] == matrix[y][x]) {
                if (currentY + y * 2 <= matrix[0].length) {
                    num++;
                }
            }
            if (currentY < matrix.length) {
                currentY++;
            }

            if (currentY > matrix.length - 1) {
                currentX++;
                if (currentX < currentY) {
                    currentY = currentX;
                } else {
                    currentY--;
                }
            }
        }
        x++;
        if (x>=matrix[0].length-1&&y!=matrix.length){
            y++;
            return right(matrix,0,y);
        }
        if (y==matrix.length-2){
            return num;
        }

        return num+right(matrix,x,y);
    }

    public static int left() {
        return 0;
    }
}
