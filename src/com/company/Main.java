package com.company;

public class Main {

    public static void main(String[] args) {
        Hero magic = new Magic();
        Hero warrior = new Warrior();
        Hero medic = new Medic();

        HavingSuperAbility[] havingSuperAbilities = {magic, warrior, medic};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            havingSuperAbilities[i].applySuperAbility("");
        }
    }
}
//Создать интерфейс HavingSuperAbility (имеющий суперспособность) добавить
//в него 1 абстрактный метод applySuperAbility(String superAbilityType);
//  Создать абстрактный класс Hero с полями здоровье, урон и тип суперспособности и
//реализовать интерфейс HavingSuperAbility.
//Создать 3 класса героев Magic, Medic, Warrior и наследовать их от класса Hero.
//В каждом классе по своему реализовать метод
//applySuperAbility(String superAbilityType) следующим образом - просто распечатать
//что то вроде того “Warrior применил суперспособность CRITICAL DAMAGE”.
//В классе Main создать массив из 3х разных героев, затем через цикл применить суперспособность каждого героя.
//Дэдлайн 17.03.2021 23 59