package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    String [] str = new String[3];
    int i = 0;
        while (i < 3) {
        System.out.println("-----------НАЧАЛО ИГРЫ-----------");

        System.out.println("*|Загадывайте число (от 2 до 12):");
        int predictAmount = scanner.nextInt();
        System.out.println("*|Игрок бросил кости...");

        int a = random();
        int b = random();

        int sum = a + b;
        int resultOfUser = sum - Math.abs(sum - predictAmount) * 2;

        cube(a);
        cube(b);
        System.out.println("*|Общая сумма костей:" + sum + "очков.");
        System.out.println("*|Результат:" + resultOfUser + "очков.");

////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("----------------------------ХОД КОМПЮТЕРА-----------------------------------");
        int computerPredictAmount = random.nextInt(10) + 2;
        System.out.println("*|Загадывайте число(от 2 до 12):Компютер выбрал -> " + computerPredictAmount);

        System.out.println();
        System.out.println("*|Компютер бросил кости...");

        int computerChoice = random();
        int computerSecondChoice = random();

        int sumOfComputer = computerChoice + computerSecondChoice;

        cube(computerChoice);
        cube(computerSecondChoice);
        int resultOfComputer = sumOfComputer - Math.abs(sumOfComputer - computerPredictAmount) * 2;

        System.out.println("*|Общая сумма костей:" + sumOfComputer + "очков.");
        System.out.println("*|Результат:" + resultOfComputer + "очков.");


        if (resultOfUser > resultOfComputer) {
            int userWin = resultOfUser-resultOfComputer;
            System.out.println();
            System.out.println("*|Игрок выиграл Компютера на:" + Math.abs(userWin));
            System.out.println();
        } else if (resultOfComputer>resultOfUser) {
            int computerWin = resultOfComputer-resultOfUser;
            System.out.println();
            System.out.println("*|Компютер выграл Игрока на:" + Math.abs(computerWin));
            System.out.println();
        } else {
            System.out.println();
            System.out.println("*|Ничья!");
            System.out.println();
        }
        str[i]=
                "|       |ЗАГАДЫВАНИЕ:"+predictAmount+"             |ЗАГАДЫВАНИЕ:"+computerPredictAmount+"\n"+
                        "|   "+(i+1)+"   |КОСТИ:"+sum+"                   |КОСТИ:"+sumOfComputer+"\n"+
                        "|       |РЕЗУЛЬТАТ:"+resultOfUser+"               |РЕЗУЛЬТАТ:"+resultOfComputer;
        i++;
    }
        System.out.println("|----------------------------------------------------------|");
        System.out.println("| РАУНД |ПОЛЬЗОВАТЕЛЬ              |КОМПЮТЕР  ");
        for(int j=0; j<str.length; j++){
        System.out.println("|-------+--------------------------+-----------------------|");
        System.out.println(str[j]);
    }
        System.out.println("|----------------------------------------------------------|");
}

    public static int random () {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
    public static void cube ( int a) {
        int i = 0;
        switch (a) {
            case (1) -> {
                System.out.println(" _______");
                System.out.println("|       |");
                System.out.println("|   #   |");
                System.out.println("|       |");
                System.out.println(" -------");
            }
            case (2) -> {
                System.out.println(" _______");
                System.out.println("| #     |");
                System.out.println("|       |");
                System.out.println("|     # |");
                System.out.println(" -------");
            }
            case (3) -> {
                System.out.println(" _______");
                System.out.println("|     # |");
                System.out.println("|   #   |");
                System.out.println("| #     |");
                System.out.println(" -------");
            }
            case (4) -> {
                System.out.println(" _______");
                System.out.println("| #   # |");
                System.out.println("|       |");
                System.out.println("| #   # |");
                System.out.println(" -------");
            }
            case (5) -> {
                System.out.println(" _______");
                System.out.println("| #   # |");
                System.out.println("|   #   |");
                System.out.println("| #   # |");
                System.out.println(" -------");
            }
            case (6) -> {
                System.out.println(" _______");
                System.out.println("| #   # |");
                System.out.println("| #   # |");
                System.out.println("| #   # |");
                System.out.println(" -------");
            }
            default -> {
            }
        }
    }
}
