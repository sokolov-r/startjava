package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

	private int randomNumber;
	private Player player1, player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		Scanner scan = new Scanner(System.in);
		randomNumber = (int)(Math.random() * 101);
		System.out.println("Отгадайте число от 0 до 100");
		System.out.println("У вас 10 попыток");

		Arrays.fill(player1.getNumbers(), 0, player1.getNumberOfAnswer(), 0);
		Arrays.fill(player2.getNumbers(), 0, player2.getNumberOfAnswer(), 0);
		player1.setNumberOfAnswer(0);
		player2.setNumberOfAnswer(0);


		do {
			if (player1.getNumberOfAnswer() < 10) {
				System.out.println("Отвечает " + player1.getName());
				player1.setNumber(scan.nextInt());
				player1.setNumberInArr(player1.getNumber());
				player1.setNumberOfAnswer(player1.getNumberOfAnswer() + 1);

				if (player1.getNumber() > randomNumber) {
					System.out.println("Загаданное число меньше");
				} else if (player1.getNumber() < randomNumber) {
					System.out.println("Загаданное число больше");
				} else {
					System.out.println("Игрок " + player1.getName() + " угадал число " + randomNumber + " c " + player1.getNumberOfAnswer() + " попытки");
					break;
				}
			}
			if (player1.getNumberOfAnswer() == 10){
				System.out.println("У " + player1.getName() + " закончились попытки");
			}


			if (player2.getNumberOfAnswer() < 10) {
				System.out.println("Отвечает " + player2.getName());
				player2.setNumber(scan.nextInt());
				player2.setNumberInArr(player2.getNumber());
				player2.setNumberOfAnswer(player2.getNumberOfAnswer() + 1);

				if (player2.getNumber() > randomNumber) {
					System.out.println("Загаданное число меньше");
				} else if (player2.getNumber() < randomNumber) {
					System.out.println("Загаданное число больше");
				} else {
					System.out.println("Игрок " + player2.getName() + " угадал число " + randomNumber + " c " + player2.getNumberOfAnswer() + " попытки");
					break;
				}
			}
			if (player2.getNumberOfAnswer() == 10){
				System.out.println("У " + player2.getName() + " закончились попытки");
			}

			if (player1.getNumberOfAnswer() == 10) {
				for (int num : player1.getNumbers()) {
					System.out.print(num + " ");
				}
				System.out.println();
				for (int num : player2.getNumbers()) {
					System.out.print(num + " ");
				}
				System.out.println();
				break;
			}
		} while (true);
	}
}