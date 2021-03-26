public class Athlete {
    private String name; 
    private int age; 
    private double weight;
    private double weightClass; 
    private int wins, losses, draws; 

    public Athlete(String name, int age, double weight, double weightClass, 
                    int wins, int losses, int draws){
        this.name = name;
        this.age = age;
        this.weight = weight; 
        this.weightClass = weightClass;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;

    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return(
            "Athlete Name: " + this.getName()
        );
    }

}
