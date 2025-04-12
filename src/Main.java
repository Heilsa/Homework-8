public class Main {
    public static void main(String[] args) {
        // Задача 1
        Main main = new Main();
        System.out.println(main.checkYear(2002));
        // Задача 2
        clientOS(1, 2019);
        // Задача 3
        System.out.println(main.checkDay(50));
    }
    // Задача 1
    public String checkYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return year + " год является високосным.";
        } else {
            return year + " год не является високосным.";
        }
    }
    // Задача 2
    public static void clientOS(int oSClient, int clientDeviceYear) {
        String operationSystem = oSClient == 1 ? "Android" : "iOS"; //
        String versionApp = clientDeviceYear >= 2015 ? "Обычную версию" : "Облегченную версию";
        System.out.println("Ваша операционная система: " + operationSystem + ". Установите: " + versionApp);
    }
    // Задача 3
    public String checkDay(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance <= 20) {
            return "Потребуется дней: " + day;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return "Потребуется дней: " + (day + 1);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return "Потребуется дней: " + (day + 2);
        } else {
            return "Свыше 100 км доставки нет.";
        }
    }
}