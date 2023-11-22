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

    // Create an instance of the EstateAgent class
    IEstateAgent estateAgent = new EstateAgent();

    // Initialize DecimalFormat and DecimalFormatSymbols
    DecimalFormat priceFormat = new DecimalFormat(" R #,##0.0", new DecimalFormatSymbols(Locale.US));
    DecimalFormat totalFormat = new DecimalFormat(" R #,##0", new DecimalFormatSymbols(Locale.US));

    public static void main(String[] args) {
        EstateAgentPropertySalesApplication app = new EstateAgentPropertySalesApplication();
        app.displayEstateAgentSalesReport();
    }

    public void displayEstateAgentSalesReport() {
        System.out.println("ESTATE AGENT SALES REPORT");
        System.out.println("\n\t\tJAN\t\t\tFEB\t\t\tMAR");
        System.out.println("--------------------------------------------------------------------------------");

        String[] namesOfEstateAgents = {"Joe Bloggs", "Jane Doe"};
        double[] totalSales = new double[propertySales.length];
        double[] totalCommissions = new double[propertySales.length];

        for (int j = 0; j < propertySales.length; j++) {
            System.out.printf("%-10s\t", namesOfEstateAgents[j]);
            for (int i = 0; i < propertySales[j].length; i++) {
                System.out.printf(" %s\t\t", priceFormat.format(propertySales[j][i]));
            }

            System.out.println();

            totalSales[j] = estateAgent.EstateAgentSales(propertySales[j]);
            totalCommissions[j] = estateAgent.EstateAgentCommission(totalSales[j]);
        }

        System.out.printf("\n\nTotal property sales for Joe Bloggs = %s%n", totalFormat.format(totalSales[0]));
        System.out.printf("Total property sales for Jane Doe = %s%n", totalFormat.format(totalSales[1]));

         System.out.printf("\n\nSales Commission for Joe Bloggs = R%,d%n", (int)totalCommissions[0]);
        System.out.printf("Sales Commission for Jane Doe = R%,d%n", (int)totalCommissions[1]);


        int topAgentIndex = estateAgent.TopEStateAgent(totalSales);
        System.out.println("\nTop performing estate agent: " + namesOfEstateAgents[topAgentIndex]);
    }
}
