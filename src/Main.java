public class Main {
    // Задача 1
    public static void printLeapYear(int leapYear) {
        System.out.println(leapYear + " год - высокосный год");
    }
    public static void printNotLeapYear(int leapYear) {
        System.out.println(leapYear + " год - не высокосный год");
    }
    public static void main(String[] args) {
        int year = 1984;
        int leapYear = year - 1584;
        if (year >= 1584 && leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            printLeapYear(year);
        } else {
            printNotLeapYear(year);
        }
        // Задача 2
        int clientOS = 1;
        int clientDeviceYear = 2015;
        recommendAppVersion(clientOS, clientDeviceYear);
    }
    public static void recommendAppVersion(int clientOS, int clientDeviceYear) {
        String osType;
        if (clientOS == 0) {
            osType = "iOS";
        } else {
            osType = "Android";
        }
        if (clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для " + osType + " по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для " + osType + " по ссылке");
        }
        // Задача 3
        int distance = 65;
        deliveryDay(distance);
        if (distance == -1) {
            System.out.println("Свыше 100 км доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDay(distance) + " срок доставки");
        }
    }
    public static int deliveryDay(int distance) {
        if (distance < 20 && distance >= 0) {
            return 1;
        } else if (distance > 20 && distance < 60) {
            return 2;
        } else if (distance > 60 && distance < 100) {
            return 3;
        } else {
            return -1;
        }
    }
}

