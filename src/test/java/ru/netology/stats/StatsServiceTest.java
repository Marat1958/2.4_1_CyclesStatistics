package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test //Сумма всех продаж
    public void shouldSumAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sumAllSales(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(actual, expected);
    }

    @Test //Средняя сумма продаж в месяц
    public void shouldAverageSales() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.averageSales(sales);
        int expected = 15;
        Assertions.assertEquals(actual, expected);
    }

    @Test //Номер месяца минимальных продаж
    public void shouldMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxMonth(sales);
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test //Номер месяца минимальных продаж
    public void shouldMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minMonth(sales);
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test //К-во месяцев с продажами ниже среднего за год
    public void shouldMonthSalesUnderAverage() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.underAverage(sales);
        double expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test //К-во месяцев с продажами выше среднего за год
    public void shouldMonthSalesUpperAverage() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.upperAverage(sales);
        double expected = 5;
        Assertions.assertEquals(actual, expected);
    }
}


