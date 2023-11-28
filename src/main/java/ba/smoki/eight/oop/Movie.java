package ba.smoki.eight.oop;
// ili public ili paketno privatna(bez ključne riječi)
class Movie {
    //polja, atributi ili properties
    private String director;
    private String title;
    private int duration;
    private int rating;//1-10

    //private, paketno privatni, protected i public
    public int getRating(){
        System.out.println("Neko hoće da zna ocjenu filma...");
        return rating;
    }

    //Movie.setRating()
    //Movie movie1 = new Movie();
    //movie1.setRating(129);
    public void setRating(int rating){
        if(rating>10){
            rating = 10;
        }
        if(rating<1){
            rating = 1;
        }
        this.rating = rating;// this uvijek znači referenca na objekat
    }

     String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
