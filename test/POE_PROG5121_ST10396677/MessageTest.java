/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package POE_PROG5121_ST10396677;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;

/**
 *
 * @author lab_services_student
 */
public class MessageTest {
    Message message = new Message();
    
    public MessageTest() {
    }

    @Test
    public void testSomeMethod() {
        String expected ="I have arrived";
        String actual = message.getMessage();
        
        
       assertEquals(expected,actual);
    }
    
}
