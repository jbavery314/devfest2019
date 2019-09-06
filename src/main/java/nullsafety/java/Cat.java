package nullsafety.java;

public class Cat {
    private int age;
    private Fur fur;
    private Human human;

    Cat() {
        age = 5;
        fur = new Fur();
        human = new Human();
    }

    void eat() {
        System.out.println("Cat is eating.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Fur getFur() {
        return fur;
    }

    public void setFur(Fur fur) {
        this.fur = fur;
    }

    Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
