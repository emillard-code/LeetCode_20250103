package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void numberOfWaysToSplitArrayTest() {

        assertEquals(2, LeetCodeAttempt.numberOfWaysToSplitArray(new int[]{10,4,-8,7}));

        assertEquals(2, LeetCodeAttempt.numberOfWaysToSplitArray(new int[]{2,3,1,0}));

    }

}
