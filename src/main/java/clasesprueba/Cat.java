package clasesprueba;

public class Cat extends Pet{
    public Boolean scratch;

    public Cat() {
    }

    public Cat(String name, String owner, String born, Boolean scratch) {
        super(name, owner, born);
        this.scratch = scratch;
    }

    public void meow(){
        System.out.println("Meow! Meow! " + this.name);
    }
    @Override
    public void play(){
        System.out.println("I am playing with a yarn " + this.name);
    }
}
