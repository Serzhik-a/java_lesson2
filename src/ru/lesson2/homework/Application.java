package ru.lesson2.homework;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Room room = new Room("Kitchen", 300, 275, 350, "Yellow");
        Human human = new Human("Дмитрий", 24, 176, 'M', 148);
        Giraffe giraffe = new Giraffe("Пятнах", 8, 560, 'M', "Zoo");
        Scanner scanner = new Scanner(System.in);
        StringBuilder input;

        while (true) {
            System.out.print("Что вы хотите посмотреть?: ");
            input = new StringBuilder(scanner.nextLine().toLowerCase());
            switch (input.toString()) {
                case ("посмотреть человека"): {
                    System.out.println(human.toString());
                    human.canWalking();
                    human.canMovingObjects();
                    human.canReading();
                    human.canProgramming();
                    return;
                }
                case ("посмотреть комнату"): {
                    System.out.println(room.toString());
                    room.canDusting();
                    room.canMeasure();
                    room.getSize();
                    room.getVolume();
                    room.canWash();
                    return;
                }
                case ("посмотреть жирафа"): {
                    System.out.println(giraffe.toString());
                    giraffe.canEating();
                    giraffe.canSleep();
                    giraffe.canWalking();
                    giraffe.canSwim();
                    giraffe.canJump();
                    return;
                }
                default: {
                    System.out.println("Try input again");
                }
            }
        }


    }
}
