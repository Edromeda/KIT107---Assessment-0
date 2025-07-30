public class Task1 {
    public static void main(String[] args) {
        //Variables
        String val1 = "A";
        String val2 = "$";
        String proxy;
        System.out.println("Their default value is:");
        System.out.println("Value 1: " + val1);
        System.out.println("Value 2: " + val2);

        //Switch
        proxy = val1;
        val1 = val2;
        val2 = proxy;
        System.out.println("Their value after switch:");
        System.out.println("Value 1: " + val1);
        System.out.println("Value 2: " + val2);
    }
}