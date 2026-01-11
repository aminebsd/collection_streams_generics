package org.example;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Product> {

    private List<Product> products = new ArrayList<>();


    public void add(Product p) {
        products.add(p);
    }


    public List<Product> getAll() {
        return products;
    }

    public Product findById(long id) {
        for(Product p : products)
            if(p.getId() == id)
                return p;
        return null;
    }

    public void delete(long id) {
        products.removeIf(p -> p.getId() == id);
    }
}
