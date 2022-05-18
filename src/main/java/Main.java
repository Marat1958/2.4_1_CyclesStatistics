import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        //Сумма всех продаж (п.1)
        int sumAllSales = 0;
        for (int sale : sales) { //Для каждого sale из sales сделать...
            sumAllSales += sale; //sumAllSales = sumAllSales + sale
        }
        System.out.println("Сумма всех продаж: " + sumAllSales);


        //Средняя сумма продаж в месяц (п.2)
        int averageSales = 0;
        for (int sale : sales) {
            averageSales = sumAllSales / sales.length;
        }
        System.out.println("Средняя сумма продаж в месяц: " + averageSales);


//        //Номера последних месяцев максимальных и минимальных продаж (п.п.3,4)
//        int maxMonth = 0;
//        int minMonth = 0;
//        int month = 0;
//        for (int sale : sales) {
//            if (sale >= sales[maxMonth]) {
//                maxMonth = month;
//            }
//            if (sale <= sales[minMonth]) {
//                minMonth = month;
//            }
//            month = month + 1;
//        }
//        System.out.println("Номер последнего месяца масимальной продажи: " + maxMonth);
//        System.out.println("Номер последнего месяца минимальной продажи: " + minMonth);


        //Номер последнего месяца максимальных продаж (п.3)
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        System.out.println("Номер последнего месяца максимальных продаж: " + maxMonth);


        //Номер последнего месяца минимальных продаж (п.4)
        int minMonth = 0;
        int month1 = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month1;
            }
            month1 = month1 + 1;
        }
        System.out.println("Номер последнего месяца минимальных продаж: " + minMonth);


        //К-во месяцев в которых продажи были ниже среднего за год (п.5)
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int count1 = 0;
        int count2 = 0;
        for (int sale : sales) {
            if (sale < sum / sales.length) {
                count1++;
            } else {
                if (sale > sum / sales.length) {
                 count2++;
                }
            }
            System.out.println("К-во месяцев в которых продажи были ниже среднего за год: " + count1);
            System.out.println("К-во месяцев в которых продажи были выше среднего за год: " + count2);

            //Кол-во месяцев, в которых продажи были выше среднего за год (п.6)
//            int sum1 = 0;
//            for (int sale1 : sales) {
//                sum1 += sale;
//            }
//            int count1 = 0;
//            for (int sale : sales) {
//                if (sale > sum1 / sales.length) {
//                    count1++;
//                }
//                System.out.println("К-во месяцев в которых продажи были выше среднего за год: " + count1);


            }
        }
    }
