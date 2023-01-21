package repository;

import entity.abstracts.Housing;
import java.util.List;

public interface HousingRepository {

    List<Housing> getHouseList();

    List<Housing> getVillaList();

    List<Housing> getResortList();

    List<Housing> getAllHousings();

}
