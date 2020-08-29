import java.sql.SQLOutput;
import java.util.Arrays;

public class Zadacha2_1 {

    public static void main(String[] args){

        int primer1 = 5 + 2 / 8;                                        // 2/8=0-->0+5=5
        int primer2 = ( 5 + 2 ) / 8;                                    // 5+2=7-->0/8=0

        int a = 2;
        int a1 = a++;
        int b = 8;
        int b1 = --b;

        int primer3 = ( 5 + a1 ) / 8;                                   // a1=2--> (5+2) / 8 = 0
        int primer4 = ( 5 + a1 ) / b1;                                  // a1=2; b1=7-->(5+2) / 7 = 1
        int primer5 = ( 5 * 2 >> a1 ) / b1;                             // 10(000001010)>>2-->2(000000010)-->2/7=0
        int primer6 = ( 5 + 7 > 20 ? 68 : 22 * 2 >> a1 ) / b1;          //12>20-false-->44(00101100)>>2-->(00001011)11/7=1
        //int primer7 =  5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a1 / b1;     //ошибка,block1-boolean(но нет понимания почему это влияет, так как он должен был перескочить сразу на Block 2
        boolean primer8 = 6 - 2 > 3 && 12 * 12 <= 119;                  // 4>3 - true, 144<= - false - выбор false
        boolean primer9 = true && false;                                // из true и false выбирается false


       System.out.println("Ответ в примере №1 - " +primer1);
       System.out.println("Ответ в примере №2 - " +primer2);
       System.out.println("Ответ в примере №3 - " +primer3);
       System.out.println("Ответ в примере №4 - " +primer4);
       System.out.println("Ответ в примере №5 - " +primer5);
       System.out.println("Ответ в примере №6 - " +primer6);
       //System.out.println("Ответ в примере №7 - " +primer7);
       System.out.println("Ответ в примере №8 - " +primer8);
       System.out.println("Ответ в примере №9 - " +primer9);

    }
}

