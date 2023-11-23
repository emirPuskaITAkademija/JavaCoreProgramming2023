package ba.smoki.seven.oop;

public class Film {
    public String režiser;
    public String naslov;
    public int trajanje;
    private int recenzija; // 1-10

    public void setRecenzija(int recenzija) {
        if(recenzija>10){
            recenzija = 10;
        }
        if(recenzija<1){
            recenzija = 1;
        }
        this.recenzija = recenzija;
    }

    public int getRecenzija() {
        return recenzija;
    }
}
