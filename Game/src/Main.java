import java.util.*;
public class Main {
    // Det er i denne selve spillet udvikles

    public static void main(String[] args) {

        // player 1 og player 2 er vores spillere og dicesum er summen af begge terninger
        // die 1 og die 2 er vores to terninger og Die er vores metode

        int player1, player2, diceSum;
        Die die1, die2;

        // Her bruger vi igen Die som metode til at lave vores terninger
        die1 = new Die();
        die2 = new Die();

        // Player 1 og 2 score er 0 til at starte med
        player1 = 0;
        player2 = 0;

        // Så længe at begge spilleres score er under 40, så kører while loppet videre.
        while (player1 < 40 && player2 < 40) {

            // begge terninger kastes
            die1.roll();
            die2.roll();

            //Dicesummen er valuen af begge kastede terninger
            diceSum = die1.getFaceValue() + die2.getFaceValue();

            // System udskriver hvad spiller 1 slog med terningerne
            // Efter så kommer den til at gemme terningernes værdi til spillerens score
            // Systemet udskriver spillerens totale score
            System.out.println("Player one rolled: " + die1.toString() + " and " + die2.toString());
            player1 = player1 + diceSum;
            System.out.println("Player ones total score is: " + player1);

            // Nu er spiller 1's tur færdig og derfor kastes der et nyt kast
            die1.roll();
            die2.roll();

            // Dicesummen er valuen af begge kastede terninger
            diceSum = die1.getFaceValue() + die2.getFaceValue();


            // System udskriver hvad spiller 1 slog med terningerne
            // Efter så kommer den til at gemme terningernes værdi til spillerens score
            // Systemet udskriver spillerens totale score
            System.out.println("Player two rolled: " + die1.toString() + " and " + die2.toString());
            player2 = player2 + diceSum;
            System.out.println("Player two's total score is: " + player2);

            // Hvis spilleren slår over 40, så vinder spiller 1
            if(player1 > 40){
                System.out.println("player one won");

            }
            // Hvis spiller 1 ikke får 40 først, så vinder spiller 2, ved at slå 40.
            else if(player2 > 40){
                System.out.println("player two won");

            }
        }
    }
}
