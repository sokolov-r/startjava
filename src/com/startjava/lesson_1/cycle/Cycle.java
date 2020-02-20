package com.startjava.lesson_1.cycle;

public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i < 21; i++) {
			System.out.println(i);
		}

		int j = 6;
		while (j > -7) {
			System.out.println(j);
			j -= 2;
		}

		int num = 10;
		int sum = 0;
		do {
			if ((num % 2) > 0) {
				sum += num;
			}
			num++;
		} while (num < 20);
		System.out.println(sum);
	}
}