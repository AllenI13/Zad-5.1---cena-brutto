public class Method {
    public Product product = new Product("Wódka", "Tania wódka", 19.99, "Alkoholowe");
    public Product product1 = new Product("Sok pomarańczowy", "Słodki", 4.99, "Bezalkoholowe");

    public void ProductBrutto() {
        switch (product1.getCategory()) {
            case ("Alkoholowe"):
                System.out.println(product.getCenaNetto() * 1.35);
                break;

            case ("Bezalkoholowe"):
                System.out.println(product.getCenaNetto() * 1.08);
                break;
        }
    }
}
