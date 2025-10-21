package models;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract String getType();
    public abstract String extra();

    public String describe() {
        return String.format("[%s] name=%s, age=%d, %s", getType(), name, age, extra());
    }
}