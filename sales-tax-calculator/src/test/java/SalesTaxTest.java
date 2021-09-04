import org.junit.Test;

import static org.junit.Assert.*;


public class SalesTaxTest {
    // Test cases for the method checkTaxExemption
    @Test
    public void checkTaxExemptionTest() {
        //fail("Not yet implemented");
        SalesTax salesTax = new SalesTax();
        assertTrue(salesTax.checkTaxExemption("Book"));
        assertTrue(salesTax.checkTaxExemption("headache pills"));
        assertTrue(salesTax.checkTaxExemption("chocolate bar"));
        assertFalse(salesTax.checkTaxExemption("perfume"));

    }

    @Test
    public void checkTaxExemptionImportedTest() {
        //fail("Not yet implemented");
        SalesTax salesTax = new SalesTax();
        assertTrue(salesTax.checkTaxExemption("Imported chocolate bar"));
        assertFalse(salesTax.checkTaxExemption("Imported Perfume"));

    }

    // Test cases for the method isImported()

    @Test
    public void isImportedTest() {
        SalesTax salesTax = new SalesTax();
        assertFalse(salesTax.isImported("Book"));
        assertFalse(salesTax.isImported("headache pills"));
        assertTrue(salesTax.isImported("Imported chocolate bar"));
        assertTrue(salesTax.isImported("imported bottle of perfume"));

    }

    // Test cases for the method roundItemprice()
    @Test
    public void roundItempriceTest() {
        SalesTax salesTax = new SalesTax();
        assertEquals(7.15,salesTax.roundItemPrice(7.125), 0.0);
        assertEquals(0.60,salesTax.roundItemPrice(0.5625), 0.0);
        assertEquals(0.85,salesTax.roundItemPrice(0.85),  0.0);
    }
    // Test cases for the method computeSalesTax()

    @Test
    public void computeSalesTaxTestSet1() {
        SalesTax salesTax = new SalesTax();
        assertEquals(12.49,salesTax.computeSalesTax("book", 12.49),  0.0);
        assertEquals(16.49,salesTax.computeSalesTax("music CD", 14.99),  0.0);
        assertEquals(0.85,salesTax.computeSalesTax("chocolate bar", 0.85),  0.0);
    }

    @Test
    public void computeSalesTaxTestSet2() {
        SalesTax salesTax = new SalesTax();
        assertEquals(10.50,salesTax.computeSalesTax("imported box of chocolates", 10.00),  0.0);
        assertEquals(54.65,salesTax.computeSalesTax("imported bottle of perfume", 47.50),  0.0);
    }

    @Test
    public void computeSalesTaxTestSet3() {
        SalesTax salesTax = new SalesTax();
        assertEquals(32.19,salesTax.computeSalesTax("imported bottle of perfume", 27.99),  0.0);
        assertEquals(20.89,salesTax.computeSalesTax("bottle of perfume",18.99),0.0);
        assertEquals(9.75,salesTax.computeSalesTax("packet of headache pills", 9.75),  0.0);
        assertEquals(11.85,salesTax.computeSalesTax("box of imported chocolates", 11.25),  0.0);

    }

}
