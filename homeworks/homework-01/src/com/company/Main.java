package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Загадай число от 1 до 2 147 483 647 и я его угадаю. Как тебя зовут? ");
        String name = in.nextLine();
        int max = 2147483647;
        int min = 1;
        int scor = 0;
        int random = max / 2;
        System.out.println("Очень приятно, " + name + ". Число которое Ты загадал - " + random  + " ? (1-ДА,0-НЕТ)");
        int i = in.nextInt();
        boolean correctNumber = true;
        while(i != 1) {
            System.out.println("Твоё число больше " + random + "? (1-ДА,0-НЕТ)");
            i = in.nextInt();
            if(random == max && i == 1 ) { correctNumber = false; break; }
            else if (random == min && i == 0) { correctNumber = false; break; }

            if (i == 1) {
                min = random + 1;
                int random2 = min + (max - min ) / 2;
                random = random2;
                scor++;
                System.out.println("Ты загал число " + random + " ? (1-ДА,0-НЕТ)" + " Сейчас диапозон : "
                        + min + " - " + max);
                i = in.nextInt();
            } else {
                max = random - 1;
                int random2 = min + (max - min) / 2;
                random = random2;
                scor++;
                System.out.println("Ты загал число " + random + " ? (1-ДА,0-НЕТ)" + " Сейчас диапозон : "
                        + min + " - " + max);
                i = in.nextInt();
            }
            if (max >= min) { }
            else {
                System.out.println("Ошибка");
                correctNumber = false;
                break;
            }
        }
        if (correctNumber) { System.out.println("Твоё число было " + random + " . Угаданно с " + scor + " попыток"); }
        else { System.out.println("Вы вышли за разумный диапазон поиска"); }
    }
}