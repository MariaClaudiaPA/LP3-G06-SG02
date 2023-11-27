package ejercicio01;

class Goodies {

    private int id;
    private String description;
    private float price;

    public Goodies(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nGoodies: [Id=" + id + ", descripcion= " + description + " , precio= " + price + "]";
    }
}
