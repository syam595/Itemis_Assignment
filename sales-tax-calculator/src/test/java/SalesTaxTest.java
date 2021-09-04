import org.junit.Test;
import static org.junit.Assert.*;


public class SalesTaxTest {
    // Test cases for the method checkTaxExemption
    @Test
    public void testcase1() {
        //fail("Not yet implemented");
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.checkTaxExemption("Book"),true);
        assertEquals(salesTax.checkTaxExemption("headache pills"),true);
        assertEquals(salesTax.checkTaxExemption("chocolate bar"),true);
        assertEquals(salesTax.checkTaxExemption("perfume"),false);

    }
    @Test
    public void testcase2() {
        //fail("Not yet implemented");
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.checkTaxExemption("Imported chocolate bar"),true);
        assertEquals(salesTax.checkTaxExemption("Imported Perfume"),false);

    }

     /*
    @Test

    public void testcase1() {
        //fail("Not yet implemented");
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.computeSalesTax("Book",12.49,false),12.49,0.0);
        assertEquals(salesTax.computeSalesTax("Music CD",14.99,false),16.49,0.0);
        assertEquals(salesTax.computeSalesTax("Chocolate bar",0.85,false),0.85,0.0);
    }

    @Test
    public void testcase2() {
        //fail("Not yet implemented");
        SalesTax salesTax = new SalesTax();
        //assertEquals(salesTax.computeSalesTax("Box of Chocolate",10.00,true),10.50,0.0);
        //assertEquals(salesTax.computeSalesTax("Bottle of Perfume",47.50,true),54.65,0.0);
    }

    @Test
    public void testcase3() {
        //fail("Not yet implemented");
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.computeSalesTax("Bottle of Perfume",27.99,true),32.19,0.0);
        assertEquals(salesTax.computeSalesTax("Bottle of Perfume",18.99,false),20.89,0.0);
        assertEquals(salesTax.computeSalesTax("Packet of Headache Pills",9.75,true),9.75,0.0);
        assertEquals(salesTax.computeSalesTax("Box of Chocolate",11.25,true),11.85,0.0);

    }*/

}
