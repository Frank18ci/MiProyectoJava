package enumeraciones;

public enum Enumeraciones {
    TACO("Taco", 50.0f),
    TORTA("Torta", 60.0f),
    QUESADILLA("Quesadilla", 40.0f),
    HAMBURGUESA("Hamburguesa", 80.0f),
    HOTDOG("Hotdog", 70.0f);

    private String saleName;
    private Float price;




    Enumeraciones(String saleName, Float price) {
        this.saleName = saleName;
        this.price = price;
    }


    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
