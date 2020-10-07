package zadanie2.newVariant;

public class Massiv {

    public static int[] arr = new int[]{10,8,34,87,11,33,2,1,19};
//2.1.1
    public static void printDoWhile_2_1_1(){

        int i = 0;
        do {
            System.out.print(arr[i]+" ");
            i++;
        }
        while (i < arr.length);
        System.out.println();
    }

//2.1.2
    public static void printWhile_2_1_2() {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
    }

//2.1.3
    public static void printFor_2_1_3(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

//2.1.4
    public static void printForeach_2_1_4(){
        for (int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

//2.2
    public static void printEach2_2_2(){
        for (int i = 0; i < arr.length; i+=2) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

//2.3.1
  public static void printEndDoWhile_2_3_1(){

      int i = arr.length-1;
      do {
          System.out.print(arr[i]+" ");
          i--;
      }
      while (i >= 0);
      System.out.println();
  }

//2.3.2
    public static void printEndWhile_2_3_2() {
        int i = arr.length-1;
        while (i >= 0) {
            System.out.print(arr[i]+" ");
            i--;
        }
        System.out.println();
    }

//2.3.3
    public static void printEndFor_2_3_3(){
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

//2.3.4
    public static void printEndForeach_2_3_4(){

        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[arr.length - 1 - j];
            arr[arr.length - 1 - j] = temp;
        }
        for (int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
