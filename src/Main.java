public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();

        firstMovie.setTitle("Interstellar");
        firstMovie.setReleaseYear(2014);
        firstMovie.setDurationInMinutes(169);
        firstMovie.setInPlan(true);

        firstMovie.showTechnicalSheet();
        firstMovie.evaluate(10);
        firstMovie.evaluate(9);
        firstMovie.evaluate(9);

        System.out.printf("A media de avaliações do filme: %.2f\n",firstMovie.getMedia());
        System.out.printf("Com um total de %d avaliações.",firstMovie.getTotalEvaluations());
    }
}
