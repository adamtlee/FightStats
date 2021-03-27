
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        ArrayList<Athlete> roster = new ArrayList<Athlete>();

        roster.add(new Athlete("Curtis Blaydes", 30, 259, "Heavyweight", 14, 3, 0));
        roster.add(new Athlete("Neil Magny", 33, 170, "Welterweight", 24, 8, 0));
        roster.add(new Athlete("Cory Sandhagen", 28, 135, "Bantamweight", 14, 2, 0));

        System.out.println(roster);
    }
}