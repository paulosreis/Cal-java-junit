package com.cal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

public class CalTest {

    private final Cal cal = new Cal();

    @Test
    void calTestNull() {
        Cal myCal = new Cal();
        Calendar cl = Calendar.getInstance();
        int y = cl.get(Calendar.YEAR);
        int m = cl.get(Calendar.MONTH) + 1;

        String expected = // " Abril 2023\n"+
                          // "Do Se Te Qa Qi Se Sa\n"+
                "                   1\n" +
                        " 2  3  4  5  6  7  8\n" +
                        " 9 10 11 12 13 14 15\n" +
                        "16 17 18 19 20 21 22\n" +
                        "23 24 25 26 27 28 29\n" +
                        "30 ";

        String result = myCal.cal(myCal.firstOfMonth(m, y),
                myCal.numberOfDays(m, y));

        assertEquals(expected, result);

    }

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

    @Test
    public void isLeapTest() {

        boolean result = cal.isLeap(2024);
        assertTrue(result, "deve der bissexto");

        result = cal.isLeap(2023);
        assertFalse(result, "não deve serbissexto");

        result = cal.isLeap(1752);
        assertTrue(result, "não deve serbissexto");
    }

}
