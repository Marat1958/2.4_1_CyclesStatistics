package ru.netology.stats;

public class StatsService {

    //Сумма всех продаж
    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) { //Для каждого sale из sales сделать...
            sum += sale; //sumAllSales = sumAllSales + sale
        }
        return sum;
    }

    //Средняя сумма продаж в месяц
    public double averageSales(double[] sales) {
        double averageSales = 0;
        for (double sale : sales) {
            averageSales += sale /sales.length;
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
    public double underAverage(double[] sales) {
        double underMonths = 0;
        for (double sale : sales) {
            if (sale < averageSales(sales)) {
                underMonths = underMonths + 1;
            }
        }
        return underMonths;
    }

    //К-во месяцев с продажами выше среднего за год
    public double upperAverage(double[] sales) {
         double upperMonth = 0;
         for (double sale : sales) {
             if (sale > averageSales(sales)) {
                 upperMonth = upperMonth + 1;
             }
         }
         return upperMonth;
    }
 }