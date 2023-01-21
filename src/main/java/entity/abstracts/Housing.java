package entity.abstracts;

import java.math.BigDecimal;

public abstract class Housing {

    private int roomCount;

    private int hallCount;

    private int squareMeter;

    private BigDecimal price;

    public Housing(int roomCount, int hallCount, int squareMeter, BigDecimal price) {
        this.roomCount = roomCount;
        this.hallCount = hallCount;
        this.squareMeter = squareMeter;
        this.price = price;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getHallCount() {
        return hallCount;
    }

    public void setHallCount(int hall) {
        this.hallCount = hallCount;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
