package nullability.java;

public class Cat {
    private int age;
    private Fur fur;
    private Human human;

    public Cat() {
        age = 5;
        fur = new Fur();
        human = new Human();
    }

    public void eat() {
        System.out.println("Cat is eating.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Fur getFur() {
        return fur;
    }

    public void setFur(Fur fur) {
        this.fur = fur;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
