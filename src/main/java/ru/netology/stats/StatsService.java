package ru.netology.stats;

public class StatsService {

    public static long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public static long averageSum(long[] sales) {

        long sum = 0;
        for (long sale : sales) {

            sum += sale;
        }
        int amount = 12;
        int averageSum = (int) (sum / amount);
        return averageSum;
    }


    public static int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public static int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public static long monthsBelowAverage(long[] sales) {
        int numberOfMonthBelow = 0;
        long sum = 0;
        long avSum = averageSum(sales);
        for (long sale : sales) {
            if (sale < avSum) {
                numberOfMonthBelow++;
            }
        }
        return numberOfMonthBelow;
    }

    public static long monthsAboveAverage(long[] sales) {
        int numberOfMonthAbove = 0;
        long sum = 0;
        long avSum = averageSum(sales);
        for (long sale : sales) {
            if (sale > avSum) {
                numberOfMonthAbove++;
            }
        }
        return numberOfMonthAbove;
    }

}
