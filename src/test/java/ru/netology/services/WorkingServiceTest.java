package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class WorkingServiceTest {

    @ParameterizedTest
    @CsvSource({
            "10000, 3000, 20000",
            "100000, 60000, 150000"
    })
    void shouldCalculateForRegisteredAndUnderLimit(int income, int expense, int threshold) {
        WorkingService service = new WorkingService();

        // вызываем целевой метод:
        long actual = service.calculate(income, expense, threshold);

    }
}
