abstract public class Sports
{
    protected String league;
    protected String team;
    protected String equipment;
    protected int score;


    public Sports(String league, String team, String equipment, int score)
    {
        this.league = league;
        this.team = team;
        this.equipment = equipment;
        this.score = score;
    }// end of sports constructor

    public String toString()
    {
        String output = "League: " + league;
        output += "\nTeam: " + team;
        output += "\nEquipment: " + equipment;
        output += "\nScore: " + score;
        return output;
    }//end of toString

}// end of sports class
