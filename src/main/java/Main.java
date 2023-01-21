import repository.impl.HousingRepositoryImpl;
import service.HousingService;
import service.impl.HousingServiceImpl;

public class Main {
    public static void main(String[] args) {


        HousingService housingService = new HousingServiceImpl(new HousingRepositoryImpl());


        System.out.println("**************************************");
        System.out.println("House total price : " + housingService.getTotalHousePrice());
        System.out.println("Resort total price : " + housingService.getTotalResortPrice());
        System.out.println("Villa total price : " + housingService.getTotalVillaPrice());
        System.out.println("All housings total price : " + housingService.getTotalAllHousingsPrice());
        System.out.println("**************************************");
        System.out.println("House avg square meter : " + housingService.getAvgHouseSquareMeters());
        System.out.println("Resort avg square meter : " + housingService.getAvgResortSquareMeters());
        System.out.println("Villa avg square meter : " + housingService.getAvgVillaSquareMeters());
        System.out.println("All housings avg square meter : " + housingService.getAvgAllHousingsSquareMeters());
        System.out.println("**************************************");
        System.out.println("Filtered housings :\n");

        housingService.getFilteredHousings(3, 1).forEach(h ->
                System.out.println(
                        "Housing Type: " + h.getClass().getName()
                                + " - Room: " + h.getRoomCount()
                                + " - Hall: " + h.getHallCount()
                )
        );

    }
}
