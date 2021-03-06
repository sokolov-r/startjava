package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumber {

    private int randomNumber;
    private Player player1, player2;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        randomNumber = (int) (Math.random() * 101);
        System.out.println("Отгадайте число от 0 до 100");
        System.out.println("У вас 10 попыток");

        do {
            if (makeMove(player1)) {
                break;
            }

            if (makeMove(player2)) {
                break;
            }
        } while (player2.getNumberOfAnswer() != 10);
        printAnswers(player1);
        printAnswers(player2);

        player1.clear();
        player2.clear();
        player1.setNumberOfAnswer(0);
        player2.setNumberOfAnswer(0);
    }

    private boolean makeMove(Player player) {
        if (player.getNumberOfAnswer() < 10) {
            inputNumber(player);
            if (compareNumbers(player)) {
                return true;
            }
        }
        if (player.getNumberOfAnswer() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private void inputNumber(Player player) {
        System.out.println("Отвечает " + player.getName());
        player.setNumber(scan.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " c " + (player.getNumberOfAnswer()) + " попытки");
            return true;
        } else if (player.getNumber() > randomNumber) {
            System.out.println("Загаданное число меньше");
        } else if (player.getNumber() < randomNumber) {
            System.out.println("Загаданное число больше");
        }
        return false;
    }

    private void printAnswers(Player player) {
        for (int num : player.getNumbers()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}