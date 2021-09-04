import org.junit.Test;
import static org.junit.Assert.*;


public class SalesTaxTest {
    // Test cases for the method checkTaxExemption
    @Test
    public void checkTaxExemptionTest() {
        //fail("Not yet implemented");
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.checkTaxExemption("Book"),true);
        assertEquals(salesTax.checkTaxExemption("headache pills"),true);
        assertEquals(salesTax.checkTaxExemption("chocolate bar"),true);
        assertEquals(salesTax.checkTaxExemption("perfume"),false);

    }
    @Test
    public void checkTaxExemptionImportedTest() {
        //fail("Not yet implemented");
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.checkTaxExemption("Imported chocolate bar"),true);
        assertEquals(salesTax.checkTaxExemption("Imported Perfume"),false);

    }

    // Test cases for the method isImported()

    @Test
    public void testcase3() {
        //fail("Not yet implemented");
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.isImported("Book"),false);
        assertEquals(salesTax.isImported("headache pills"),false);
        assertEquals(salesTax.isImported("Imported chocolate bar"),true);
        assertEquals(salesTax.isImported("imported bottle of perfume"),true);

    }

    // Test cases for the method roundItemprice()
    @Test
    public void roundItempriceTest() {
        //fail("Not yet implemented");
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.roundItemPrice(7.125),7.15,0.0);
        assertEquals(salesTax.roundItemPrice(0.5625),0.60,0.0);
        assertEquals(salesTax.roundItemPrice(0.85),0.85,0.0);
    }
    // Test cases for the method computeSalesTax()

    @Test
    public void computeSalesTaxTestSet1() {
        //fail("Not yet implemented");
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.computeSalesTax("book",12.49),12.49,0.0);
        assertEquals(salesTax.computeSalesTax("music CD",14.99),16.49,0.0);
        assertEquals(salesTax.computeSalesTax("chocolate bar",0.85),0.85,0.0);
    }

    @Test
    public void computeSalesTaxTestSet2() {
        //fail("Not yet implemented");
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.computeSalesTax("imported box of chocolates",10.00),10.50,0.0);
        assertEquals(salesTax.computeSalesTax("imported bottle of perfume",47.50),54.65,0.0);
    }

    @Test
    public void computeSalesTaxTestSet3() {
        //fail("Not yet implemented");
        SalesTax salesTax = new SalesTax();
        assertEquals(salesTax.computeSalesTax("imported bottle of perfume",27.99),32.19,0.0);
        assertEquals(salesTax.computeSalesTax("bottle of perfume",18.99),20.89,0.0);
        assertEquals(salesTax.computeSalesTax("packet of headache pills",9.75),9.75,0.0);
        assertEquals(salesTax.computeSalesTax("box of i mported chocolates",11.25),11.85,0.0);

    }

}
