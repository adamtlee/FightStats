
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<String> fighters = new ArrayList<String>();
        fighters.add("Curtis Blaydes");
        fighters.add("Niel Magny"); 
        fighters.add("Corey Sandhagen"); 
        System.out.println("Fighters array List: " + fighters);

        ArrayList<Athlete> roster = new ArrayList<Athlete>();
        roster.add(new Athlete("Joe", 25, 142.4, 145, 22, 1, 2));
        roster.add(new Athlete("Bob", 27, 142.4, 145, 22, 3, 2));
        System.out.println(roster);
    }
}