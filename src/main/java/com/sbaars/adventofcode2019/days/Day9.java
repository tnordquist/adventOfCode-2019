package com.sbaars.adventofcode2019.days;

import java.io.IOException;

import com.sbaars.adventofcode2019.common.Day;
import com.sbaars.adventofcode2019.intcode.IntcodeComputer;
import com.sbaars.adventofcode2019.util.DoesFileOperations;

public class Day9 implements Day, DoesFileOperations {

	public static void main(String[] args) throws IOException {
		new Day9().printParts();
	}

	@Override
	public int part1() throws IOException { // Just append a 2 to the number ;-)
		return Math.toIntExact(new IntcodeComputer(9, 1).run()-2000000000L);
	}
	
	@Override
	public int part2() throws IOException {
		return new IntcodeComputer(9, 2).runInt();
	}
}
