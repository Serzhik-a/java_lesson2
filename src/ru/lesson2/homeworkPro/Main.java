package ru.lesson2.homeworkPro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Room room = new Room(12, "Зал", 300, 275, 350, "Yellow");
        Man man = new Man("Дмитрий", 24, 176, 148);
        Woman woman = new Woman("Анна", 22, 169, 568);
        Giraffe giraffe = new Giraffe("Пятнах", 8, 560, 'M', "Zoo");
        Scanner scanner = new Scanner(System.in);
        StringBuilder input;

        while (true) {
            System.out.print("Что вы хотите посмотреть?: ");
            input = new StringBuilder(scanner.nextLine().toLowerCase());
            switch (input.toString()) {
                case ("посмотреть парня"): {
                    man.showInfo();
                    man.petSomewone(giraffe);
                    man.comeIntoRoom(room);
                    return;
                }
                case ("посмотреть девушку"): {
                    woman.showInfo();
                    woman.petSomewone(giraffe);
                    woman.comeIntoRoom(room);
                    return;
                }
                case ("посмотреть комнату"): {
                    room.showInfo();
                    return;
                }
                case ("посмотреть жирафа"): {
                    giraffe.showInfo();
                    return;
                }
                default: {
                    System.out.println("Try input again");
                }
            }
        }


    }
}
