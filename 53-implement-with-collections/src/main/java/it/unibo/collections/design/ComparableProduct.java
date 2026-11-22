package it.unibo.collections.design;

import it.unibo.collections.design.api.Product;

public class ComparableProduct extends ProductImpl implements Comparable<Product>{
    
    /**
     * 
     * @param name
     * @param quantity
     */
    public ComparableProduct(String name, double quantity){
        super(name, quantity);
    }

    @Override 
    public int compareTo(Product p){
        return this.getName().compareTo(p.getName());
    }

}
