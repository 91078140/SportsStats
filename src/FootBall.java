public class FootBall extends Sports
{
    private int quarters;

    public FootBall(String league, String team, String equipment, int score, int quarters)
    {
       super(league, team, equipment, score);
       this.quarters = quarters;
    }// end of football constructor

    public String toString()
    {
        String output = super.toString() + "\nQuarters: " + quarters;
        return output;
    }// end of toString
}
