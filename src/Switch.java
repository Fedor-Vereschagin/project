import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a age: ");
        String age = s.nextLine();
        switch (age) {
            case "ноль":
                System.out.println("You're too young");
                break;
            case "семь":
                System.out.println("You have normal age");
                break;
            case "восемнадцать":
                System.out.println("You have old age");
                break;

        }
    }
}
