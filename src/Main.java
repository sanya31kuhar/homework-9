import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // task 1
        int year = 2022;
        getYear(year);

        // task 2
        int clientOs = 0;
        int clientDeviceYear = 2015;
        applicationParameters(clientOs, clientDeviceYear);

        //task3
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + itWillTakeDays(deliveryDistance));
    }

    public static void getYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - Високосный год");
        } else {
            System.out.println(year + " Не високосный год");
        }
    }

    static void applicationParameters(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            }
        }
    }
    static int itWillTakeDays(int km) {
        int deliveryDays = 1;
        if (km > 20) {
            deliveryDays++;
        }
        if (km > 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }
}

