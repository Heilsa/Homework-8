// Задача1
public static String checkYear(int year) {
    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
        return year + " год является високосным.";
    } else {
        return year + " год не является високосным.";
    }
}
// Задача2
public static String clientOS(int oSClient, int clientDeviceYear) {
    if (oSClient == 0 && clientDeviceYear < 2015) {
        return "Установите облегченную версию приложения для iOS по ссылке.";
    } else if (oSClient == 1 && clientDeviceYear < 2015) {
        return "Установите облегченную версию приложения для Android по ссылке.";
    } else if (oSClient == 0 && clientDeviceYear >= 2015) {
        return "Установите версию приложения для iOS по ссылке.";
    } else if (oSClient == 1 && clientDeviceYear >= 2015) {
        return "Установите версию приложения для Android по ссылке.";
    }
    return "";
}
// Задача3
public static String checkDay(int deliveryDistance) {
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
public static void main(String[] args) {

    System.out.println(checkYear(2021));

    System.out.println(clientOS(0, 2002));

    System.out.println(checkDay(95));
}

