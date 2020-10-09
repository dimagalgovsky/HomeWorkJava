package zadanie1.zadacha6;

public class Zadanie6 {

    public static void main(String[] args) {
        int[] arr = new int[]{0,2,9,5,7,3,8,3,0,4};
        System.out.println(createPhoneNumber(arr));
    }

    static String createPhoneNumber(int[] arr){
        return "("+arr[0]+arr[1]+arr[2]+") "+arr[3]+arr[4]+arr[5]+"-"+arr[6]+arr[7]+arr[8]+arr[9];
    }
}
