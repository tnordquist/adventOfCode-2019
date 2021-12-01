package com.sbaars.adventofcode.template.days;

import com.sbaars.adventofcode.template.Day2021;

public class Day1 extends Day2021 {
  public Day1() {
    super(1);
  }

  public static void main(String[] args) {
    new Day1().printParts();
  }

  @Override
  public Object part1() {
    String input = day();
    return input;
  }

  @Override
  public Object part2() {
    return 0;
  }
}