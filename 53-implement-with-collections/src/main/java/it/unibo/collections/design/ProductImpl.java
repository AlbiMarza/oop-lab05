package it.unibo.collections.design;

import it.unibo.collections.design.api.Product;

public class ProductImpl implements Product{
    
    protected  final String name;
    protected  final double quantity;

    public ProductImpl(String name, double quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }

    public double getQuantity(){
        return this.quantity;
    }

}
