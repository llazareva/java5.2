package ru.netology.stats;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = StatsService.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void averageSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = StatsService.averageSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = StatsService.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = StatsService.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void monthsBelowAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = StatsService.monthsBelowAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void monthsAboveAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = StatsService.monthsAboveAverage(sales);

            assertEquals(expected, actual);
    }
}