package ru.lesson2.homeworkPro;

public class Man extends Human implements CanPet {

    public Man(String name, int age, int heigh, int passportNumber) {
        this.name = name;
        this.age = age;
        this.heigh = heigh;
        this.passportNumber = passportNumber;
        this.gender = 'M';
    }
}
