package com.hk;

/**
 * Created by huseyin karabakla on 06.07.2017.
 */
public class Table implements Furniture {
    @Override
    public void accept(FurnitureVisitor visitor) {
        visitor.visit(this);
    }
}
