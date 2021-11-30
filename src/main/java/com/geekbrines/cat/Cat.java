package com.geekbrines.cat;

import java.util.InputMismatchException;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

        if (appetite < 0) {
            throw new InputMismatchException("Голод не может быть отрицательным");
        }
        // Проверяю чтобы голод не был отрицательным
    }

    public void eat(Plate p) {
        if (satiety == p.decreaseFood(appetite)) {
            System.out.println("Кот " + name + " не наелся");
        } else {
            System.out.println("Кот " + name + " наелся");
        }
        // печатаю состояние кота
    }
}
