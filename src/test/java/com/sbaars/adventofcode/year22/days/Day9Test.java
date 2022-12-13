  package com.sbaars.adventofcode.year22.days;

  import static org.junit.jupiter.api.Assertions.assertEquals;

  import org.junit.jupiter.api.Test;
  import com.sbaars.adventofcode.year22.days.Day9;

  class Day9Test {
      Day9 day = new Day9();

      @Test
      void testPart1() {
          assertEquals("5735", day.part1().toString());
      }

      @Test
      void testPart2() {
          assertEquals("2478", day.part2().toString());
      }
  }
