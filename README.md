# Housing Application - Patika.dev & DefineX Java Spring Practicum 
## Homework - 1

An application for getting total price, average square meter and filtering by room and hall count of housings.


# Project Structure

**Entities:**\
&ensp;&ensp;&ensp;Abstracts\
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;Housing\
&ensp;House\
&ensp;Resort\
&ensp;Villa\
\
**Repositories:**\
&ensp;HousingRepository\
\
**Services:**\
&ensp;HousingService


# Guide

Creating the instance of HousingService
```creatingHousingService
 HousingService housingService = new HousingServiceImpl();
```

**Commands:**

```
BigDecimal getTotalHousePrice();                                                // -> returns all houses total price

BigDecimal getTotalVillaPrice();                                                // -> returns all villas total price

BigDecimal getTotalResortPrice();                                               // -> returns all resorts total price

BigDecimal getTotalAllHousingsPrice();                                          // -> returns all housings total price

float getAvgHouseSquareMeters();                                                // -> returns average square meter of houses

float getAvgVillaSquareMeters();                                                // -> returns average square meter of villas

float getAvgResortSquareMeters();                                               // -> returns average square meter of resorts

float getAvgAllHousingsSquareMeters();                                          // -> returns average square meter of all housings

List<Housing> getFilteredHousings(int roomCount, int hallCount);                // -> returns a list of all housings given  the number of rooms and halls counts.
```