import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

//        //Сумма всех продаж (п.1)
//        int sumAllSales = 0;
//        for (int sale : sales) {
//            sumAllSales += sale;
//        }
//        System.out.println("Сумма всех продаж: " + sumAllSales);
//
//        //Средняя сумма продаж в месяц (п.2)
//        int averageSales = 0;
//        int sum = 0;
//        for (int sale : sales) {
//            sum += sale;
//            averageSales = sum / sales.length;
//        }
//        System.out.println("Средняя сумма продаж: " + averageSales);
//
//
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


//      //Номер последнего месяца максимальных продаж (п.3)

//        int maxMonth = 0;
//        int month = 0;
//        for (int sale : sales) {
//            if (sale >= sales[maxMonth]) {
//                maxMonth = month;
//            }
//            month = month + 1;
//        }
//        System.out.println(maxMonth);


//      //Номер последнего месяца минимальных продаж (п.4)

//        int minMonth = 0;
//        int month = 0;
//        for (int sale : sales) {
//            if (sale <= sales[minMonth]) {
//                minMonth = month;
//            }
//            month = month + 1;
//        }
//        System.out.println(minMonth);


//        //К-во месяцев в которых продажи были ниже среднего (п.5)
//        int sum = 0;
//        for (int sale : sales) {
//            sum += sale;
//        }
//        int count = 0;
//        for (int sale : sales) {
//            if (sale < sum / sales.length) {
//                count++;
//            }
//        System.out.println("К-во месяцев в которых продажи были ниже среднего: " + count);
//        }
//
//
//                    //Кол-во месяцев, в которых продажи были выше среднего (п.6)
//
                }
           }