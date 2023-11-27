package actividad04;

class Chocolates extends Goodies {
    private String type;

    public Chocolates(int id, String description, float price, String type) {
        super(id, description, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Chocolates{: [" +
                 "Id=" + getId() +
                ", Descripcion= " + getDescription() + 
                ", Precio=" + getPrice() +
                ", type='" + type + "]";
    }
}

