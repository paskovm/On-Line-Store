package onlinestore.withlist.services;

import onlinestore.withlist.enteties.Product;

import java.util.List;

public interface ProductManagementService {

	List<Product> getProducts();

	Product getProductById(int productIdToAddToCart);

}
