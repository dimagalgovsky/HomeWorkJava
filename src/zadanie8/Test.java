package zadanie8;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String data = printRates(new NBRBLoader());
        System.out.println(data);

        String way = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Вы хотете указать путь к файлу?");
        System.out.println("1.Да" + "\t" + "2.Нет");
        int answer = in.nextInt();
        if (answer == 1) {
            System.out.println("Введите путь к сохранению файла:");
            way = in.next();
        } else {
            way = "";
        }
        safeData(data,way);
    }

    public static String printRates(SiteLoader loader) {
        String result = "EUR:";
        result += loader.load(SiteLoader.Currency.EUR);
        result += "\t"+"RUB:";
        result += loader.load(SiteLoader.Currency.RUB);
        result += "\t"+"USD:";
        result += loader.load(SiteLoader.Currency.USD);
        return result;
    }

    public static void safeData(String data, String way) {
        BufferedWriter writer = null;
        try {
            String path = way+"file.txt";
            writer = new BufferedWriter(new FileWriter(path));
            writer.write(data);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
