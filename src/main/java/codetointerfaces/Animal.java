package codetointerfaces;


public abstract class Animal {
    protected Sound sound;

    public void makeSound() {
        sound.sound();
    }
}
