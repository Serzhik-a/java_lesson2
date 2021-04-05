package ru.lesson2.homeworkPro;

public class Room extends House implements ShowInfo, canComeIn {
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

    public Room(int numberOfHouse, String name, int width, int heigh, int depth, String color) {
        this.numberOfHouse = numberOfHouse;
        this.name = name;
        this.width = width;
        this.heigh = heigh;
        this.depth = depth;
        this.color = color;
    }


    public String toString() {
        return "This room is " + name +
                ", width= " + width +
                ", heigh= " + heigh +
                ", depth= " + depth +
                ", color of wall is " + color;
    }

    public void showInfo() {
        System.out.println(toString());
        System.out.println("I`m in a house number " + numberOfHouse);
        canDusting();
        canMeasure();
        getSize();
        getVolume();
        canWash();
    }

    public void comeIn() {
        System.out.println("Могу войти в " + name);
    }
}