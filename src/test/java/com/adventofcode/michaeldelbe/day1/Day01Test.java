package com.adventofcode.michaeldelbe.day1;

import com.adventofcode.michaeldelbe.day1.day1.Day01;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Day01Test {

  @Test
  void testPart1_example() {
    List<String> input =
        List.of("199", "200", "208", "210", "200", "207", "240", "269", "260", "263");
    int actual = Day01.part1(input);

    assertThat(actual).isEqualTo(7);
  }

  @Test
  void testPart1() throws IOException {
    List<String> input = Files.readAllLines(Paths.get("src/test/resources/Day01.txt"));

    int actual = Day01.part1(input);

    assertThat(actual).isEqualTo(1462);
  }

  @Test
  void testPart2() throws IOException {
    List<String> input = Files.readAllLines(Paths.get("src/test/resources/Day01.txt"));

    int actual = Day01.part2(input);

    assertThat(actual).isEqualTo(1497);
  }
}
