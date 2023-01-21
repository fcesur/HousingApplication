package service;

import entity.abstracts.Housing;

import java.math.BigDecimal;
import java.util.List;

public interface HousingService {

    BigDecimal getTotalHousePrice();

    BigDecimal getTotalVillaPrice();

    BigDecimal getTotalResortPrice();

    BigDecimal getTotalAllHousingsPrice();

    float getAvgHouseSquareMeters();

    float getAvgVillaSquareMeters();

    float getAvgResortSquareMeters();

    float getAvgAllHousingsSquareMeters();

    List<Housing> getFilteredHousings(int roomCount, int hallCount);

}
