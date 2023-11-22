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

    //Calculate the total sales for an estate agent.
    @Override
    public double EstateAgentSales(double[] propertySales) {
        double totalSales = 0;
        for (double sale : propertySales) {
            totalSales += sale;
        }
        return totalSales;
    }

    //Calculate the estate agent commission based on total property sales.
    @Override
    public double EstateAgentCommission(double propertySales) {
        return propertySales * 0.02;
    }

    //Determine the index of the top-performing estate agent.
    @Override
    public int TopEstateAgent(double[] totalSales) {
        double maximumSales = 0;
        int topEstateAgentIndex = 0; ////(Farrell, 2019 pg. 355)

        for (int j = 0; j < totalSales.length; j++) {
            if (totalSales[j] > maximumSales) {
                maximumSales = totalSales[j];
                topEstateAgentIndex = j; //(Farrell, 2019 pg. 355)
            }
        }
        return topEstateAgentIndex;
    }

}

//////////////REFERENCING/////////////////
/**
 * Farrell, J. (2019). Java programming. Australia: Cengage Learning.
*/


