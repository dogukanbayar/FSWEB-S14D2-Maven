package org.example;

import org.example.model.Bed;
import org.example.model.Bedroom;
import org.example.model.Carpet;
import org.example.model.Ceiling;
import org.example.model.Lamp;
import org.example.model.Wall;
import org.example.model.Wardrobe;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 1, 2, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 100);
        Wardrobe wardrobe = new Wardrobe(2, 3, 80.5);
        Carpet carpet = new Carpet(3, 4, PaintColor.RED);

        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();
    }
}
