package ru.netology.javaqa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RestCalculationTest {
    @Test
    public void shouldCalculateRestMonths1() {
        RestCalculation service = new RestCalculation();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculateRestMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRestMonths2() {
        RestCalculation service = new RestCalculation();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculateRestMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
