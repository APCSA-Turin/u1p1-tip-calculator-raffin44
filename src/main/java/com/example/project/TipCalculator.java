package com.example.project;

import java.text.DecimalFormat;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      

        StringBuilder result = new StringBuilder();

        double tipamt = (percent*cost)/100;
        double totalbill = (tipamt+cost); 
        double perpersoncostbfr = (cost/people);
        double perpersontip = (tipamt/people);
        double totalcostperperson = (totalbill/people);

        DecimalFormat df = new DecimalFormat("#.00");
        String roundedTipAmount = df.format(tipamt);
        String roundedTotalBill = df.format(totalbill);
        String roundedPerPersonCostBeforeTip = df.format(perpersoncostbfr);
        String roundedPerPersonTip = df.format(perpersontip);
        String roundedTotalCostPerPerson = df.format(totalcostperperson);

    
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $"+ cost+"\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: "+ percent+ "%" + "\n");
        result.append("Total tip: $"+ roundedTipAmount+ "\n");
        result.append("Total Bill with tip: $"+ roundedTotalBill+ "\n");
        result.append("Per person cost before tip: $"+ roundedPerPersonCostBeforeTip+ "\n");
        result.append("Tip per person: $"+ roundedPerPersonTip+"\n");
        result.append("Total cost per person: $"+ roundedTotalCostPerPerson+"\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=6; 
        int percent = 25;
        double cost = 52.27;             
        
        System.out.println(calculateTip(people, percent, cost)); 
    }
 }

        
        //Scanner scan = new Scanner (System.in);

        //System.out.print("How many people are attending? ");
        //people = scan.nextInt();
        //scan.nextLine(); 

        //System.out.print("What is the price? ");
        //cost = scan.nextDouble();
        //scan.nextLine();
        
        //System.out.print("What is the percent of tip? "); 
        //percent = scan.nextInt();
        //scan.nextLine();