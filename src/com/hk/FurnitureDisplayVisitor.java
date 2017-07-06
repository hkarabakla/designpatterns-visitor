package com.hk;

/**
 * Created by huseyin karabakla on 06.07.2017.
 */
public class FurnitureDisplayVisitor implements FurnitureVisitor {
    @Override
    public void visit(Table table) {
        System.out.println("One table added");
    }

    @Override
    public void visit(Sofa sofa) {
        System.out.println("One sofa added");
    }

    @Override
    public void visit(Carpet carpet) {
        System.out.println("One carpet added");
    }

    @Override
    public void visit(FurnitureOrder furnitureOrder) {
        System.out.println("Order total : " + furnitureOrder.getFurnitures().size());
    }
}
