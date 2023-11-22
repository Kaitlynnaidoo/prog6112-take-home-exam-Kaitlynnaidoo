
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;

public class EstateAgentTest {

    @BeforeAll
    public static void setUpClass() {
        
    }

    @AfterAll
    public static void tearDownClass() {
        
    }

    @BeforeEach
    public void setUp() {
        
    }

    @AfterEach
    public void tearDown() {
       
    }

    @Test
    public void testCalculateTotalSales() {
        
        double[][] propertySales = {
            {800000, 1500000, 2000000},  // Joe Bloggs
            {700000, 1200000, 1600000}   // Jane Doe
        };

        EstateAgent estateAgent = new EstateAgent();

        assertEquals(4300000, estateAgent.EstateAgentSales(propertySales[0]), 0.01);
        assertEquals(3500000, estateAgent.EstateAgentSales(propertySales[1]), 0.01);
    }

    @Test
    public void testCalculateTotalCommission() {
        
        EstateAgent estateAgent = new EstateAgent();

        assertEquals(86000, estateAgent.EstateAgentCommission(4300000), 0.01);
        assertEquals(70000, estateAgent.EstateAgentCommission(3500000), 0.01);
    }

    @Test
    public void testTopAgent() {
        
        double[][] propertySales = {
            {800000, 1500000, 2000000},  // Joe Bloggs
            {700000, 1200000, 1600000}   // Jane Doe
        };

        EstateAgent estateAgent = new EstateAgent();

        assertEquals(1, estateAgent.TopEstateAgent(new double[]{estateAgent.EstateAgentSales(propertySales[0]),
                                                                estateAgent.EstateAgentSales(propertySales[1])}));
    }
}
