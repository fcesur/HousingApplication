package entity;


import entity.abstracts.Housing;

import java.math.BigDecimal;

public class House extends Housing {


    public House(int room, int hall, int squareMeter, BigDecimal price) {
        super(room, hall, squareMeter, price);
    }
}
