package org.vyshak.problems.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    @Test
    public void testContainsDuplicate() {
        ContainsDuplicate c = new ContainsDuplicate();
        int[] nums = new int[] {1, 3, 4, 5, 2, 3};
        Assertions.assertTrue(c.containsDuplicate(nums));
    }

    @Test
    public void testContainsDuplicateWithNoDuplicates() {
        ContainsDuplicate c = new ContainsDuplicate();
        int[] nums = new int[] {1, 3, 4, 5, 2};
        Assertions.assertFalse(c.containsDuplicate(nums));
    }
}