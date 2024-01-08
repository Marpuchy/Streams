import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int num = 0;
        while (num >= 0) {
            num = scanner.nextInt();
            if (num >= 0) {
                nums.add(num);
            }
        }
        nums.stream().filter(numero -> numero > 1).filter(numero -> numero<5).forEach(numero -> System.out.println(numero));
    }
}
