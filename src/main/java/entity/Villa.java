package entity;

import entity.abstracts.Housing;

import java.math.BigDecimal;

public class Villa extends Housing {

    public Villa(int room, int hall, int squareMeter, BigDecimal price) {
        super(room, hall, squareMeter, price);
    }
}
