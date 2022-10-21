package com.asml.assignment;


import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TraverseTest {

    private static Traverse traverse;

    @BeforeClass
    public static void setUp() {
        traverse = new Traverse();
    }


    @Test
    public void test_getTraverse_with_empty_input() {
        int[][] input = new int[0][0];
        List<Integer> output = traverse.getTraverse(input);
        assertEquals(0, output.size());
    }

    @Test
                    public void test_getTraverse_with_correct_input() {
                        int[][] input = {
                                {1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12},
                                {13, 14, 15, 16}
                        };
                        List<Integer> output = traverse.getTraverse(input);

                        assertEquals(16, output.size());
                        assertEquals("[1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]", output.toString());
    }
}
