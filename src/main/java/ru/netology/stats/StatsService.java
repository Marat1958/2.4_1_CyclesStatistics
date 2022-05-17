package ru.netology.stats;

public class StatsService {

    //Сумма всех продаж
    public int sumAllSales(int[] sales) {
        int sumAllSales = 0;
        for (int sale : sales) { //Для каждого sale из sales сделать...
            sumAllSales += sale; //sumAllSales = sumAllSales + sale
        }
        return sumAllSales;
    }


    //Средняя сумма продаж в месяц
    public int averageSales(int[] sales) {
        int averageSales = 0;
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
            averageSales = sum / sales.length;
        }
        return averageSales;
    }


    //Номер месяца максимальных продаж
    public int maxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    //Номер месяца минимальных продаж
    public int minMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    //К-во месяцев с продажами ниже среднего за год
    public int underAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int count = 0;
        for (int sale : sales) {
            if (sale < sum / sales.length) {
                count++;
            }
        }
        return count;
    }

    //К-во месяцев с продажами ниже среднего за год
    public int aboveAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int count = 0;
        for (int sale : sales) {
            if (sale > sum / sales.length) {
                count++;
            }
        }
        return count;
    }
}