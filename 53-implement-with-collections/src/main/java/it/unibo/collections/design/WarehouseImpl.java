package it.unibo.collections.design;

import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.api.Warehouse;
import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse{
    
    LinkedHashSet<Product> myWarehouse;

    public WarehouseImpl(){
        this.myWarehouse = new LinkedHashSet<>();
    }

    public void addProduct(Product p){
        this.myWarehouse.add(p);
    }

    public Set<String> allNames(){
        Set<String> names = new LinkedHashSet<>();
        for (final var c : this.myWarehouse){
            names.add(c.getName());
        }
        return names;
    }

    public Set<Product> allProducts(){
        Set<Product> prods = new LinkedHashSet<>();
        for (final var p : this.myWarehouse){
            prods.add(p);
        }
        return prods;
    }

    public boolean containsProduct(Product p){
        for (final var i : this.myWarehouse){
            if (i.equals(p)){
                return true;
            }
        }
        return false;
    }

    public double getQuantity(String name){
        for (final var i : this.myWarehouse){
            if(i.getName().equals(name)){
                return i.getQuantity();
            }
        }
        return -1;
    }
}
