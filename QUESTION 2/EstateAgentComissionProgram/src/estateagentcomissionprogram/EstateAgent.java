/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estateagentcomissionprogram;

/**
 *
 * @author anksb
 */
public class EstateAgent implements IEstateAgent {

    /**
     * 
     * Calculate the commission based on the price of the property and estate
     * agent's commission percentage.
     * @param priceOfProperty The price of the property.
     * @param agentCommission The estate agent's commission percentage.
     * @return The calculated commission.
     */
    @Override
    public double CalculateCommission(String priceOfProperty, String agentCommission) {
        double price = Double.parseDouble(priceOfProperty); //(GeeksforGeeks, 2018)
        double commissionPercentage = Double.parseDouble(agentCommission); //(GeeksforGeeks, 2018)

        return price * (commissionPercentage / 100.0);
    }

    /**
     * Validate the data provided below
     *
     * @param dataToValidate The data to be validated.
     * @return true if the data is valid, false otherwise.
     */
    @Override
    public boolean ValidateData(Data dataToValidate) {
        if (dataToValidate.getEstAgentLocation().isEmpty()
                || dataToValidate.getNameOfEstAgent().isEmpty() //(GeeksforGeeks, 2018)
                || Double.parseDouble(dataToValidate.getPriceOfProperty()) <= 0 //(GeeksforGeeks, 2018)
                || Double.parseDouble(dataToValidate.getCommissionPercentage()) <= 0) { //(GeeksforGeeks, 2018)
            return false; //If it does not meet the validation rules
        }
        return true; //If it meets the validation rules
    }

}
/////////////REFERENCING//////////
/**Farrell, J. (2019). Java programming. Australia: Cengage Learning.
 * GeeksforGeeks. (2018). Double parseDouble() method in Java with examples - GeeksforGeeks. [online] Available at: https://www.geeksforgeeks.org/double-parsedouble-method-in-java-with-examples/.
 */
