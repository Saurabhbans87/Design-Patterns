/**
 * Create by saurabh
 * Date: 22/03/24
 * Project Name: Design-Patterns
 */
package system.design.shopingkart;

import java.util.ArrayList;
import java.util.List;

public class ShopingKart {
    private List<Product> productList;

    public ShopingKart() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }
    public void removeProduct(Product product){
        productList.remove(product);
    }
    public List<Product> getAllProduct(){
        return productList;
    }
    public Double getTotalPrice(){
        double totalPrice = 0;
        for(Product product : productList){
            totalPrice = totalPrice + product.getProductPrice();
        }
        return totalPrice;
    }
}
