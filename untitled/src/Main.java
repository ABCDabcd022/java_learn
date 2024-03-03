import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int age = 54;
        System.out.println(age);
        System.out.println("Hello world!" + age);

        byte a = 127;
        float b = 3.14f;

        char ch = 'R';
        String str = "qwerty";
        //System.out.println(str[1]); не

        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        System.out.println(word);

        int n = in.nextInt();


        char q = 'Q', w = 'W';
        System.out.println(q);
    }
}