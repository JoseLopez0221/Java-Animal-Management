package models;

public class Monkey extends Animal {
    private String species;

    public Monkey(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    @Override
    public String getType() { return "Monkey"; }

    @Override
    public String extra() { return "species=" + species; }
}