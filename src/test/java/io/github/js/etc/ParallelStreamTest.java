package io.github.js.etc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ParallelStreamTest {

    @Test
    void stream() {
        List<Integer> listOfNumbers = List.of(1, 2, 3, 4);
        int sum = listOfNumbers.stream().reduce(5, Integer::sum);

        assertThat(sum).isEqualTo(15);
    }

    @Test
    void parallelStream() {
        List<Integer> listOfNumbers = List.of(1, 2, 3, 4);
        int sum = listOfNumbers.parallelStream().reduce(5, Integer::sum);
        assertThat(sum).isNotEqualTo(15);

        int sum2 = listOfNumbers.parallelStream().reduce(0, Integer::sum) + 5;
        assertThat(sum2).isEqualTo(15);
    }
}
