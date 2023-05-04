package animal;

import java.util.Objects;

public class Dog extends Animal{
    private final String name; // encapsulation (we cannot change the name of the Cat after it was created)
    private final String sound = "auf";

    public Dog(String name) {
        this.name = name;
    }

    @Override // polymorphism (it differs from other classes extending Animal)
    public String getName() {
        return name;
    }

    @Override // polymorphism (it differs from other classes extending Animal)
    public void sound() {
        System.out.println(sound);
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Dog dog = (Dog) object;
        return Objects.equals(name, dog.name) && Objects.equals(sound, dog.sound);
    }


}
