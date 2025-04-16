public class mediaBiblioteczne {

    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny;

    public mediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.dostepny = true;
    }

    public void wyporzycz(){
        if(dostepny) {
            System.out.println("Wydanie dostepne");
        }else{
            System.out.println("Wydanie niedostepne");
        }
    }

    public void zwroc(){
        if(dostepny == false) {
            dostepny = true;
            System.out.println("Wydania dostepny");
        }else{
            System.out.println("Wydanie niedostepne");
        }
    }

    public void wyswietlInformacje(){
        System.out.println("Tytul: " + tytul + ",Rok Wydania: " + rokWydania + ",Dostepny: " + dostepny);
    }
}
