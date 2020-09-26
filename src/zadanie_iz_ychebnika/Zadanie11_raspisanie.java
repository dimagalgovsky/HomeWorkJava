package zadanie_iz_ychebnika;

import java.util.Scanner;

public class Zadanie11_raspisanie {
    public static void main(String[] args) {
        System.out.println("Ваше расписание на неделю: \n 1. Понедельник - Целый день ИБД \n 2. Вторник - Ныть о работе \n" +
                " 3. Среда - Думать о тот, что послезавтра пятница \n 4. Четверг - Думать о пятнице \n 5. Пятница - Ждать вечер пятницы" +
                "\n 6. Суббота - Отсыпаться после пятницы \n 7. Воскресенье - Ныть что завтра на работу");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели");
        int num = in.nextInt();

        switch (num){
            case 1:
                System.out.println("Ваше расписание на этот день:");
                System.out.println("Целый день ИБД");
                break;
            case 2:
                System.out.println("Ваше расписание на этот день:");
                System.out.println("Ныть о работе");
                break;
            case 3:
                System.out.println("Ваше расписание на этот день:");
                System.out.println("Думать о тот, что послезавтра пятница");
                break;
            case 4:
                System.out.println("Ваше расписание на этот день:");
                System.out.println("Думать о пятнице");
                break;
            case 5:
                System.out.println("Ваше расписание на этот день:");
                System.out.println("Ждать вечер пятницы");
                break;
            case 6:
                System.out.println("Ваше расписание на этот день:");
                System.out.println("Отсыпаться после пятницы");
                break;
            case 7:
                System.out.println("Ваше расписание на этот день:");
                System.out.println("Ныть что завтра на работу");
                break;
        }
    }
}
