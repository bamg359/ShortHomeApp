package app.service.validations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FormTypeValidator {


    static Scanner sc = new Scanner(System.in);


    public static int intValidator(String prompt){
        while(true){
            try{

                System.out.println(prompt);
                int value = sc.nextInt();
                sc.nextLine();
                return  value;

            }catch (InputMismatchException e){
                System.out.println("Solo se adminten numeros enteros" + e);
            }
        }
    }

    public static double doubleValidator(String prompt){
        while(true){
            try{

                System.out.println(prompt);
                double value = sc.nextDouble();
                sc.nextLine();
                return  value;

            }catch (InputMismatchException e){
                System.out.println("Solo se adminten numeros decimales" + e);
            }
        }
    }

    public static float floatValidator(String prompt){
        while(true){
            try{

                System.out.println(prompt);
                float value = sc.nextFloat();
                sc.nextLine();
                return  value;

            }catch (InputMismatchException e){
                System.out.println("Solo se adminten numeros decimales" + e);
            }
        }
    }




    public static String stringValidator(String prompt){


            while( true){
            System.out.println(prompt);


            String value = sc.nextLine().trim();

            if (value.isEmpty()) {
                return value;
            }
                System.out.println( "El valor no puede estar vacio ");
        }
    }
}
