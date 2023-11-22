/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package estateagentsalesreport;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anksb
 */
public class EstateAgentTest {
    
   
    /**
     * Test of calculateTotalSales_ReturnsTotalSales method, of class EstateAgent.
     */
    @Test
    public void calculateTotalSales_ReturnsTotalSales() {
        System.out.println("    The correct total sales value is returned from the estate agent sales method ");
        double[] propertySales = {800000.0, 1500000.0, 2000000.0};
        EstateAgent estateAgent = new EstateAgent();
        double totalSales = estateAgent.EstateAgentSales(propertySales);;
        
        assertEquals(4300000.0, totalSales, 0.01);   
    }

    /**
     * Test of CalculateTotalCommission_ReturnsCommission() method, of class EstateAgent.
     */
    @Test
    public void calculateTotalCommission_ReturnsCommission() {
        System.out.println("The correct estate agent commission has been calculated.");
        double[] propertySales = {800000.0, 1500000.0, 2000000.0};
        EstateAgent estateAgent = new EstateAgent();
        double totalSales = estateAgent.EstateAgentSales(propertySales);
       
        assertEquals("Total sales calculation is incorrect", 4300000.0, totalSales, 0);
        
    }

    /**
     * Test of TopAgent_ReturnsTopPosition() method, of class EstateAgent.
     */
    @Test
    public void TopAgent_ReturnsTopPosition() {
        System.out.println("This test returns the top selling total property sales for the estate agent");
        double[] totalSales = {4300000.0, 3500000.0};
        EstateAgent estateAgent = new EstateAgent();
        int topAgentIndex  = estateAgent.TopEStateAgent(totalSales);
        
        assertEquals(0, topAgentIndex);
        
    }
    
}
