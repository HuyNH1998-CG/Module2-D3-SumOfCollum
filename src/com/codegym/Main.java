package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Size");
        int size = input.nextInt();
        int[][] matrix = new int[size][];
        System.out.println("Matrix have " + size + " rows");
        for (int row = 0; row < matrix.length; row++) {
            System.out.println("Enter row " + row + " length");
            matrix[row] = new int[input.nextInt()];
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int collum = 0; collum < matrix[row].length; collum++) {
                System.out.println("Enter row " + row + " element " + collum);
                matrix[row][collum] = input.nextInt();
            }
        }
        System.out.println("Input collum to get sum");
        int collum = input.nextInt();
        int sum = 0;
        for (int[] ints : matrix) {
            sum += ints[collum];
        }
        System.out.println("Sum of collum " + collum + " is " + sum);
    }
}
