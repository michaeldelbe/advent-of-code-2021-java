package com.adventofcode.michaeldelbe.day1.day1;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class Day01 {

  public static int part1(List<String> input) {

    int increments = 0;

    for (int i = 0; i < input.toArray().length; i++) {

      if (i > 0) {

        String previous = input.get(i - 1);

        if (parseInt(input.get(i)) > parseInt(previous)) {
          increments++;
        }
      }
    }
    return increments;
  }

  public static int part2(List<String> input) {

    int increments = 0;

    for (int i = 0; i < input.toArray().length - 2; i++) {

      if (i > 0) {

        int previousWindowValue =
            getWindow(input, i - 1).stream().mapToInt(Integer::intValue).sum();
        int windowValue = getWindow(input, i).stream().mapToInt(Integer::intValue).sum();

        if (windowValue > previousWindowValue) {
          increments++;
        }
      }
    }
    return increments;
  }

  private static List<Integer> getWindow(List<String> input, int idx) {
    List<String> window = List.of(input.get(idx), input.get(idx + 1), input.get(idx + 2));
    return window.stream().map(Integer::parseInt).collect(Collectors.toList());
  }
}
