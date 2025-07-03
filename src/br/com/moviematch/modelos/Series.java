package br.com.moviematch.modelos;

public class Series extends Title{
    private int seasons;
    private boolean activate;
    private int epsForSeason;
    private int minutesForEps;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }

    public int getEpsForSeason() {
        return epsForSeason;
    }

    public void setEpsForSeason(int epsForSeason) {
        this.epsForSeason = epsForSeason;
    }

    public int getMinutesForEps() {
        return minutesForEps;
    }

    public void setMinutesForEps(int minutesForEps) {
        this.minutesForEps = minutesForEps;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * epsForSeason * minutesForEps;
    }
}
