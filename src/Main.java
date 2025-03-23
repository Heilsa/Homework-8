public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2025;
        checkLeapYear(year);
    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        recommendVersion(clientOS, clientDeviceYear);
    }

    public static void recommendVersion(int clientOS, int clientDeviceYear) {
        String osType;
        if (clientOS == 1) {
            osType = "iOS";
        } else {
            osType = "Android";
        }
        if (clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для " + osType + " по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для " + osType + " по ссылке");
        }
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
}
