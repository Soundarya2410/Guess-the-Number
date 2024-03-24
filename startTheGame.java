class startTheGame
{

    player p1,p2;
    private static int expectedNumber;
    startTheGame(String n1,String n2)
    {
      p1 = new player(n1);
      p2 = new player(n2);
    }

 
    void start()
    {
      
        System.out.println("Welcome to the game "+p1.name+" and "+p2.name);
        expectedNumber = (int) (Math.random()*10);
        boolean lost = true;

        while(lost)
        {
          expectedNumber = (int) (Math.random()*10);
          //System.out.println(expectedNumber);
          System.out.println("Please enter the number you guessed");
          p1.makeGuess();
          p2.makeGuess();
          lost = checkWinner();
        }
        System.out.println("Game Over!");

    }


    
    boolean checkWinner()
    {
      if(p1.guess==expectedNumber)
      {
        System.out.println(p1.name+" won the game :)");
        return false;
      }
      else if(p2.guess==expectedNumber)
      {
        System.out.println(p2.name+" won the game :)");
        return false;
      }
      else if(p1.guess==-1||p2.guess==-1)
      {
        System.out.println("The Expected number is : "+expectedNumber+"\nThe game has been halted by you :(");
        return false;
      }
      return true;
    }
}