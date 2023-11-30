package ba.smoki.nine.human;

/**
 * 1. Enkapsulacija
 */
public class Movie {
    private String title;
    private String director;
    private int duration;
    private int rate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        if(rate>10){
            rate = 10;
        }
        if(rate < 1){
            rate = 1;
        }
        this.rate = rate;
    }
}
