/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estateagentsalesreport;

/**
 *
 * @author anksb
 */
public interface IEstateAgent {
    /**
     * Calculate the total sales for an estate agent.
     * @param propertySales representing property sales for each month.
     * @return total sales for the estate agent.
     */
    double EstateAgentSales(double[] propertySales);
     
    /**
     * Calculate the estate agent commission based on total property sales.
     * @param propertySales total property sales for the estate agent.
     * @return calculated estate agent commission.
     */
    double EstateAgentCommission(double propertySales);
    
    /**
     * Determine the index of the top-performing estate agent.
     * @param totalSales representing total sales for each estate agent.
     * @return index of the top-performing estate agent.
     */
    int TopEstateAgent(double[] totalSales);
    
}
//////////////REFERENCING/////////////////
/**
 * Farrell, J. (2019). Java programming. Australia: Cengage Learning.
*/