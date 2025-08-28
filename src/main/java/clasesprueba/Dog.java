package clasesprueba;

public class Dog extends Pet{
    public String breed;

    public Dog() {
    }

    public Dog(String name, String owner, String born, String breed) {
        super(name, owner, born);
        this.breed = breed;
    }

    public void bark(){
        System.out.println("Woof! Woof! " + this.name);
    }
    @Override
    public void play(){
        System.out.println("I am playing with a ball " + this.name);
    }
}
