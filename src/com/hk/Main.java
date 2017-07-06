package com.hk;

public class Main {

    public static void main(String[] args) {

        FurnitureOrder furnitureOrder = new FurnitureOrder();
        furnitureOrder.addFurniture(new Carpet());
        furnitureOrder.addFurniture(new Sofa());
        furnitureOrder.addFurniture(new Table());

        furnitureOrder.accept(new FurnitureDisplayVisitor());
        furnitureOrder.accept(new FurnitureShippingVisitor());

    }
}
