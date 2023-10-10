package ru.netology.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VacationServiceTest {
    @Test
    void testCalculateVacationMonths1() {
        VacationService service = new VacationService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;

        int actual = service.calculateVacationMonths(income, expenses, threshold);
        assertEquals(expected, actual);
    }
    @Test
    void testCalculateVacationMonths2() {
        VacationService service = new VacationService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;

        int actual = service.calculateVacationMonths(income, expenses, threshold);
        assertEquals(expected, actual);
    }
}
