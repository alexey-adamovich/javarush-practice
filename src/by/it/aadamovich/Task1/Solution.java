package by.it.aadamovich.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        List<Human> family = new ArrayList<>();
        family.add(new Human("Child1", true, 10));
        family.add(new Human("Child2", false, 7));
        family.add(new Human("Child3", true, 3));
        Human father = new Human("Father", true, 36, family);
        Human mother = new Human("Mother", false, 36, family);
        family.add(father);
        family.add(mother);
        family.add(new Human("GrandFather1", true, 66, father));
        family.add(new Human("GrandMother1", false, 65, father));
        family.add(new Human("GrandFather2", true, 67, mother));
        family.add(new Human("GrandMother2", false, 65, mother));
        for (Human human : family) {
            System.out.println(human);
        }

    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private List<Human> children = new ArrayList<>();

        Human(String name, boolean sex, int age, Human... child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            children.addAll(Arrays.asList(child));
        }

        Human(String name, boolean sex, int age, List<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(children);
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
