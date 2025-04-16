import java.util.ArrayList;
import java.util.Scanner;
public class TestBiblioteki {



    public static void main(String[] args) {
            ksiazka ksiazka1 = new ksiazka("Andrzej Sapkowski",320,1990,"Wiedźmin");
            ksiazka ksiazka2 = new ksiazka("Stephenie Meyer", 414,2005,"Zmierzch");
            film film1 = new film("Frank Darabont", 189,"Zielona Mila", 1999);
            film film2 = new film("Cris Columbus", 152,"Harry Potter i Kamień Filozoficzny", 2001);

        mediaBiblioteczne[] mediaArray = new mediaBiblioteczne[4];
        mediaArray [0] = ksiazka1;
        mediaArray [1] = ksiazka2;
        mediaArray [2] = film1;
        mediaArray [3] = film2;

    System.out.println("===INFORMACJE O WSZYSTKICH MEDIACH===");
    for(mediaBiblioteczne media : mediaArray){
        media.wyswietlInformacje();
        System.out.println("--------");
        }

    System.out.println("===WYPZYCZANIE I ZWRACANIE===");
        ksiazka1.wyporzycz();
        ksiazka1.wyporzycz();
        ksiazka2.zwroc();

        System.out.println("===SPECYFICZNE DLA TYPÓW");
        ksiazka1.sprawdzLiczbeStron();
        film1.sprawdzCzasTrwania();

        System.out.println("===RZUTOWANIE TYPÓW===");
            for(mediaBiblioteczne media : mediaArray){
                if(media instanceof ksiazka) {
                    ksiazka ksiazka = (ksiazka) media;
                    ksiazka.sprawdzLiczbeStron();
                }else if(media instanceof film) {
                    film film = (film) media;
                    ((film) media).sprawdzCzasTrwania();
                }
            }
    }
}