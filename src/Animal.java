public abstract class Animal {
    private boolean hasSpine;

    protected Animal(boolean hasSpine) {
        this.hasSpine = hasSpine;
    }

    public void spec() {
        System.out.println("This is an animal");
    }

    public void getHasSpine() {
        if(hasSpine) {
            System.out.println("This animal has a spine");
        }
    }

    public static void main(String[] args) {
        Cat cat0 = new Cat("someCat");
        System.out.println(cat0.getName());
        cat0.spec();
        cat0.wool();
        cat0.getHasSpine();

        Bear br0 = new Bear("someBear");
        System.out.println(br0.getName());
        br0.spec();
        br0.wool();

        Whale wh0 = new Whale("someWhale");
        System.out.println(wh0.getName());
        wh0.spec();
        wh0.water();

        Fish fish0 = new Fish("someFish");
        System.out.println(fish0.getName());
        fish0.spec();
        fish0.water();
    }
}
