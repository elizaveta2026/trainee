public class Lesson_1 {
  public static void main (String [] args) {
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers ();
    System.out.println (checkingMethod(3, 13));
    nullIsPositive (7);
    System.out.println(integerNumber(-3));
    specifiedTimes ("Hello, World!", 500);
    System.out.println(leapYear(2024));
    integerArray ();
    emptyIntegerArray();
    someOtherMethod();
    diagonalArray();
    System.out.println(java.util.Arrays.toString(createArray(5, 99)));
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
public static void nullIsPositive(int number) {
    if (number >= 0) {
        System.out.println("Положительное");
    } else {
        System.out.println("Отрицательное");
    }
}
                // задание 7 -  integerNumber  ()
 public static boolean integerNumber(int number) {    
     if (number < 0) {
        return true;
    } else {
      return false;
    }
}
              // задание 8 -  specifiedTimes () 
public static void specifiedTimes(String str, int times) {
    for (int i = 0; i < times; i++) {
        System.out.println(str);
    }
}
             // задание 9 - leapYear () 
    static boolean leapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}
            // задание 10 - integerArray ()
public static void integerArray() {
    int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            arr[i] = 1;
        } else {
            arr[i] = 0;
        }
    }
    System.out.println(java.util.Arrays.toString(arr));
}
          // задание 11 - emptyIntegerArray ()
public static void emptyIntegerArray() {
    int[] arr = new int[100];     
    for (int i = 0; i < arr.length; i++) {
        arr[i] = i + 1;            
    }
    System.out.println(java.util.Arrays.toString(arr));
}
          // задание 12 - someOtherMethod ()
public static void someOtherMethod() {
    int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 6) {
            arr[i] = arr[i] * 2;    // или arr[i] *= 2
        }
    }
    System.out.println(java.util.Arrays.toString(arr));
}
        // задание 13 - diagonalArray()
public static void diagonalArray() {
    int size = 4;
    int[][] arr = new int[size][size];  // массив 4x4
    for (int i = 0; i < size; i++) {
        arr[i][i] = 1;                  // строка i, столбец i
    }
    for (int[] row : arr) {
        System.out.println(java.util.Arrays.toString(row));
    }
}
        // задание 14 - createArray()
public static int[] createArray(int len, int initialValue) {
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
        arr[i] = initialValue;
    }
    return arr;                         
}
}
