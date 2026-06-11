public class Lesson_1 {
  public static void main (String [] args) {
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers ();
    System.out.println (checkingMethod(3, 13));

  }
                   // задание 1 - printThreeWords()                
  static void printThreeWords () {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
}
                   // задание 2 - checkSumSign ()
  public static void checkSumSign () {
    int a = 2;
    int b = 5;
    int sum = a+b;  
    if (sum >= 0) {
  System.out.println(“Сумма положительная”);
    } else {
       System.out.println(“Сумма отрицательная");
    }
                  // задание 3 - printColor ()
   public static void printColor() {
     int value = 74;
       if (value <= 0) {
            System.out.println(“Красный”);
     } else if (value <= 100) {
            System.out.println(“Желтый”);
     } else (value > 100) {
            System.out.println(“Зеленый”);
    }
                 // задание 4 - compareNumbers ()
public static void compareNumbers() {
    int a = 3;
    int b = 6; 
    if (a >= b) {
      System.out.println(“a >= b”);
    } else {
       System.out.println(“a < b");
    }
                  // задание 5 - checkingMethod ()
 public static boolean checkingMethod(int a, int b) {
    int sum = a+b;  
    return sum >= 10 && sum <= 20;
}
                 // задание 6 -  nullIsPositive ()


  
}
