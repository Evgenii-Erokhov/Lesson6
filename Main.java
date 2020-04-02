package Lesson6.Animal;

public class Main {
    public static void main(String[] args) {

        boolean action;
        Animal cat = new Cat("Murcho");
        Animal dog = new Dog("Blum");

        cat.run(180);
        if (cat.distance <= cat.maxrun && cat.distance > 0) {
            action = true;
            System.out.println("кот " + cat.name + " пробежал " + cat.distance + " метров," + action);
        }else if (cat.distance <= 0) {
            action = false;
            System.out.println("кот " + cat.name + " испугался и убежал," + action);
        }else{
            action = false;
            System.out.println("кот " + cat.name + " пробежал только " + cat.maxrun + " метров и устал," + action);
        }

        cat.swim(2.5);
        if (cat.distance != cat.maxswim) {
            action = false;
            System.out.println("кот " + cat.name + " не умеет плавать," + action);
        }

        dog.run(700);
        if (dog.distance <= dog.maxrun && dog.distance > 0) {
            action = true;
            System.out.println("пёс " + dog.name + " пробежал " + dog.distance + " метров," + action);
        }else if (dog.distance <= 0) {
            action = false;
            System.out.println("пёс " + dog.name + " испугался и убежал," + action);
        }else{
            action = false;
            System.out.println("пёс " + dog.name + " пробежал только " + dog.maxrun + " метров и устал," + action);
        }

        dog.swim(4.5);
        if (dog.distance <= dog.maxswim && dog.distance > 0) {
            action = true;
            System.out.println("пёс " + dog.name + " проплыл " + dog.distance + " метров," + action);
        }else if (cat.distance <= 0) {
            action = false;
            System.out.println("пёс " + dog.name + " испугался и убежал," + action);
        }else{
            action = false;
            System.out.println("пёс " + dog.name + " может проплыть только " + dog.maxswim + " метров" + action);
        }
    }
}
