package Animals;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class Animal implements IAnimal {

    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep");
    }

    @Override
    public String speak(String words) {
        return words;
    }
}
