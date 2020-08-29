package zadanie1;

public class Zadacha1_2 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int c = 42;                                             //дублирование переменной для операций со смещением
        int n = 2;                                              //кол-во смещений

        System.out.println("Побитовый унарный оператор NOT");
        System.out.println(~a);                                 //~00101010 результат -43 (11010101)
        System.out.println(~b);                                 //~00001111 результат -16 (11110000)
        System.out.println();

        System.out.println("Побитовый AND");
        System.out.println(a & b);                              //00101010 & 00001111 результат 10 (00001010)
        System.out.println();

        System.out.println("Побитовый OR");
        System.out.println(a | b);                              //00101010 | 00001111 результат 47 (00101111)
        System.out.println();

        System.out.println("Побитовый исключающее OR");
        System.out.println(a ^ b);                              //00101010 ^ 00001111 результат 37 (00100101)
        System.out.println();

        System.out.println("Побитовый AND с присваиванием");
        System.out.println(a &= b);                             //00101010 &= 00001111 результат 10 (00001010)
        System.out.println();

        System.out.println("Побитовый OR с присваиванием");
        System.out.println(a |= b);                             //00001010 |= 00001111 результат 15 (00001111)
        System.out.println();

        System.out.println("Побитовый исключающее OR с присваиванием");
        System.out.println(a ^= b);                             //00001111 ^= 00001111 результат 0 (00000000)
        System.out.println();

        System.out.println("Сдвиг вправо");
        System.out.println(c >> n);                             //00101010 >> 2 результат 10 (00001010)
        System.out.println();

        System.out.println("Сдвиг вправо с присваиванием");
        System.out.println(c >>= n);                            //00101010 >>= 2 результат 10 (00001010)
        System.out.println();

        System.out.println("Сдвиг вправо с заполнением нулями");
        System.out.println(c >>> n);                            //00001010 >>> 2 результат 2 (00000010)
        System.out.println();

        System.out.println("Сдвиг влево");
        System.out.println(c << n);                             //00001010 << 2 результат 40 (00101000)
        System.out.println();

        System.out.println("Сдвиг влево с присваиванием");
        System.out.println(c <<= n);                            //00001010 <<= 2 результат 40 (00101000)
        System.out.println();

        System.out.println("Сдвиг вправо с заполнением нулями с присваиванием");
        System.out.println(c >>>= n);                           //00101000 >>>= 2 результат 10 (00001010)
        System.out.println();

    }
}