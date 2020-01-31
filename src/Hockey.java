public class Hockey extends Sports
{
    private int periods;

    public Hockey(String league, String team, String equipment, int score, int periods)
    {
        super(league, team, equipment, score);
        this.periods = periods;
    }// end of football constructor

    public String toString()
    {
        String output = super.toString() + "\nPeriods: " + periods;
        return output;
    }// end of toString
}
