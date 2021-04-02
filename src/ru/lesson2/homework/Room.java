package ru.lesson2.homework;

public class Room {
    String name;            //название
    int width;                //ширина
    int heigh;              //высота
    int depth;               //длинна
    String color;            //цвет

    public void canDusting() {
        System.out.println("I can dust");
    }

    public void canMeasure() {
        System.out.println("You can measure me");
    }

    public void canWash() {
        System.out.println("You can wash me");
    }

    public void getVolume() {
        System.out.println("Volume of this room is: " + width * heigh * depth);
    }

    public void getSize() {
        System.out.println("My size is W: " + width + "; D: " + depth + " ; H: " + heigh);
    }

    public Room(String name, int width, int heigh, int depth, String color) {
        this.name = name;
        this.width = width;
        this.heigh = heigh;
        this.depth = depth;
        this.color = color;
    }

    @Override
    public String toString() {
        return "This room is " + name +
                ", width= " + width +
                ", heigh= " + heigh +
                ", depth= " + depth +
                ", color of wall is " + color;
    }
}
