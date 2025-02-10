import java.util.ArrayList;
import java.io.*;  
import java.util.Scanner;
import javax.security.auth.Subject;

public class GameList{
    ArrayList<Game> superBowls = new ArrayList<Game>();

    File file = new File("src/main/java/SuperBowlData.txt");
    Scanner text = new Scanner(file);

    public GameList() throws Exception{
        while text.hasNextLine(){
            String str = text.nextLine();
            int yearStart = str.indexOf(",");
            int yearComma = str.indexOf(",", yearStart + 1);
            int winnerStart = str.indexOf(",", yearComma + 1);
            int scoreStart = str.indexOf(",", winnerStart + 1);
            int loserStart = str.indexOf(",", scoreStart + 1);
            int venueStart = str.indexOf(",", loserStart + 1);
            int locationStart = str.indexOf(",", venueStart + 1);
            int locationComma = str.indexOf(",", locationStart + 1);

            String numeral = str.substring(0, yearStart);
            String year = str.substring(yearComma + 2, winnerStart - 1);
            String 

        }
    }









}
