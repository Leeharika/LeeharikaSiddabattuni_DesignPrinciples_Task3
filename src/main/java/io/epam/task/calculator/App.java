package io.epam.task.calculator;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        int number1,number2;
        int operation_of_choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1=sc.nextInt();
        System.out.println("Enter the second number:");
        number2=sc.nextInt();
        System.out.println("Choose the operation that you want to perform on the two numbers:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division(gives the quotient of two numbers)\n5.Modulo(gives the remainder of two numbers)");
        operation_of_choice=sc.nextInt();
        Calculator obj=new Calculator(number1,number2);
        System.out.println("Result ="+ " " +obj.operation(operation_of_choice));
        sc.close();
    }
}