package xyz.andornot.patternmatching;

public class Animal {
    private String color;

    public Animal() {

    }

    public void eatNothing() {
        System.out.println("eat nothing");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        feed(animal);
        Tiger tiger = new Tiger();
        feed(tiger);
        Elephant elephant = new Elephant();
        feed(elephant);
    }

    public static void feed(Animal animal) {
        if (animal instanceof Elephant elephant) {
            elephant.eatPlants();
        } else if (animal instanceof Tiger tiger) {
            tiger.eatMeat();
        } else {
            animal.eatNothing();
        }
    }
}

class Elephant extends Animal {
    public void eatPlants() {
        System.out.println("eat plants");
    }
}

class Tiger extends Animal {
    public void eatMeat() {
        System.out.println("eat meat");
    }
}
