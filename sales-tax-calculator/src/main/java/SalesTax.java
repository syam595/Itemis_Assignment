import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.math.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SalesTax {
    public SalesTax() {
        // TODO Auto-generated constructor stub
    }

    void readItemDetails() throws IOException {
        List<String> itemInfo = new ArrayList();
        System.out.println("Enter the number of items");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        double[] priceList = new double[n];
        String[] quantity = new String[n];
        String[] item = new String[n];
        double[] salesTax = new double[n];
        System.out.println("Enter the item details");
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            itemInfo.add(temp);
        }
        for (int j = 0; j < itemInfo.size(); j++) {
            String[] temp = itemInfo.get(j).split(" at ", 0);
            priceList[j] = Double.parseDouble(temp[1]);
            String[] temp2 = temp[0].split(" ", 2);
            quantity[j] = temp2[0];
            item[j] = temp2[1];
            salesTax[j] = computeSalesTax(item[j], priceList[j]);
        }


    }

    double computeSalesTax(String item, double price) {
        double salesTaxCut = 0.10;
        double salesTaxImportedCut = 0.05;
        double salesTax;
        boolean isImported = isImported(item);
        if (isImported) {
            if (checkTaxExemption(item)) {
                salesTaxCut = salesTaxImportedCut;

            } else {
                salesTaxCut = salesTaxCut + salesTaxImportedCut;


            }
        } else {
            if (checkTaxExemption(item)) {

                salesTaxCut = 0.0;
            }
        }
        salesTax = salesTaxCut * price;

        BigDecimal temp = new BigDecimal((roundItemPrice(salesTax)) + price);
        return temp.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    boolean checkTaxExemption(String item) {
        Set<String> taxExemptedItems = new HashSet<String>();
        taxExemptedItems.add("book");
        taxExemptedItems.add("chocolate");
        taxExemptedItems.add("headache pills");
        for (String a : taxExemptedItems) {
            if (item.toLowerCase().contains(a.toLowerCase())) {
                return true;
            }
        }
        return false;

    }

    boolean isImported(String item) {
        String keyword = "imported";
        if (item.toLowerCase().contains(keyword.toLowerCase())) {
            return true;
        }
        return false;
    }

    double roundItemPrice(double price) {
        BigDecimal bPrice = new BigDecimal(price);
        BigDecimal step = new BigDecimal(0.05);
        return bPrice.divide(step, 0, RoundingMode.UP).multiply(step).setScale(2, RoundingMode.HALF_UP).doubleValue();

    }

    void printReciept() {

    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        SalesTax salesTax = new SalesTax();
        salesTax.readItemDetails();

    }

}
