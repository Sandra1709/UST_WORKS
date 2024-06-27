public class Clothing extends Product {
    public String size;
    public String material;

    public Clothing(String productName, int productId, double price, int quantityInStock, String size, String material) {
        super(productName, productId, price, quantityInStock);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}
