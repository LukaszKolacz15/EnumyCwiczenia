package pl.akademiakodu;

import pl.akademiakodu.Guitars.TypeOfGuitar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


////        inicjalizacja pola
//        EnumSex sex = EnumSex.MEN;
//
//
////        przykladowe wywolanie enuma:
//        switch (sex){
//            case WOMEN:
//                System.out.println("Kobieta");
//            case MEN:
//                System.out.println("Facet");
//        }
//  --------------------------------------------------------------------------------

//       ZADANIE DAYS

        Days today = Days.SOBOTA;
        System.out.println("Jest dziś wykład? " + today.isLecture());



        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz dzień tygodnia, aby dowiedziec sie wiecej");
        System.out.println("Dzień ");
        String day = scanner.nextLine().toUpperCase();

        Days enumDay = Days.valueOf(day);
        System.out.println("Numer dnia tygodnia: "+ (enumDay.getNumberOfDay()));
        System.out.println("Mamy wyklad?" + (enumDay.isLecture() ? "tak" : "nie"));
        System.out.println("Jest wtedy weekend? " + (enumDay.isWeekend() ? "tak" : "nie"));

//  -----------------------------------------------------------------------------------

//        GITARA

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Podaj typ gitary");
//        String guitar = scanner.nextLine().toUpperCase();
//
//        TypeOfGuitar type = TypeOfGuitar.valueOf(guitar);
//
//        System.out.println("Jest elektryczna? " + type.isElectricOrNo());
//        System.out.println("ilosc strun: " + type.getIlstun());
//        System.out.println("kolor: " + type.getColour());


    }
}
