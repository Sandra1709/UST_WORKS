import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

        private final List<Product> cart;

        public ShoppingCart() {
            cart = new ArrayList<>();
        }

        public void addProduct(Product product) throws DuplicateProductIDException {
            for (Product p : cart) {
                if (p.getProductId() == product.getProductId()) {
                    throw new DuplicateProductIDException("Product with ID " + product.getProductId() + " already exists in the cart.");
                }
            }
            cart.add(product);
        }

        public void displayCartContents() {
            for (Product product : cart) {
                product.displayDetails();
                System.out.println();
            }
        }

        public double calculateTotalPrice() {
            double total = 0;
            for (Product product : cart) {
                total += product.price;
            }
            return total;
        }

        public void deleteProduct(int productId) throws ProductNotFoundException {
            boolean found = false;
            for (Product product : cart) {
                if (product.getProductId() == productId) {
                    cart.remove(product);
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new ProductNotFoundException("Product with ID " + productId + " not found in the cart.");
            }
        }

    }
