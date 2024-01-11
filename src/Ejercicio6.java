import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String persona = " ";
        ArrayList<Person> personas = new ArrayList<>();
        while (!persona.isEmpty()) {
            persona = scanner.nextLine();
            if (persona.isEmpty()) {
                break;
            }
            String[] cadenanombre = persona.split(" ");
            String nombre = cadenanombre[0];
            String apellido = cadenanombre[1];
            int nacimiento = parseInt(cadenanombre[2]);
            Person nuevapersona = new Person(nombre, apellido, nacimiento);
            personas.add(nuevapersona);
        }
        personas.stream().map(person -> person.getLastName()).sorted().distinct().forEach(person -> System.out.println(person));
    }
}
