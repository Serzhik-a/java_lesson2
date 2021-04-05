package ru.lesson2.homeworkPro;

public class Human implements ShowInfo, CanPet {

    String name;            //имя
    int age;                //возраст
    int heigh;              //рост
    int passportNumber;     //номер пасспорта
    char gender;

    public void canSpeaking() {
        System.out.println("I can speak");
    }

    public void canWalking() {
        System.out.println("I can walking");
    }

    public void canMovingObjects() {
        System.out.println("I can move different objects");
    }

    public void canProgramming() {
        System.out.println("I can write programs on Java");
    }

    public void showInfo() {
        System.out.println(toString());
        canSpeaking();
        canWalking();
        canMovingObjects();
        canProgramming();
    }

    public String toString() {
        return "Hello, my name is " + name +
                ", my age is " + age +
                ", my heigh is " + heigh +
                ", gender is " + gender +
                ", passportNumber is " + passportNumber;
    }

    public void petSomewone(CanPet petter) {
        petter.petMe();
    }

    public void comeIntoRoom(CanComeIn comeIn) {
        comeIn.comeIn();
    }

    public void petMe () {
        System.out.println("Могу погладить " + name);
    }
}
