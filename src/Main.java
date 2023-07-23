import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char value = scanner.nextLine().charAt(0);
        int result = metod(s, value);
        System.out.println(result);
    }
    static int metod (String str, char simbol) {
        char[] variables = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < variables.length; i++) {
            if (simbol == variables[i]) {
                counter +=1;
            }
        }
        return counter;
    }
}