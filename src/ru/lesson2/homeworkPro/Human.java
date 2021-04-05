package ru.lesson2.homeworkPro;

public class Human implements ShowInfo {

    String name;            //имя
    int age;                //возраст
    int heigh;              //рост
    int passportNumber;     //номер пасспорта

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

    public void petSomewone(CanPet petter) {
        petter.petMe();
    }

    public void comeIntoRoom(canComeIn comeIn) {
        comeIn.comeIn();
    }
}
