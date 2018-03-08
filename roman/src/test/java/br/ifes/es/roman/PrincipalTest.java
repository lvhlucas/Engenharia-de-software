/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.es.roman;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20131bsi0246
 */
public class PrincipalTest {
    private Principal instance;
    public PrincipalTest() {
    }
    
    
    @Before
    public void setUp() {
        instance=new Principal();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcular method, of class Principal.
     */
    @Test
    public void converterI() {       
        int expResult = 1;
        int result = instance.calcular("I");        
        assertEquals(expResult, result);
        
    }
    @Test
    public void converterII() {       
        int expResult = 2;
        int result = instance.calcular("II");
        assertEquals(expResult, result);        
    }
    @Test
    public void converterIV() {       
        int expResult = 4;
        int result = instance.calcular("IV");
        assertEquals(expResult, result);        
    }
    
}
