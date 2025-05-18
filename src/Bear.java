public class Bear extends Mammal implements Wool {
    private static final String animalSpec = "bear";
    private String animalName;

    public Bear(String name) {
        this.animalName = name;
    }

    @Override
    public void wool() {
        System.out.printf("The %s has fur\n", animalSpec);
    }

    public String getName() {
        return animalName;
    }
}
