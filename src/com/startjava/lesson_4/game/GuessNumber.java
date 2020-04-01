package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumber {

	private int randomNumber;
	private Player player1, player2;
	private boolean isOk;
	private Scanner scan = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	private void compareNumbers(Player player) {
		if (player.getNumberFromArr() > randomNumber) {
			System.out.println("Загаданное число меньше");
		} else if (player.getNumberFromArr() < randomNumber) {
			System.out.println("Загаданное число больше");
		} else {
			System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " c " + (player.getNumberOfAnswer() + 1) + " попытки");
			isOk = true;
		}
	}

	private void answer(Player player) {
		if (player.getNumberOfAnswer() < 10) {
			System.out.println("Отвечает " + player.getName());
//			player.setNumber(scan.nextInt());
			player.setNumberInArr(scan.nextInt());
			compareNumbers(player);
			player.setNumberOfAnswer(player.getNumberOfAnswer() + 1);
		}
		if (player.getNumberOfAnswer() == 10){
			System.out.println("У " + player.getName() + " закончились попытки");
		}
	}

	private void printAnswers(Player player) {
		for (int num : player.getNumbers()) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public void start() {
		randomNumber = (int)(Math.random() * 101);
		System.out.println("Отгадайте число от 0 до 100");
		System.out.println("У вас 10 попыток");

		do {
			answer(player1);
			if (isOk) {
				printAnswers(player1);
				printAnswers(player2);
				break;
			}

			answer(player2);
			if ((player2.getNumberOfAnswer() == 10) || (isOk)) {
				printAnswers(player1);
				printAnswers(player2);
				break;
			}
		} while (true);

		player1.arrayCleaning();
		player2.arrayCleaning();
		player1.setNumberOfAnswer(0);
		player2.setNumberOfAnswer(0);
		isOk = false;
	}
}