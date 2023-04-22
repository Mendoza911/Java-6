package ru.netology.services;

public class WorkingService {
    public int calculate(int income, int expense, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // счёт
        float expenses; // траты на отдых
        for (int month = 1; month <= 12; month++) {
            System.out.print("Месяц " + month + ". Денег " + money + ". ");
            if (money >= threshold) {
                count++;
                money = money - expense;
                expenses = (float)(money / 3.0 ) * 2;
                money = money / 3;
                System.out.println("Буду отдыхать. Потратил -" + expense + ", затем ещё -" + Math.ceil(expenses));
            } else {
                money = money + income - expense;
                System.out.println("Придётся работать. Заработал + " + income + ", потратил " + expense);
            }
        }
        return count;

    }
}
