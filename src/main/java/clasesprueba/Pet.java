package clasesprueba;

public class Pet {
    public String name;
    public String owner;
    public String born;

    public Pet() {}

    public Pet(String name, String owner, String born) {
        this.name = name;
        this.owner = owner;
        this.born = born;
    }

    public void eat(){
        System.out.println("I am eating " + this.name);
    }
    public void play(){
        System.out.println("I am playing " + this.name);
    }
}
