import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GameList{
    ArrayList<Game> superBowls;

    public GameList(Scanner text) throws Exception{
        superBowls = new ArrayList<Game>();

        while (text.hasNextLine()){
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
            int year = Integer.valueOf(str.substring(yearComma + 2, winnerStart - 1));
            String winningTeam = str.substring(winnerStart + 1, scoreStart);
            String score = str.substring(scoreStart + 1, loserStart);
            String losingTeam = str.substring(loserStart + 1, venueStart);
            String location = str.substring(locationStart + 2, locationComma);

            Game superb = new Game(numeral, year, location, losingTeam, winningTeam, score);
            superBowls.add(superb);
        }
    }









}
