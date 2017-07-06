package com.hk;

/**
 * Created by huseyin karabkla on 06.07.2017.
 */
public class FurnitureShippingVisitor implements FurnitureVisitor {

    double shipping = 0;

    @Override
    public void visit(Table table) {
        shipping += 10;
    }

    @Override
    public void visit(Sofa sofa) {
        shipping += 15;
    }

    @Override
    public void visit(Carpet carpet) {
        shipping += 5;
    }

    @Override
    public void visit(FurnitureOrder furnitureOrder) {
        System.out.println("Shipping total : " + shipping);
    }
}
