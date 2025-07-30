import java.util.Scanner;
public class Task2{
    public static void main(String[] args){
        //New scanner for Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your numbers (min-max): ");
        //Get min value
        int min = scanner.nextInt();
        //Get max value
        int max = scanner.nextInt();
        //Looping to print values in between
        if (min < max){
            while (min != max){
                System.out.println(min + 1);
                min = min + 1;
            }
        } 
        else {
            System.out.println("Please add a valid number range");
            return;
        }

    }
}
