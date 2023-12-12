package ru.netology.stats;

public class StatsService {


    public int summarySales(long[] sales) { // сумма всех продаж за весь период
        int amountSales = 0; // начальная сумма всех продаж за период
        for (long sale : sales) {
            amountSales += sale;
        }
        return amountSales;
    }

    public int averageSales(long[] sales) { // средняя сумма продаж в месяц
        int amountSales = summarySales(sales);
        return amountSales / sales.length;
    }

    public int maxSales(long[] sales) { // месяц максимальных продаж
        int maxMonth = 0; // номер месяца с максимальными продажами

        for (int sale = 0; sale < sales.length; sale++) {
            if (sales[sale] >= sales[maxMonth]) {
                maxMonth = sale;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) { // месяц минимальных продаж
        int minMonth = 0; // номер месяца с минимальными продажами

        for (int sale = 0; sale < sales.length; sale++) {
            if (sales[sale] <= sales[minMonth]) {
                minMonth = sale;
            }
        }
        return minMonth + 1;
    }

    public int salesUnderAverage(long[] sales) { // количество месяцев,в которых продажи были ниже среднего
        int monthUnderAverage = 0; // количество месяцев, в которых продажи были ниже среднего
        int middle = averageSales(sales);
        for (long sale : sales) {
            if (sale < middle) {
                monthUnderAverage++;
            }
        }
        return monthUnderAverage;
    }

    public int salesAboveAverage(long[] sales) { // количество месяцев,в которых продажи были выше среднего
        int monthAboveAverage = 0; // количество месяцев, в котрых продажи были выше среднего
        int middle = averageSales(sales);
        for (long sale : sales) {
            if (sale > middle) {
                monthAboveAverage++;
            }
        }
        return monthAboveAverage;
    }
}

