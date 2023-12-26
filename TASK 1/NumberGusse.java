import java.util.*;

class gusser {
    int guessNum;
    int guessingNumber(){
         Scanner scan = new Scanner(System.in);
         System.out.println("Guesser! kindly guess the number");
         guessNum=scan.nextInt();
        return guessNum;
    }
}
class player {
    int guessNum;
   int guesingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("player! kindly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }

}
class umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumberFromGuesser() {
        gusser g = new gusser();
        numFromGuesser = g.guessingNumber();
    }
    void collectNumberFromPlayer() {
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();
        numFromPlayer1=p1.guesingNumber();
        numFromPlayer2=p2.guesingNumber();
        numFromPlayer3=p3.guesingNumber();
    }
    void compare() {
        if (numFromGuesser==numFromPlayer1) {
                if(numFromGuesser==numFromPlayer2 && numFromGuesser== numFromPlayer3) {
                    System.out.println("all winner");
                }
                else if (numFromGuesser==numFromPlayer2) {
                    System.out.println("Player 1 aur player 2 won");
                }
                else if (numFromGuesser==numFromPlayer3) {
                    System.out.println("palyer 1 and player 4 won the game ");
                }
                else{
                    System.out.println("player1 won the game");
        }
    }
        else if (numFromGuesser==numFromPlayer2) {
             if (numFromGuesser==numFromPlayer3) {
                System.out.println("Player 2 and player 3 won the match");
            }
           else { 
            System.out.println("player 2 won the game ");
        }
    }
        else if (numFromGuesser==numFromPlayer3) {
            System.out.println("Player 3 won the game");
        }
        else {
            System.out.println("You lost, better luck next time :");
        }

    }
}
public class NumberGusse {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            
        
        System.out.println("GAME STARTED");
        umpire u =new umpire();
        u.collectNumberFromGuesser();
        u.collectNumberFromPlayer();
        u.compare();
        }
    }
}
