package com.sbaars.adventofcode2019.days;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.sbaars.adventofcode2019.common.Day;

public class Day16 implements Day {

	private static final int TARGET_POS = 5977341;
	private final int[] input;

	public Day16() throws IOException {
		input = readDay(16).chars().map(e -> Character.getNumericValue(e)).toArray();
	}

	public static void main(String[] args) throws IOException {
		new Day16().printParts();
	}

	@Override
	public Object part1() throws IOException {
		return calcRes(Arrays.copyOf(input, input.length), 0);
	}

	@Override
	public Object part2() throws IOException {
		return calcRes(repeat(input, 10000), TARGET_POS);
	}

	private Object calcRes(int[] nums, final int offset) {
		int[] pattern = {0, 1, 0, -1};

		int[] res = new int[nums.length];
		for(int phase = 0; phase<100; phase++) {
			int[] newNums = new int[nums.length+1];
			for(int i=0;i<nums.length;i++) {
				newNums[i+1]=newNums[i]+nums[i];
			}
			for(int i = 0; i<nums.length; i++) {
				int sum = 0, loc = 0;
				for(int j=0; true;j++) {

					int k=((j+1)*(i+1))-1;
					sum += (newNums[Math.min(k, res.length)] - newNums[loc]) * pattern[j%4];
					if(k >= res.length) break;
					loc=k;
				}
				res[i]=Math.abs(sum)%10;
			}

			System.arraycopy(res, 0, nums, 0, res.length);
		}
		return IntStream.range(offset, offset+8).map(i -> res[i]).mapToObj(Integer::toString).collect(Collectors.joining());
	}

	public static int[] repeat(int[] arr, int newLength) {
		newLength = newLength * arr.length;
		int[] dup = Arrays.copyOf(arr, newLength);
		for (int last = arr.length; last != 0 && last < newLength; last <<= 1) {
			System.arraycopy(dup, 0, dup, last, Math.min(last << 1, newLength) - last);
		}
		return dup;
	}

}
