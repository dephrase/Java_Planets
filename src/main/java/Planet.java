public class Planet {

    private int size;
    private String name;

    public Planet(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public String explode() {
        return "Boom, " + this.name + " has exploded";
    }
}
