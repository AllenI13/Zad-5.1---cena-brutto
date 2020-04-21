public class Product {
    private String nazwa;
    private String opis;
    private double cenaNetto;
    private String category;

    public Product(String nazwa, String opis, double cenaNetto, String category) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.cenaNetto = cenaNetto;
        this.category = category;
    }


    public double getCenaNetto() {
        return cenaNetto;
    }

    public String getCategory() {
        return category;
    }
}
