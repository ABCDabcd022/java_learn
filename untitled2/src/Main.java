public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        funс();
        funс1("qwe");

        Transport bmw = new Transport();
        bmw.color = "w";
        bmw.coordinate = new byte[] {0,0,0};
        bmw.set(100);

    }

    public static void funс()
    {
        System.out.println("funс");
    }

    public static void funс1(String word)
    {
        System.out.println(word);
    }
}