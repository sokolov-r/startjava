package com.startjava.lesson_4.game;
public class Player {

	private String name;
	private int number;
	private int numberOfAnswer;
	private int[] numbers = new int[10];

	public int getNumberOfAnswer() {
		return numberOfAnswer;
	}

	public void setNumberOfAnswer(int numberOfAnswer) {
		this.numberOfAnswer = numberOfAnswer;
	}

	public void setNumberInArr(int number) {
		this.numbers[numberOfAnswer] = number;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}


}