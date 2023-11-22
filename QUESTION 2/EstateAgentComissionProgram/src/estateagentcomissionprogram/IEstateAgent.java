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
    double CalculateCommission(String priceOfProperty, String estAgentCommission);
    boolean ValidateData(Data dataToValidate);
}
