/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estateagentsalesreport;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author anksb
 */


public class EstateAgentPropertySalesApplication {
    // Two-dimensional array to store the property sales for two different agents
    double[][] propertySales = {{800000.0, 1500000.0, 2000000.0}, {700000.0, 1200000.0, 1600000.0}};

    //An instance of the EstateAgent class
    IEstateAgent estateAgent = new EstateAgent();

    // Initialization of DecimalFormat and DecimalFormatSymbols
    DecimalFormat priceFormat = new DecimalFormat(" R #,##0.0", new DecimalFormatSymbols(Locale.US)); //(Farrell, 2019 pg 818-819)
    DecimalFormat totalFormat = new DecimalFormat(" R #,##0", new DecimalFormatSymbols(Locale.US)); //(Farrell, 2019 pg 818-819)

    //Main method to run this application
    public static void main(String[] args) {
        EstateAgentPropertySalesApplication app = new EstateAgentPropertySalesApplication();
        app.displayEstateAgentSalesReport();
    }

    // Display the estate agent sales report
    public void displayEstateAgentSalesReport() {
        System.out.println("ESTATE AGENT SALES REPORT");
        System.out.println("\n\t\tJAN\t\t\tFEB\t\t\tMAR");
        System.out.println("--------------------------------------------------------------------------------");

        // Names of the estate agents
        String[] namesOfEstateAgents = {"Joe Bloggs", "Jane Doe"};
        double[] totalSales = new double[propertySales.length];
        double[] totalCommissions = new double[propertySales.length];

        // A for loop through each estate agent
        for (int j = 0; j < propertySales.length; j++) {
            System.out.printf("%-10s\t", namesOfEstateAgents[j]); ////(Farrell, 2019 pg. 818-819)
            for (int i = 0; i < propertySales[j].length; i++) { //Loop through every month , //(Farrell, 2019 pg. 818-819)
                System.out.printf(" R %.1f\t\t", propertySales[j][i]); ////(Farrell, 2019 pg. 815)
            }

            System.out.println();
            
             // Calculate total sales and total commissions for the estate agent
            totalSales[j] = estateAgent.EstateAgentSales(propertySales[j]); 
            totalCommissions[j] = estateAgent.EstateAgentCommission(totalSales[j]);
        }
        
        // Display total property sales each estate agent
        System.out.printf("\n\nTotal property sales for Joe Bloggs = %s%n", totalFormat.format(totalSales[0])); //(Farrell, 2019 pg. 815)
        System.out.printf("Total property sales for Jane Doe = %s%n", totalFormat.format(totalSales[1])); //(Farrell, 2019 pg. 815)
        
        // Display sales commission for each estate agent
        System.out.printf("\n\nSales Commission for Joe Bloggs = %s%n", totalFormat.format(totalCommissions[0])); //(Farrell, 2019 pg. 815)
        System.out.printf("Sales Commission for Jane Doe = %s%n", totalFormat.format(totalCommissions[1])); //(Farrell, 2019 pg. 815)

        // Determine and display the top-performing estate agent
        int topAgentIndex = estateAgent.TopEstateAgent(totalSales);
        System.out.println("\nTop performing estate agent: " + namesOfEstateAgents[topAgentIndex]);
    }
}

//////////////REFERENCING/////////////////
/**
 * Farrell, J. (2019). Java programming. Australia: Cengage Learning.
*/
