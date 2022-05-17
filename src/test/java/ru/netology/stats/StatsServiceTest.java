package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test //Сумма всех продаж
    public void FindSumAllSales() {
        StatsService service = new StatsService();
        int actual = service.sumAllSales(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(actual, expected);
    }

    @Test //Средняя сумма продаж в месяц
    public void FindAverageSales() {
        StatsService service = new StatsService();
        int actual = service.averageSales(sales);
        int expected = 15;
        Assertions.assertEquals(actual, expected);
    }

    @Test //Номер месяца минимальных продаж
    public void FindMaxMonth() {
        StatsService service = new StatsService();
        int actual = service.maxMonth(sales);
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test //Номер месяца минимальных продаж
    public void FindMinMonth() {
        StatsService service = new StatsService();
        int actual = service.minMonth(sales);
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test //К-во месяцев с продажами ниже среднего за год
    public void FindMonthSalesUnderAverage() {
        StatsService service = new StatsService();
        int actual = service.underAverage(sales);
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test //К-во месяцев с продажами выше среднего за год
    public void FindMonthSalesAboveAverage() {
        StatsService service = new StatsService();
        int actual = service.aboveAverage(sales);
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }
}

