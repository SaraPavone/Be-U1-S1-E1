import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        System.out.println("---------------ESERCIZIO 3---------------");
        System.out.println("---------------PERIMETRO-----------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la base del rettangolo");
        double base = scan.nextDouble();
        System.out.println("Inserisci l'altezza del rettangolo");
        double altezza = scan.nextDouble();
        System.out.println("Il perimetro del rettangolo e': " + perimetroRettangolo (base, altezza));

        System.out.println("---------------PARI/DISPARI---------------");

        System.out.println("Inserisci un numero");
        int num = scan.nextInt();
        System.out.println(pariDispari(num));

        System.out.println("---------------AREA-------------------");
        System.out.println("Inserisci la lunghezza l1");
        double l1 = scan.nextDouble();
        System.out.println("Inserisci la lunghezza l2");
        double l2 = scan.nextDouble();
        System.out.println("Inserisci la lunghezza l3");
        double l3 = scan.nextDouble();
        System.out.println("L'area del triangolo e': " + areaTriangolo(l1, l2, l3));

        scan.close();
    }

    public static double perimetroRettangolo(double base, double altezza) {
        return (base + altezza) * 2;
    }

    public static int pariDispari (int num){
        return num % 2 == 0 ? 0 : 1;
    }

    public static double areaTriangolo (double l1, double l2, double l3) {
        double semiPerimeter = (l1 + l2 + l3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - l1) * (semiPerimeter - l2) * (semiPerimeter - l3));
    }
}
