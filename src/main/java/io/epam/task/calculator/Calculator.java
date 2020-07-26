package io.epam.task.calculator;

public class Calculator 
{
	int number1,number2;
	Calculator(int number1,int number2)
	{
		this.number1=number1;
		this.number2=number2;
	}
	int operation(int operation_of_choice)
	{
		switch(operation_of_choice)
		{
		case 1:return addition(this.number1,this.number2);
		case 2:return difference(this.number1,this.number2);
		case 3:return product(this.number1,this.number2);
		case 4:return quotient(this.number1,this.number2);
		case 5:return remainder(this.number1,this.number2);
		default:System.out.println("Invalid choice of operation");
		}
		return 0;
	}
	int addition(int m,int n)
	{
		return m+n;
	}
	int difference(int m,int n)
	{
		return m-n;
	}
	int product(int m,int n)
	{
		return m*n;
	}
	int quotient(int m,int n)
	{
		return m/n;
	}
	int remainder(int m,int n)
	{
		return m%n;
	}
}
