import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sumaposynegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        List<String> numeros = new ArrayList<>(Arrays.asList(nums));

        Long positivos = numeros.stream()
                .mapToInt(Integer::valueOf)
                .filter(numero -> numero>0)
                .count();
        Long negativos = numeros.stream()
                .mapToInt(Integer::valueOf)
                .filter(numero -> numero<0)
                .count();
    }
}
