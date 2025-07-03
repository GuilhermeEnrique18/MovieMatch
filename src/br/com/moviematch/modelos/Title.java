package br.com.moviematch.modelos;

public class Title {
    private String name;
    private int releaseYear;
    private int durationInMinutes;
    private boolean inPlan;
    private double sumEvaluation;
    private int totalEvaluations;

    public void showTechnicalSheet(){
        System.out.printf("Nome do filme: %s\n", name);
        System.out.printf("Ano de lançamento: %d\n", releaseYear);
        System.out.printf("Duração em minutos: %d\n", durationInMinutes);
        System.out.printf("Incluido no plano: %b\n", inPlan);
    }

    public void evaluate(double rating){
        sumEvaluation += rating;
        totalEvaluations ++;
    }

    public void setInPlan(boolean inPlan){
        this.inPlan = inPlan;
    }

    public void setName(String name){
        this.name = name;
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

    public String getName(){
        return this.name;
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
