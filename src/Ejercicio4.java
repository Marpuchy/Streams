import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = " ";
        ArrayList<String> lista = new ArrayList<>();
        while (!cadena.isEmpty()) {
            cadena = scanner.nextLine();
            lista.add(cadena);
        }
        lista.stream()
                .forEach(list -> System.out.println(list));
    }
}
