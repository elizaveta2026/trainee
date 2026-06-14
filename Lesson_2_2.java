public class Lesson_2_2 {

    static class Attraction {
        String name;
        String workingHours;
        double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price);
        }
    }

    public static void main(String[] args) {
        Attraction[] attractions = new Attraction[5];

        attractions[0] = new Attraction("Американские горки", "10:00-20:00", 1000);
        attractions[1] = new Attraction("Колесо обозрения", "09:00-21:00", 700);
        attractions[2] = new Attraction("Карусель", "09:00-22:00", 300);
        attractions[3] = new Attraction("Комната страха", "11:00-21:00", 600);
        attractions[4] = new Attraction("Автодром", "10:00-22:00", 600);

        for (int i = 0; i < attractions.length; i++) {
            attractions[i].printInfo();
            System.out.println("---");
        }
    }
}
