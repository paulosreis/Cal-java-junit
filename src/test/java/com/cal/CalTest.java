package com.cal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalTest {

    private final Cal cal = new Cal();

    @Test
    public void firstOfMonthTest() {
        // Mês de fevereiro ano não bissexto
        int result = cal.firstOfMonth(2, 2023);
        assertEquals(3, result, "resultado deve ser quarta");

        // fevereiro ano bissexfo
        result = cal.firstOfMonth(2, 2024);
        assertEquals(4, result, "deve ser quinta");

        // janeiro de 1752
        result = cal.firstOfMonth(1, 1752);
        assertEquals(3, result, "deve ser terça");
    }

    @Test
    public void numberOfDaysTest() {

        int result = cal.numberOfDays(2, 2023);
        assertEquals(28, result, "tem que ter 28 dias");

        result = cal.numberOfDays(2, 2024);
        assertEquals(29, result, "tem que ter 28 dias");

        result = cal.numberOfDays(9, 1752);
        assertEquals(19, result, "tem que ter 19 dias");

    }

}
