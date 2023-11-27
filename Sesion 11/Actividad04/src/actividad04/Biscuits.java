package actividad04;

class Biscuits extends Goodies {
    private String flavor;

    public Biscuits(int id, String description, float price, String flavor) {
        super(id, description, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return "Biscuits [" +
                "Id=" + getId() +
                ", Descripcion= " + getDescription() + 
                ", Precio=" + getPrice() +
                ", Sabor=" + flavor + "]";
    }
}