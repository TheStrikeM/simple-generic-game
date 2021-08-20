package com.thestrikem.participant;

import java.util.Random;

public abstract class Participant {
    private String name;
    private int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getCongratulation() {
        switch (new Random().nextInt(3)) {
            case 0: return String.format("%s, %s лет: Блин, я даже не представлял, что мы выиграем, жесть!", name, age);
            case 1: return String.format("%s, %s лет: Капец, б****, с***, н****!", name, age);
            default: return String.format("%s, %s лет: Нет слов.", name, age);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
