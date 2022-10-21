import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafea8846
 */
public class DiscountCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the amount the customer spent ");
    double receipt = input.nextDouble();
    int discount = 0;
    if (receipt < 40)
    {
        discount = 10;
    }
    else if (receipt > 40 && receipt < 80)
    {
    discount = 20;
    }
    else if (receipt > 80 && receipt < 120)
    {
    discount = 30;
    }
    else if (receipt > 120)
    {
        discount = 40;
    }
    double DiscAmount = receipt/100*discount;
    double NewTotal = receipt-DiscAmount;
    System.out.println("They will receive a " + discount + "% discount ");
    System.out.println("They will save $" + DiscAmount);
    System.out.println("The new Total is $" + NewTotal);
        
        
        }
    
}
