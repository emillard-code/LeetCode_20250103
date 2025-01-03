package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void numberOfWaysToSplitArrayTest() {

        assertEquals(2, LeetCodeSolution.waysToSplitArray(new int[]{10,4,-8,7}));

        assertEquals(2, LeetCodeSolution.waysToSplitArray(new int[]{2,3,1,0}));

    }

}
