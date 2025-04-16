import java.util.ArrayList;
import java.util.Scanner;
public class TestBiblioteki {



    public static void main(String[] args) {
            ksiazka ksiazka1 = new ksiazka("Andrzej Sapkowski",320,1990,"Wiedźmin");
            ksiazka ksiazka2 = new ksiazka("Stephenie Meyer", 414,2005,"Zmierzch");
            film film1 = new film("Frank Darabont", 189,"Zielona Mila", 1999);
            film film2 = new film("Cris Columbus", 152,"Harry Potter i Kamień Filozoficzny", 2001);
    }
        mediaBiblioteczne[] mediaArray = new mediaBiblioteczne[4];
        mediaArray [0] = ksiazka ksiazka1;
        mediaArray [1] = ksiazka ksiazka2;
        mediaArray [2] = film film1;
        mediaArray [3] = film film2;


}
