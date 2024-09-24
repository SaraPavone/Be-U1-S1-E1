import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("---------------ESERCIZIO 2---------------");
        Scanner input = new Scanner(System.in);
        String[] inputStrings = new String[3];

        System.out.println("Inserisci il tuo nome");
        inputStrings[0] = input.nextLine();
        System.out.println("Inserisci il tuo cognome");
        inputStrings[1] = input.nextLine();
        System.out.println("Inserisci la tua eta'");
        inputStrings[2] = input.nextLine();

        System.out.println("I tuoi dati");
        System.out.println("Ciao " + inputStrings[0] + " " + inputStrings[1] + ", tu hai " + inputStrings[2] + " anni");

        System.out.println("In ordine inverso");
        System.out.println(inputStrings[2] + " " + inputStrings[1] + " " + inputStrings[0]);

        input.close();
    }
}
