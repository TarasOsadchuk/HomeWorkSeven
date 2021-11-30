package com.geekbrines.cat;

import java.util.InputMismatchException;

public class Plate {

    private int food;

    public Plate(int food) {
        if (food < 0) {
            throw new InputMismatchException("В тарелке не может быть отрицательное количество еды");
        }
        // Проверяю чтобы в тарелке не было сразу отрицательного числа
        this.food = food;
    }

    public boolean decreaseFood(int sum) {
        if (food >= sum) {
            food -= sum;
            return true;
        } else {
            return false;
        }
    }
    // Сделал так, чтобы кот не трогал тарелку если ему не хватает еды

    public void info() {
        System.out.println("Тарелка: " + food);
    }

    public void addFood(int addFood) {
        food += addFood;
    }
    // Добавил метод, с помощью которого можно было бы добавлять еду в тарелку

}
