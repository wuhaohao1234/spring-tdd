package com.tdd.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;
public class FizzBuzzTest {
    @Test
    void testFizzBuzz() {
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.of(7)).isEqualTo("7");
    }
}
