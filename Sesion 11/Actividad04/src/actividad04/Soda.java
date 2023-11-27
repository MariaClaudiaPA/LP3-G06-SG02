package actividad04;

class Soda extends Biscuits {
    private String sodaType;

    public Soda(int id, String description, float price, String flavor, String sodaType) {
        super(id, description, price, flavor);
        this.sodaType = sodaType;
    }

    public String getSodaType() {
        return sodaType;
    }

    @Override
    public String toString() {
        return "Soda[" +
                 "Id=" + getId() +
                ", Descripcion= " + getDescription() + 
                ", Precio=" + getPrice() +
                ", Sabor=" + getFlavor() + "]" +
                ", Tipo de soda= " + sodaType + "]";
    }
}