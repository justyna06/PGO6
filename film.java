public class film extends mediaBiblioteczne {

    private String rezyser;
    private int czasTrwania;

    public film(String rezyser, int czasTrwania, String tytul, int rokWydania) {
        super(tytul,rokWydania);
        this.rezyser = rezyser;
        this.czasTrwania = czasTrwania;
    }

    @Override
    public void wyswietlInformacje(){
        super.wyswietlInformacje();
        System.out.println("Rezyser: " + rezyser + "Czas Trwania: " + czasTrwania + "minut");
    }

    public void sprawdzCzasTrwania() {
        if(czasTrwania > 120) {
            System.out.println("Film jest dlugi" + czasTrwania+ "minut");
        }else{
            System.out.println("Film jest standardowy " + czasTrwania + "minut");
        }
    }
}
