public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        // add some toys
        store.addToy(1, "constructor", 10, 20);
        store.addToy(2, "robot", 5, 20);
        store.addToy(3, "doll", 20, 60);

        // set the weight of a toy
        store.setToyWeight(2, 30);

        // play the game
        store.play();

        // get the prize toy
        try {
            store.getPrizeToy();
        } catch (Exception e){}
    }
}