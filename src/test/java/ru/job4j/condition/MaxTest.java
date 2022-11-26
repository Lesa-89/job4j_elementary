package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To5Then5() {
        int left = 3;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5To6Then6() {
        int first = 5;
        int second = 5;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    public void whenMax7To5To6Then6() {
        int first = 7;
        int second = 5;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    public void whenMax5To7To6Then6() {
        int first = 5;
        int second = 7;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    public void whenMax5To5To5Then5() {
        int first = 5;
        int second = 5;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    public void whenMax5To5To6To6Then6() {
        int first = 5;
        int second = 5;
        int third = 6;
        int fourth = 6;
        int result = Max.max(first, second, third, fourth);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    public void whenMax8To5To6To6Then6() {
        int first = 8;
        int second = 5;
        int third = 6;
        int fourth = 6;
        int result = Max.max(first, second, third, fourth);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    public void whenMax5To5To5To5Then5() {
        int first = 5;
        int second = 5;
        int third = 5;
        int fourth = 5;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}
