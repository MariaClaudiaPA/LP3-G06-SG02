package actividad04;

class Sweet extends Biscuits {

    private String sweetType;

    public Sweet(int id, String description, float price, String flavor, String sweetType) {
        super(id, description, price, flavor);
        this.sweetType = sweetType;
    }

    public String getSweetType() {
        return sweetType;
    }

    @Override
    public String toString() {
        return "Sweet{"
                + "Id=" + getId()
                + ", Descripcion= " + getDescription()
                + ", Precio=" + getPrice()
                + ", Sabor=" + getFlavor() 
                + ", Tipo de dulce='" + sweetType +  "]";
    }
}
