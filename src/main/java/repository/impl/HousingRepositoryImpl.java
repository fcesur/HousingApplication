package repository.impl;

import entity.House;
import entity.Resort;
import entity.Villa;
import entity.abstracts.Housing;
import repository.HousingRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HousingRepositoryImpl implements HousingRepository {

    private static final List<Housing> houses = new ArrayList<>(
            Arrays.asList(
                    new House(2, 1, 55, BigDecimal.valueOf(250.254)),
                    new House(3, 1, 75, BigDecimal.valueOf(355.345)),
                    new House(4, 1, 75, BigDecimal.valueOf(755.445))
            )
    );

    private static final List<Housing> resorts = new ArrayList<>(
            Arrays.asList(
                    new Resort(1, 1, 45, BigDecimal.valueOf(420.254)),
                    new Resort(2, 1, 65, BigDecimal.valueOf(625.345)),
                    new Resort(3, 1, 85, BigDecimal.valueOf(1055.445))
            )
    );


    private static final List<Housing> villas = new ArrayList<>(
            Arrays.asList(
                    new Villa(3, 1, 45, BigDecimal.valueOf(1000.000)),
                    new Villa(4, 1, 65, BigDecimal.valueOf(1500.345)),
                    new Villa(5, 1, 85, BigDecimal.valueOf(2055.445))
            )
    );

    @Override
    public List<Housing> getHouseList() {
        return houses;
    }

    @Override
    public List<Housing> getVillaList() {
        return villas;
    }

    @Override
    public List<Housing> getResortList() {
        return resorts;
    }

    @Override
    public List<Housing> getAllHousings() {
        return concatAllHousings(houses, resorts, villas);
    }

    @SafeVarargs
    private List<Housing> concatAllHousings(List<Housing>... housings) {

        List<Housing> result = new ArrayList<>();

        for (List<Housing> housingList : housings) {
            result.addAll(housingList);
        }

        return result;

    }

}
