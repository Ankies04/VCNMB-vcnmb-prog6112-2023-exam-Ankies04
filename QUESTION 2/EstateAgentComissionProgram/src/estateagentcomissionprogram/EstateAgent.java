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

    @Override
    public double CalculateCommission(String priceOfProperty, String agentCommission) {
        double price = Double.parseDouble(priceOfProperty);
        double commissionPercentage = Double.parseDouble(agentCommission);

        return price * (commissionPercentage / 100.0);
    }
    
    @Override
     public boolean ValidateData(Data dataToValidate) {
        if (dataToValidate.getEstAgentLocation().isEmpty() ||
            dataToValidate.getNameOfEstAgent().isEmpty() ||
            Double.parseDouble(dataToValidate.getPriceOfProperty()) <= 0 ||
            Double.parseDouble(dataToValidate.getCommissionPercentage()) <= 0) {
            return false;
        }
        return true;
    }

    double calculateCommission(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
  
