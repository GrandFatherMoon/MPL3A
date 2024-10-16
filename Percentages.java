/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpl3a;

/**File name:Percentages.java
 *Purpose: Takes two double numbers from user and displays percentages of each 
 * other via method outside of main
 * @author emre kaan batir
 */
import java.util.Scanner;//user prompt

public class Percentages {
    public static void main(String[] args)
    {
        double perc1;
        double perc2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me two numbers and I will give you what" +
                " percentage they are of each other.");
        
        perc1 = scan.nextDouble();//user input
        perc2 = scan.nextDouble();
        
        computePercent(perc1, perc2);//method call
        computePercent(perc2, perc1);
    }
    
    public static void computePercent(double num1, double num2)//method display
    {
        System.out.println(num1 + " is " + 100*(num1 / num2) + "% of " + num2);
    }
}
