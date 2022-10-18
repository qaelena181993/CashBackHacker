package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateIfAmount1000() {

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmountZero() {

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmountNegative() {

        int amount = -1;
        int actual = service.remain(amount);
        int expected = 1001;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmount2500() {

        int amount = 2500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }
}
