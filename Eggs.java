/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpl3a;

/**File name: Eggs.java
 * Purpose: Display price of eggs by the dozen and single.
 * @author emre kaan batir
 */
import java.util.Scanner;//user import
import java.text.DecimalFormat;// to format dollar amount
public class Eggs {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double CostPerEgg = 0.45;// single egg price
        final double CostPerDozen = 3.25;// dozen egg price
        final int EggsPerDozen = 12; //eggs in a dozen
        int NumEggs;// number of total eggs
        int NumDozen;// number of dozens
        int NumSingleEggs;// num of single eggs that are left that cant be dozen
        double Total;// total price
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        

        
        System.out.println("Welcome to Springdale farms! We sell organic " +
                "Fresh eggs! ");
        System.out.println("Each egg is $0.45, however, if each dozen you buy "
                + "is $3.25. What an amazing deal, right!");
        //user prompt
        System.out.println("So how many eggs would you like?");
        NumEggs = scan.nextInt();
        NumDozen = NumEggs / EggsPerDozen;
        NumSingleEggs = NumEggs % EggsPerDozen;
        Total = (CostPerEgg * NumSingleEggs) + (CostPerDozen * NumDozen);
        
        System.out.println("So you chose to get " + NumDozen + " Dozens of " +
                "Eggs and " + NumSingleEggs + " single eggs.");
        System.out.println("Your total is $" + df.format(Total));
        
        
    }
    
}
