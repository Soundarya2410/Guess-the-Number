import java.util.Scanner;

public class game
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter player1 name : ");
        String player1 = sc.next();
        System.out.print("Enter player2 name : ");
        String player2 = sc.next();

        startTheGame obj = new startTheGame(player1,player2);
        obj.start();
    }
}