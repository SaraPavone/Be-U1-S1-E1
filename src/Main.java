
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------ESERCIZIO 1---------------");
        System.out.println("---------------MOLTIPLICA---------------");
        int a = 2;
        int b = 5;
        int result = moltiplica(a, b);
        System.out.println(result);

        System.out.println("---------------CONCATENA---------------");
        System.out.println(concat("Marco", 20));

        System.out.println("---------------INSERISCI IN ARRAY---------------");
        String[] arr = insertInArray(new String[]{"A", "B", "C", "D", "E"}, "aaaaa");
        System.out.println(Arrays.toString(arr));
    }

    //MOLTIPLICA
    public static int moltiplica(int a, int b) {
        return a * b;
    }

    //CONCATENA
    public static String concat(String name, int age) {
        return "Ciao, sono " + name + ", ho " + age + " anni!!";
    }

    // INSERISCI IN ARRAY
    public static String[] insertInArray(String[] arr, String str) {
        String[] arrStr = new String[6];
        arrStr[0] = arr[0];
        arrStr[1] = arr[1];
        arrStr[2] = str;
        arrStr[3] = arr[2];
        arrStr[4] = arr[3];
        arrStr[5] = arr[4];
        return arrStr;
    }
}







