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
        System.out.println("Затрудняюсь, с чего начать");
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