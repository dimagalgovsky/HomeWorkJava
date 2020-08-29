package zadanie1;

public class Zadacha1_3 {

    public static void main(String[] args) {
        int a = -42;
        int b = -15;
        int c = -42;                                            //дублирование переменной для операций со смещением
        int n = 3;                                              //кол-во смещений

        System.out.println("Побитовый унарный оператор NOT");
        System.out.println(~a);                                 //~11010110 результат 41 (00101001)
        System.out.println(~b);                                 //~11110001 результат 14 (00001110)
        System.out.println();

        System.out.println("Побитовый AND");
        System.out.println(a & b);                              //11010110 & 11110001 результат -48 (11010000)
        System.out.println();

        System.out.println("Побитовый OR");
        System.out.println(a | b);                              //11010110 | 11110001 результат -9 (11110111)
        System.out.println();

        System.out.println("Побитовый исключающее OR");
        System.out.println(a ^ b);                              //11010110 ^ 11110001 результат 39 (00100111)
        System.out.println();

        System.out.println("Побитовый AND с присваиванием");
        System.out.println(a &= b);                             //11010110 &= 11110001 результат -48 (11010000)
        System.out.println();

        System.out.println("Побитовый OR с присваиванием");
        System.out.println(a |= b);                             //11010000 |= 11110001 результат -15 (11110001)
        System.out.println();

        System.out.println("Побитовый исключающее OR с присваиванием");
        System.out.println(a ^= b);                             //11110001 ^= 11110001 результат 0 (00000000)
        System.out.println();

        System.out.println("Сдвиг вправо");
        System.out.println(c >> n);                             //11010110 >> 3 результат -6 (11111010)
        System.out.println();

        System.out.println("Сдвиг вправо с присваиванием");
        System.out.println(c >>= n);                            //11010110 >>= 3 результат -6 (11111010)
        System.out.println();

        System.out.println("Сдвиг вправо с заполнением нулями");
        System.out.println(c >>> n);                            //11111010 >>> 3 результат 536870911 (?) проверить
        System.out.println();

        System.out.println("Сдвиг влево");
        System.out.println(c << n);                             //11111010 << 3 результат -48 (11010000)
        System.out.println();

        System.out.println("Сдвиг влево с присваиванием");
        System.out.println(c <<= n);                            //11111010 <<= 3 результат -48 (11010000)
        System.out.println();

        System.out.println("Сдвиг вправо с заполнением нулями с присваиванием");
        System.out.println(c >>>= n);                           //11010000 >>>= 3 результат 536870906 (?) проверить
        System.out.println();

    }
}
