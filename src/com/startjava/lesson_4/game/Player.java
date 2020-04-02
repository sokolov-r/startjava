package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

	private String name;
	private int numberOfAnswer;
	private int[] numbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumberOfAnswer() {
		return numberOfAnswer;
	}

	public void setNumberOfAnswer(int numberOfAnswer) {
		this.numberOfAnswer = numberOfAnswer;
	}

	public int[] getNumbers() {
		return Arrays.copyOf(numbers, numberOfAnswer);
	}

	public int getNumber() {
		return numbers[numberOfAnswer - 1];
	}

	public void setNumber(int number) {
		this.numbers[numberOfAnswer] = number;
		numberOfAnswer++;
	}

	public void clear() {
		Arrays.fill(numbers, 0, numberOfAnswer, 0);
	}
}