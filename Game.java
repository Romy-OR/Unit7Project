public class Game{
    String numeral;
    int year;
    String location;
    String winningTeam;
    String losingTeam;
    String score;

    public Game(String numeral, int year, String location, String winningTeam, String losingTeam, String score){
        this.numeral = numeral;
        this.year = year;
        this.location = location;
        this.winningTeam = winningTeam;
        this.losingTeam = losingTeam;
        this.score = score;
    }

    public String getNumeral(){
        return this.numeral;
    }

    public int getYear(){
        return this.year;
    }

    public String getLocation(){
        return this.location;
    }

    public String getWinningTeam(){
        return this.winningTeam;
    }

    public String getLosingTeam(){
        return this.losingTeam;
    }

    public String getScore(){
        return this.score;
    }



    public void setNumeral(String nNumeral){
        this.numeral = nNumeral;
    }

    public void setYear(int nYear){
        this.year = nYear;
    }

    public void setLocation(String nLocation){
        this.location = nLocation;
    }

    public void setWinningTeam(String nWinner){
        this.winningTeam = nWinner;
    }

    public void setLosingTeam(String nLoser){
        this.losingTeam = nLoser;
    }

    public void setScore(String nScore){
        this.score = nScore;
    }

    public String toString(){
        return "/nSuperbowl " + numeral + ": " + winningTeam + " defeated " + losingTeam + "/nScore: " + score + "/nYear: " + year + "/nLocation: " + location + "/n";
    }

}