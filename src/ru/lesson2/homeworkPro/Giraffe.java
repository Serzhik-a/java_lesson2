package ru.lesson2.homeworkPro;

public class Giraffe extends Animal implements ShowInfo, CanPet {

    int age;                //возраст
    int heigh;              //рост
    char gender;          //пол
    String name;            //имя
    String country;          //место обитания

    public void canEating() {
        System.out.println("I can eat leaves from trees");
    }

    public void canWalking() {
        System.out.println("I can walk");
    }

    public void canSleep() {
        System.out.println("I can sleeping");
    }

    public void canSwim() {
        System.out.println("I wan`t swim, my head sticks out");
    }


    public Giraffe(String name, int age, int heigh, char gender, String country) {
        this.name = name;
        this.age = age;
        this.heigh = heigh;
        this.gender = gender;
        this.country = country;
    }

    public String toString() {
        return "This is Giraffe " +
                "his name is " + name +
                ", age is " + age +
                ", heigh is " + heigh +
                ", gender is " + gender +
                ", was born in " + country;
    }

    public void showInfo() {
        System.out.println(toString());
        canEating();
        canSleep();
        canWalking();
        canSwim();
        canMove();
    }

    public void petMe() {
        System.out.println("Могу покормить жирафа " + name);
    }
}
