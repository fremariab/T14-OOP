public class SustainableDevelopment extends AdaptationStrategies {
    private String goals;
    private String indicators;
    private int yearOfImplementation;
    private static final CURRENT_YEAR=2023;

    public SustainableDevelopment(String strategyName,String benefits, String limitations, double successRate,String indicators,String goals,int yearOfImplementation){
        super(strategyName, benefits, limitations, successRate);
        this.goals=goals;
        this.indicators=indicators;
        setYearOfImplementation(yearOfImplementation);
    }

    public void setYearOfImplementation(int yearOfImplementation) {
        this.yearOfImplementation = yearOfImplementation;
    }
    public int getYearOfImplementation() {
        return yearOfImplementation;
    }
    public String getGoals(){
        return this.goals;
    }

    public String getIndicators(){
        return this.indicators;
    }

    public void setGoals(String goals){
        this.goals = goals;
    }

    public void setIndicators(String indicators){
        this.indicators = indicators;
    }

    // public String evaluateImpact()
    // {

    // }

    // public void displayInfo(){
    //     System.out.println("Goals: " + getGoals());
    //     System.out.println("Indicators: " + getIndicators());

    // }
    
    
}
