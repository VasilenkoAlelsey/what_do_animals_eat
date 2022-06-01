public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eats(Eatable eat);

    public String getName() {
        return name;
    }
}
