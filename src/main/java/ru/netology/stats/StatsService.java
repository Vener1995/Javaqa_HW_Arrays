package ru.netology.stats;

public class StatsService {


    public long summarySales(long[] sales) { // сумма всех продаж за весь период
        long amountSales = 0; // начальная сумма всех продаж за период
        for (long i : sales) {
            amountSales += i;
        }
        return amountSales;
    }

    public long averageSales(long[] sales) { // средняя сумма продаж в месяц
        return summarySales(sales) / sales.length;
    }

    public int maxSales(long[] sales) { // месяц максимальных продаж
        int maxMonth = 0; // номер месяца с максимальными продажами

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) { // месяц минимальных продаж
        int minMonth = 0; // номер месяца с минимальными продажами

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesUnderAverage(long[] sales) { // количество месяцев,в которых продажи были ниже среднего
        int monthUnderAverage = 0; // количество месяцев, в которых продажи были ниже среднего

        for (long i : sales) {
            if (i < averageSales(sales)) {
                monthUnderAverage++;
            }
        }
        return monthUnderAverage;

    }

    public int salesAboveAverage(long[] sales) { //vколичество месяцев,в которых продажи были выше среднего
        int monthAboveAverage = 0; // количество месяцев, в котрых продажи были выше среднего

        for (long i : sales) {
            if (i > averageSales(sales)) {
                monthAboveAverage++;
            }
        }
        return monthAboveAverage;
    }
}

