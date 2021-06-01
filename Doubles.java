import java.util.Random;

public class Doubles {
    public static void main(String[] args) {

        int dice1;
        int dice2;
        dice1=rollDice();
        dice2=rollDice();

         System.out.println("Dice 1: " + dice1);
         System.out.println("Dice 2: " + dice2 + "\n");

        while (dice1 != dice2) {
            dice1=rollDice();
            dice2=rollDice();
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2 + "\n");
        }
        System.out.println("You rolled doubles!");

    }

    public static int rollDice(){
        double randNumber = Math.random()*6;
        randNumber +=1;
        return (int)randNumber;
    }

}





