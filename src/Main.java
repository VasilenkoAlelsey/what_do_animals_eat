public class Main {

    public static void main(String[] args) {

        Eatable grass = new Grass("grass");
        Eatable cowForFood = new Herbivores("cows");

        Animal cow = new Herbivores("Cow");
        Animal goat = new Herbivores("Goat");
        Animal lion = new Predators("Lion");

        cow.eats(grass);
        goat.eats(grass);
        goat.eats(cowForFood);
        lion.eats(cowForFood);
        lion.eats(grass);


    }
}
