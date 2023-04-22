package org.example;

import ru.netology.services.WorkingService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        WorkingService service = new WorkingService();
//        int income = 10000; // доход от работы
//        int expense = 3000; // траты на отдых
//        int threshold = 0; // граница денег
//        ws.calculate(10000, 3000, 20000);
        service.calculate(10000, 3000, 20000);

    }
}