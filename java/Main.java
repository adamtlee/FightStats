
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){

        List<Athlete> roster = new ArrayList<Athlete>();
        List<Athlete> rosterFromCsv = csvReader("../data/data.csv");

        roster.add(new Athlete("Curtis Blaydes", 30, 259, "Heavyweight", 14, 3, 0));
        roster.add(new Athlete("Neil Magny", 33, 170, "Welterweight", 24, 8, 0));
        roster.add(new Athlete("Cory Sandhagen", 28, 135, "Bantamweight", 14, 2, 0));

        System.out.println("roster: ");
        for(Athlete a:roster){
            System.out.println(a);
            System.out.println();
        }

        System.out.println("roster from csv: ");
        for(Athlete b:rosterFromCsv){
            System.out.println(b);
            System.out.println();
        }
    }

    private static List<Athlete> csvReader(String fileName){
        List<Athlete> roster = new ArrayList<>();
        Path filePath = Paths.get(fileName); 

        try (BufferedReader br = Files.newBufferedReader(filePath, StandardCharsets.US_ASCII)){
            String line = br.readLine();

            while(line != null){
                String[] attributes = line.split(","); 
                Athlete athlete = createAthlete(attributes);
                roster.add(athlete); 

                line = br.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return roster;
    }

    private static Athlete createAthlete(String[] metadata){
        String name = metadata[0];
        int age = Integer.parseInt(metadata[1]);
        double weight = Double.parseDouble(metadata[2]);
        String weightClass = metadata[3];
        int wins = Integer.parseInt(metadata[4]);
        int losses = Integer.parseInt(metadata[5]);
        int draws = Integer.parseInt(metadata[6]);

        return new Athlete(name, age, weight, weightClass, wins, losses, draws);
    }
}