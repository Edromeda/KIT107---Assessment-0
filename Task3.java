import java.util.Scanner;
public class Task3{
    
    public static void main(String[] args){

        //variables
        float[] choices = new float[10];
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        float sum = 0f;

        //while loop to store user floats
        while (i <10){
            System.out.println("Please enter a float: ");
            float input = scanner.nextFloat();
            if (input == -1.0) {
                break;
            } else {
                choices[i] = input;
                    i++;
            }
        }

         for (int e = 0; e < i; e++) {
            sum += choices[e];
         }
         System.out.println("The total is: " + sum);
    }
}