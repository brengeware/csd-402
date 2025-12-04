//Brennan Cheatwood
//CSD-402 - M1 Programming Assignment

import java.util.Scanner;

public class HeatWaterEnergy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//input
		System.out.print("Enter the amount of water in kilograms: ");
		double waterMass = input.nextDouble();
		
		System.out.print("Enter the initial Temperature in Celsius: ");
		double initialTemperature = input.nextDouble();
		
		System.out.print("Enter the final Temperature in Celsius: ");
		double finalTemperature = input.nextDouble();
		
		//water constant (formula)
		final double SPECIFIC_HEAT_WATER = 4184.0;
		
		//calculate energy Q
		double Q = waterMass * (finalTemperature - initialTemperature) * SPECIFIC_HEAT_WATER;
		
		//show result to user
		System.out.println("The energy needed is " + Q + " Joules.");
		
		input.close();
		
	}
}

