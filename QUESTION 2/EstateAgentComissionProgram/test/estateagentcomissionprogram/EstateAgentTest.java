/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package estateagentcomissionprogram;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anksb
 */
public class EstateAgentTest {
    
    /**
     * Test of calculateCommission_CalculatedSuccessfully method, of class EstateAgent.
     */
    @Test
    public void testCalculateCommission_CalculatedSuccessfully() {
        System.out.println("the correct commission value is returned.");
        EstateAgent estateAgent = new EstateAgent();
        double result = estateAgent.CalculateCommission("100000", "5");
        assertEquals(5000, result, 0.001);
       
    
    }
    /**
     * Test of CalculateCommission_CalculatedUnSuccessfully() method, of class EstateAgent.
     */
    @Test
    public void testValidateData_isLocationValid() {
        System.out.println("There is a calculation error. Please try again.");
        EstateAgent estateAgent = new EstateAgent();
        Data validData = new Data("Cape Town", "ValidName", "1000000", "5");
        assertTrue(estateAgent.ValidateData(validData));
    }
}

