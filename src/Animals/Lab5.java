package Animals;

import jdk.jshell.spi.ExecutionControl;

public class Lab5 {
    public static void main(String[] args){
        Cat ourcat = new Cat();
        ourcat.eat();
        ourcat.sleep();
        String spokenString = ourcat.speak("Play with me");
        System.out.println(spokenString);
    }
}
