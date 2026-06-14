public class Lesson_2_1 {
    String name;
    String productionDate;
    String manufacturer;
    String country;
    double price;
    boolean reservationStatus;

    public Lesson_2_1(String name, String productionDate, String manufacturer,
                       String country, double price, boolean reservationStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.reservationStatus = reservationStatus;
    }

    void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Забронирован: " + reservationStatus);
    }
  public static void main(String[] args) {
        Lesson_2_1[] productsArray = new Lesson_2_1[5];
        productsArray[0] = new Lesson_2_1("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Lesson_2_1("Supersonic HD07", "01.01.2021",
                "Dyson", "Singapore", 15500, true);
       productsArray[2] = new Lesson_2_1("MacBook Air M3", "10.03.2024",
                "Apple Inc.", "China", 7099, false);
        productsArray[3] = new Lesson_2_1("Dreame V11 SE Global", "01.06.2023",
                "Dreame Technology", "China", 6059, true);
       productsArray[4] = new Lesson_2_1("Marshall Monitor II ANC", "01.04.2020",
                "Marshall ", "China", 5000, false);

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
            System.out.println("---");
        }
     }
    }
    

