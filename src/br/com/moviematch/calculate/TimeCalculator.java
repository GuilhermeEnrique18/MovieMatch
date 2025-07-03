package br.com.moviematch.calculate;

import br.com.moviematch.modelos.Title;

public class TimeCalculator {
    private int fullTime = 0;

    public int getFullTime() {
        return this.fullTime;
    }

//    public void include(Movie m){
//        this.fullTime += m.getDurationInMinutes();
//    }
//
//    public void include(Series s){
//        this.fullTime += s.getDurationInMinutes();
//    }

    public void include(Title title){
        this.fullTime+= title.getDurationInMinutes();
    }
}
