/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package estateagentcomissionprogram;

/**
 *
 * @author anksb
 */
public interface IEstateAgent {
    /**
     * @param priceOfProperty The price of the property.
     * @param estAgentCommission The estate agent's commission percentage.
     * @return The calculated commission.
     */
    double CalculateCommission(String priceOfProperty, String estAgentCommission);
    
    /**
     * Validate the data provided below
     * @param dataToValidate
     * @return true if the data is valid, otherwise false.
     */
    boolean ValidateData(Data dataToValidate);
}


//////////////REFERENCING/////////////////
/**
 * Farrell, J. (2019). Java programming. Australia: Cengage Learning.
*/