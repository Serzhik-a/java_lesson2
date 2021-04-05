package ru.lesson2.homeworkPro;

public class Woman extends Human {

    char gender = 'W';          //пол

    public Woman(String name, int age, int heigh, int passportNumber) {
        this.name = name;
        this.age = age;
        this.heigh = heigh;
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
