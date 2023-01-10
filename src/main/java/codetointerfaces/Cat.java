package codetointerfaces;

public class Cat extends Animal {

    public Cat() {
        sound = new Meow();
    }

    public void sound(){
        sound.sound();
    }

}
