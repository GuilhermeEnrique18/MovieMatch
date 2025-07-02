public class Movie {
    private String title;
    private int releaseYear;
    private int durationInMinutes;
    private boolean inPlan;
    private double sumEvaluation;
    private int totalEvaluations;

    void showTechnicalSheet(){
        System.out.printf("Nome do filme: %s\n", title);
        System.out.printf("Ano de lançamento: %d\n", releaseYear);
        System.out.printf("Duração em minutos: %d\n", durationInMinutes);
        System.out.printf("Incluido no plano: %b\n", inPlan);
    }

    void evaluate(double rating){
        sumEvaluation += rating;
        totalEvaluations ++;
    }

    public void setInPlan(boolean inPlan){
        this.inPlan = inPlan;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public void setDurationInMinutes(int durationInMinutes){
        this.durationInMinutes = durationInMinutes;
    }

    public int getTotalEvaluations() {
        return this.totalEvaluations;
    }

    public double getMedia(){
        return sumEvaluation / totalEvaluations;
    }

    public String getTitle(){
        return this.title;
    }

    public int getReleaseYear(){
        return this.releaseYear;
    }

    public boolean getInPlan(){
        return this.inPlan;
    }

    public int getDurationInMinutes(){
        return this.durationInMinutes;
    }

}
