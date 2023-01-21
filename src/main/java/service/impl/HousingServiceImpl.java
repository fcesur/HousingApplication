package service.impl;

import entity.abstracts.Housing;
import repository.HousingRepository;
import service.HousingService;
import java.math.BigDecimal;
import java.util.List;


public class HousingServiceImpl implements HousingService {


    private final HousingRepository housingRepository;


    public HousingServiceImpl(HousingRepository housingRepository) {

        this.housingRepository = housingRepository;

    }


    @Override
    public BigDecimal getTotalHousePrice() {
        return totalPrice(housingRepository.getHouseList());
    }

    @Override
    public BigDecimal getTotalVillaPrice() {
        return totalPrice(housingRepository.getVillaList());
    }

    @Override
    public BigDecimal getTotalResortPrice() {
        return totalPrice(housingRepository.getResortList());
    }

    @Override
    public BigDecimal getTotalAllHousingsPrice() {
        return totalPrice(housingRepository.getAllHousings());
    }

    @Override
    public float getAvgHouseSquareMeters() {
        return averageSquareMeter(housingRepository.getHouseList());
    }

    @Override
    public float getAvgVillaSquareMeters() {
        return averageSquareMeter(housingRepository.getVillaList());
    }

    @Override
    public float getAvgResortSquareMeters() {
        return averageSquareMeter(housingRepository.getResortList());
    }

    @Override
    public float getAvgAllHousingsSquareMeters() {
        return averageSquareMeter(housingRepository.getAllHousings());
    }

    @Override
    public List<Housing> getFilteredHousings(int roomCount, int hallCount) {
        return filterHousing(roomCount, hallCount, housingRepository.getAllHousings());
    }


    private BigDecimal totalPrice(List<Housing> housings) {

        BigDecimal totalPrice = BigDecimal.ZERO;


        for (Housing housing : housings) {
            totalPrice = totalPrice.add(housing.getPrice());
        }

        return totalPrice;
    }

    private float averageSquareMeter(List<Housing> housings) {

        float totalSquareMeter = 0;


        for (Housing housing : housings) {

            totalSquareMeter += housing.getSquareMeter();
        }

        return totalSquareMeter / housings.size();
    }

    private List<Housing> filterHousing(int roomCount, int hallCount, List<Housing> housings) {

        return housings.stream().filter(h -> h.getHallCount() == hallCount && h.getRoomCount() == roomCount).toList();
    }
}
