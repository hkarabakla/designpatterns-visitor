package com.hk;

/**
 * Created by huseyin karabakla on 06.07.2017.
 */
public interface FurnitureVisitor {
    void visit(Table table);
    void visit(Sofa sofa);
    void visit(Carpet carpet);
    void visit(FurnitureOrder furnitureOrder);
}
