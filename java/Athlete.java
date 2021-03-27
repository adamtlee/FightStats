public class Athlete {
    private String name; 
    private int age; 
    private double weight;
    private String weightClass; 
    private int wins, losses, draws; 

    public Athlete(String name, int age, double weight, String weightClass, 
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

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight; 
    }

    public String getWeightClass(){
        return weightClass;
    }

    public int getWins(){
        return wins; 
    }

    public int getLosses(){
        return losses; 
    }
    public int getDraws(){
        return draws; 
    }

    @Override
    public String toString(){
        return(
            "Athlete Name: " + this.getName() + "\n" + 
            " Age: " + this.getAge() + 
            " Weight in Lbs: " + this.getWeight() + 
            " Weight Class: " + this.getWeightClass() + 
            " Wins: " + this.getWins() + 
            " Losses: " + this.getLosses() + 
            " Draws: " + this.getDraws()
        );
    }

}
