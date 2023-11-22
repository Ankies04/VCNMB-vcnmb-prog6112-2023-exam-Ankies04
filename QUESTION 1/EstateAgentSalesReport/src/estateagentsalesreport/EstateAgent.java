/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estateagentsalesreport;

/**
 *
 * @author anksb
 */
public class EstateAgent implements IEstateAgent {
    

    @Override
    public double EstateAgentSales(double[] propertySales) {
       double totalSales = 0;
       for (double sale : propertySales) {
           totalSales += sale;
        }
       return totalSales;
    }

    @Override
    public double EstateAgentCommission(double propertySales) {
     return propertySales * 0.02;   
    }

    @Override
    public int TopEStateAgent(double[] totalSales) {
        double maximumSales = 0;
        int topEstateAgentIndex = 0;
        
        for (int j = 0; j < totalSales.length; j++) {
            if (totalSales[j] > maximumSales) {
                maximumSales = totalSales[j];
                topEstateAgentIndex = j;
            }
    }
        return topEstateAgentIndex;
    }
    



}
       



   
    

