public class ksiazka extends mediaBiblioteczne {

    private String autor;
    private int liczbaStron;

    public ksiazka(String autor, int liczbaStron, int rokWydania, String tytul) {
        super(tytul, rokWydania);
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }
    @Override
    public void sprawdzLiczbeStron(){
        super.wyswietlInformacje();
        System.out.println("Autor" + autor + "Liczba stron: " + liczbaStron);
    }
}
