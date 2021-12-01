package com.adventofcode.michaeldelbe.day1;

import com.adventofcode.michaeldelbe.day1.day1.Day01;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.lang.String.format;

class Day01Test {

  @Test
  void testPart1() throws IOException {
    List<String> input = Files.readAllLines(Paths.get("src/test/resources/Day01.txt"));

    int i = Day01.part1(input);
    System.out.println(format("Increments: %s", i));
  }

  @Test
  void testPart2() throws IOException {
    List<String> input = Files.readAllLines(Paths.get("src/test/resources/Day01.txt"));

    int i = Day01.part2(input);
    System.out.println(format("Increments: %s", i));
  }
}
