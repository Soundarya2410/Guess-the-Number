import java.util.Scanner;

class player
{
    String name;
    int guess;
     static Scanner sc = new Scanner(System.in);

    player(String name)
    {
        this.name  = name;
    }

    void  makeGuess()
    {
        System.out.print(name+" :");
        guess = sc.nextInt();
    }
}