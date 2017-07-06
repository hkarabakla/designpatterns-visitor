package com.hk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by huseyin karabakla on 06.07.2017.
 */
public class FurnitureOrder implements Furniture {

    private List<Furniture> furnitures = new ArrayList<>();

    public void addFurniture(Furniture furniture) {
        furnitures.add(furniture);
    }

    public List<Furniture> getFurnitures() {
        return Collections.unmodifiableList(furnitures);
    }

    @Override
    public void accept(FurnitureVisitor visitor) {
        for (Furniture furniture : furnitures) {
            furniture.accept(visitor);
        }
        visitor.visit(this);
    }
}
