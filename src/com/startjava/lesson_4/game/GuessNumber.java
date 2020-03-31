package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

	private int randomNumber;
	private Player player1, player2;
	private boolean isOk;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	private void printAnswers(Player player) {
		for (int num : player.getNumbers()) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	private void answer(Player player) {
		Scanner scan = new Scanner(System.in);
		if (player.getNumberOfAnswer() < 10) {
			System.out.println("Отвечает " + player.getName());
			player.setNumber(scan.nextInt());
			player.setNumberInArr(player.getNumber());
			player.setNumberOfAnswer(player.getNumberOfAnswer() + 1);

			if (player.getNumber() > randomNumber) {
				System.out.println("Загаданное число меньше");
			} else if (player.getNumber() < randomNumber) {
				System.out.println("Загаданное число больше");
			} else {
				System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " c " + player.getNumberOfAnswer() + " попытки");
				isOk = true;
			}
		}
		if (player.getNumberOfAnswer() == 10){
			System.out.println("У " + player.getName() + " закончились попытки");
		}
	}

	public void start() {
		randomNumber = (int)(Math.random() * 101);
		System.out.println("Отгадайте число от 0 до 100");
		System.out.println("У вас 10 попыток");

		player1.arrayCleaning();
		player2.arrayCleaning();

		player1.setNumberOfAnswer(0);
		player2.setNumberOfAnswer(0);
		isOk = false;

		do {
			answer(player1);
			answer(player2);

			if ((player1.getNumberOfAnswer() == 10) || (isOk)) {
				printAnswers(player1);
				printAnswers(player2);
				break;
			}
		} while (true);
	}
}