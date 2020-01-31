public class SportsDriver
{
    public static void main(String []args)
    {

        Sports saints = new FootBall("NFL", "New Orleans Saints", "pads, helmet",
                                     6, 4);
        Sports ducks = new Hockey("NHL", "Anaheim Ducks", "pads, helmet, skates", 1, 3);
        Sports lakers = new BasketBall("NBA", "LA Lakers", "jersey, shoes", 2, 4);

        System.out.println(saints.toString());
        System.out.println(ducks.toString());
        System.out.println(lakers.toString());

    }// end of main method
}//end of driver class
