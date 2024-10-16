import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String player1 = "";
        String player2 = "";
        String trash = "";
        boolean done = false;
        Scanner input = new Scanner(System.in);
do{
        System.out.println("player 1 enter your move! [R/P/S]");
        player1 = input.nextLine();
        if  (player1.matches("RsPpSs")){
            System.out.println("Valid Move");}
        else if (!player1.matches("RrPpSs")){
            System.out.println("please enter a valid move");}

        System.out.println("player 2 enter your move! [R/P/S]");
        player2= input.nextLine();
        if (player2.matches("RsPpSs")){
        System.out.println("Valid Move");}
        else if (!player2.matches("RrPpSs")){
    System.out.println("please enter a valid move");}
if (player1.equals(player2))
        System.out.println("tie!");
 if  (player1.equals("r") && player2.equals("s"))
     System.out.println(" Player1 Wins! Rock beats scissors");

 if   (player1.equals("s") && player2.equals("p"))
         System.out.println("Player1 Wins! scissors beats paper");

     if   (player1.equals("p") && player2.equals("r"))
         System.out.println("Player1 Wins! paper beats rock");

  if (player2.equals("r") && player1.equals("s"))
      System.out.println("Player2 Wins! rock beats scissors");

  if   (player2.equals("s") && player1.equals("p"))
    System.out.println("Player2 Wins! scissors beats paper");
  if         (player2.equals("p") && player1.equals("r"))
               System.out.println("Player2 Wins! paper beats rock");


    System.out.println("Would you like to play again? (Y/N)");
    if (input.hasNextLine())
        done = input.nextLine().toLowerCase().equals("n");



        }while(!done);

    }
}