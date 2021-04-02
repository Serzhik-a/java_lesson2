package ru.lesson2.homework;

public class Human {
    String name;            //имя
    int age;                //возраст
    int heigh;              //рост
    char gender;          //пол
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

    public void canReading() {
        System.out.println("I can read the books");
    }

    public Human(String name, int age, int heigh, char gender, int passportNumber) {
        this.name = name;
        this.age = age;
        this.heigh = heigh;
        this.gender = gender;
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Hello, my name is " + name +
                ", my age is " + age +
                ", my heigh is " + heigh +
                ", gender is " + gender +
                ", passportNumber is " + passportNumber;
    }
}
