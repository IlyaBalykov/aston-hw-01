public class Fish extends Animal implements Water {
    protected static final String animalSpec = "fish";
    private String animalName;

    public Fish(String name) {
        super(true);
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