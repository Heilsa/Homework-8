public class Main {
    public static void printLeapYear(int year) {
        System.out.println(year + " год - высокосный год");
    }
    public static void printNotLeapYear(int year) {
        System.out.println(year + " год - не высокосный год");
        // Задача 1
        year = 2002;
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            printLeapYear(year);
        } else {
            printNotLeapYear(year);
        }
    }
    public static void main(String[] args) {

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
    }

    // Задача 3
    public static int deliveryDays(int deliveryDistance) {
        int deliveryDays = 3;
        {
            if (deliveryDays == -1) {
                System.out.println("Свыше 100 км доставки нет");
            } else {
                System.out.println("Потребуется дней: " + deliveryDays + " срок доставки");
            }
            if (deliveryDistance < 0) {
                return -1;
            } else if (deliveryDistance <= 20) {
                return 1;
            } else if (deliveryDistance <= 60) {
                return 2;
            } else if (deliveryDistance <= 100) {
                return 3;
            } else {
                return -1;
            }
        }
    }
}
