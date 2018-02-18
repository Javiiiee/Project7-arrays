import java.util.InputMismatchException;
import java.util.Scanner;

public class AnalizingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of numbers in the list");

        //initializing Array
        Boolean initializerCheck = false;
        int n = 100;
        while (!initializerCheck) {
            try {
                n = sc.nextInt();
                initializerCheck = true;

            } catch (InputMismatchException e) {
                System.out.println("Input must be an integer");
                initializerCheck = false;
                sc.nextLine();
            }
        }
        double[] numbers = new double[n];
        double sum = 0;
        Boolean indexChecker;

        //Filling array with numbers
        for (int i=0;(i < n); i++){
            indexChecker = false;
            while (!indexChecker){
                try {
                    System.out.println("Enter numbers to add");
                    numbers[i] = sc.nextDouble();
                    sum += numbers[i];
                    indexChecker = true;

                } catch(InputMismatchException e){
                    System.out.println("Input must be a number");
                    indexChecker = false;
                    sc.nextLine();
                }
            }
        }
        double average = (sum /n);
        int count = 0;

        for (int i = 0; i < n; i++){
            if (numbers[i] > average){
                count++;
            }else{
                count=0;
            }
        }
        System.out.println("Array Lenght: "+numbers.length);
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+ average);
        System.out.println("Numbers above average: "+count);
        }
    }