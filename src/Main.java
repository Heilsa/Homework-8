import java.time.LocalDate;

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
        class AppInstallationSuggestion {
            public static void main(String[] args) {
                int clientDeviceYear = 2018;
                int osType = 0;
                suggestAppInstallation(osType, clientDeviceYear);
            }
            public static void suggestAppInstallation(int osType, int clientDeviceYear) {
                int currentYear = LocalDate.now().getYear();
                if (clientDeviceYear < 2015) {
                    if (osType == 0) {
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    } else {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    }
                } else {
                    System.out.println("Установите обычную версию приложения");
                }
            }
        }
        System.out.println("Задача 3");
        class CardDelivery {
            public static void main(String[] args) {
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
    }
}