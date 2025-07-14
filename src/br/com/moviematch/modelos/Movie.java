package br.com.moviematch.modelos;

import br.com.moviematch.calculate.Classification;

public class Movie  extends Title implements Classification {
    private String director;

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
