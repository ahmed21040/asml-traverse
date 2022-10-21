package com.asml.assignment;

import java.util.ArrayList;
import java.util.List;

public class Traverse {


    public static void main(String[] args) {
        int[][] input = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        Traverse traverse = new Traverse();
        System.out.println(traverse.getTraverse(input));

    }

    public List<Integer> getTraverse(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int row = matrix.length;

        if (row == 0) {
            return result;
        }
        int col = matrix[0].length;

        int top = 0;
        int bot = row - 1;
        int left = 0;
        int right = col - 1;

//         we have 4 direction
        int dir = 0;

        while (left <= right && top <= bot) {


            if (dir == 0) { // first direction from left to right
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;

            } else if (dir == 1) { // second direction from top to bottom
                for (int i = top; i <= bot; i++) {
                    result.add(matrix[i][right]);
                }
                right--;

            } else if (dir == 2) { // third direction from right to left
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bot][i]);
                }
                bot--;
            } else if (dir == 3) { // Fourth direction from bottom to top
                for (int i = bot; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

            dir++;
            dir = dir > 3 ? 0 : dir;

        }


        return result;
    }
}
