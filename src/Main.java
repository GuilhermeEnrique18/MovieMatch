import br.com.moviematch.calculate.FilterRecomendations;
import br.com.moviematch.calculate.TimeCalculator;
import br.com.moviematch.modelos.Ep;
import br.com.moviematch.modelos.Movie;
import br.com.moviematch.modelos.Series;

public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();

        firstMovie.setName("Interstellar");
        firstMovie.setReleaseYear(2014);
        firstMovie.setDurationInMinutes(169);
        System.out.printf("Duração do filme: %d\n",firstMovie.getDurationInMinutes());
        firstMovie.setInPlan(true);

        firstMovie.showTechnicalSheet();
        firstMovie.evaluate(10);
        firstMovie.evaluate(9);
        firstMovie.evaluate(9);

        System.out.printf("A media de avaliações do filme: %.2f\n",firstMovie.getMedia());
        System.out.printf("Com um total de %d avaliações.\n \n",firstMovie.getTotalEvaluations());

        Series walkingDead = new Series();
        walkingDead.setName("The Walking Dead");
        walkingDead.setReleaseYear(2010);
        walkingDead.showTechnicalSheet();
        walkingDead.setSeasons(11);
        walkingDead.setEpsForSeason(13);
        walkingDead.setMinutesForEps(50);
        System.out.printf("Duração para maratonar: %d\n",walkingDead.getDurationInMinutes());

        Movie otherMovie = new Movie();
        otherMovie.setName("Transformers");
        otherMovie.setReleaseYear(2007);
        otherMovie.setDurationInMinutes(160);
        System.out.printf("Duração do filme: %d\n",firstMovie.getDurationInMinutes());
        otherMovie.setInPlan(true);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(firstMovie);
        calculator.include(otherMovie);
        calculator.include(walkingDead);
        System.out.println(calculator.getFullTime());

        FilterRecomendations filtering = new FilterRecomendations();
        filtering.filter(firstMovie);


        Ep ep = new Ep();
        ep.setNumber(1);
        ep.setSerie(walkingDead);
        ep.setTotalViews(300);
        filtering.filter(ep);


    }
}