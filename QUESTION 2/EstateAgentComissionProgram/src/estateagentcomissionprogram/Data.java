/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estateagentcomissionprogram;

/**
 *
 * @author anksb
 */
public class Data {

    private final String estAgentLocation;
    private final String nameOfEstAgent;
    private final String priceOfProperty;
    private final String commissionPercentage;

    public Data(String estAgentLocation, String nameOfEstAgent, String priceOfProperty, String commissionPercentage) {
        this.estAgentLocation = estAgentLocation;
        this.nameOfEstAgent = nameOfEstAgent;
        this.priceOfProperty = priceOfProperty;
        this.commissionPercentage = commissionPercentage;
    }

    /**
     * @return the estAgentLocation
     */
    public String getEstAgentLocation() {
        return estAgentLocation;
    }

    /**
     * @return the nameOfEstAgent
     */
    public String getNameOfEstAgent() {
        return nameOfEstAgent;
    }

    /**
     * @return the priceOfProperty
     */
    public String getPriceOfProperty() {
        return priceOfProperty;
    }

    /**
     * @return the commissionPercentage
     */
    public String getCommissionPercentage() {
        return commissionPercentage;
    }

}
