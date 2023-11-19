package ru.netology.statistic;

public class StatisticService {

    public long calculateTopSales(long[] sales) {
        long maxValue = sales[0];
        int monthMain = 1;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxValue) {
                maxValue = sales[i];
                monthMain = i + 1;
            }
        }
        return monthMain;
    }

}
