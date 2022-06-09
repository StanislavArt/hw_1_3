public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Задано неверное значение переменной 'clientOS'");
        }
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2014;

        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Задано неверное значение переменной 'clientOS'");
        }
    }

    public static void task3() {
        int year = 2100;

        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else {
            int deliveryDays = (deliveryDistance - 20) / 40 + 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }

    public  static void task5() {
        int monthNumber = 6;
        String nameMonth;
        String nameSeason;

        switch (monthNumber) {
            case 1: nameMonth = "январь"; nameSeason = "зима"; break;
            case 2: nameMonth = "февраль"; nameSeason = "зима"; break;
            case 3: nameMonth = "март"; nameSeason = "весна"; break;
            case 4: nameMonth = "апрель"; nameSeason = "весна"; break;
            case 5: nameMonth = "май"; nameSeason = "весна"; break;
            case 6: nameMonth = "июнь"; nameSeason = "лето"; break;
            case 7: nameMonth = "июль"; nameSeason = "лето"; break;
            case 8: nameMonth = "август"; nameSeason = "лето"; break;
            case 9: nameMonth = "сентябрь"; nameSeason = "осень"; break;
            case 10: nameMonth = "октябрь"; nameSeason = "осень"; break;
            case 11: nameMonth = "ноябрь"; nameSeason = "осень"; break;
            case 12: nameMonth = "декабрь"; nameSeason = "зима"; break;
            default:
                System.out.println("Неверно задан номер месяца");
                return;
        }
        System.out.println(monthNumber + " месяц (он же " + nameMonth + ") принадлежит к сезону " + nameSeason);
    }
}

