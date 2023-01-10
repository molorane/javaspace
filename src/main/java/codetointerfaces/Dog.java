package codetointerfaces;

public class Dog extends Animal {

    public Dog() {
        sound = new Buck();
    }

    public void sound(){
        sound.sound();
    }
}
