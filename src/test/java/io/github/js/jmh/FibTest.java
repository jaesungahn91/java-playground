package io.github.js.jmh;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibTest {

//    @Test
//    public void testFib() {
//        assertThat(Fib.fibClassic(12)).isEqualTo(144);
//        assertThat(Fib.tailRecFib(12)).isEqualTo(144);
//    }

    @Test
    public void testFib() {
        assertEquals(144, Fib.fibClassic(12));
        assertEquals(144, Fib.tailRecFib(12));
    }
}