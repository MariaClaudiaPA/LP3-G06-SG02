package actividad04;
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
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Goodies other = (Goodies) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Goodies: [Id=" + id + ", description= " + description + " , price= " + price + "]";
    }
}


