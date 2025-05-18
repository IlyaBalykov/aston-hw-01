public class Whale extends Mammal implements Water{
    private static final String animalSpec = "whale";
    private String animalName;

    public Whale(String name) {
        this.animalName = name;
    }

    @Override
    public void water() {
        System.out.printf("The %s lives in water\n", animalSpec);
    }
    public String getName() {
        return this.animalName;
    }
}
