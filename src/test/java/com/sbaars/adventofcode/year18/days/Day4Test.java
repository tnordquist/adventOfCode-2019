package com.sbaars.adventofcode.year18.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day4Test {
    Day4 day = new Day4();
    @Test
    void testPart1() {
        assertEquals("39698", day.part1().toString());
    }
    @Test
    void testPart2() {
        assertEquals("14920", day.part2().toString());
    }
}
