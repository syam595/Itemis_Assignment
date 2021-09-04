import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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
        double [] priceList = new double[n];
        String [] quantity = new String[n];
        System.out.println("Enter the item details");
        for (int i =0;i<n;i++)
        {
            String temp= br.readLine();
            itemInfo.add(temp);
        }
        for (int j=0; j<itemInfo.size(); j++)
        {
           String [] temp=   itemInfo.get(j).split(" at ",0);
           priceList[j]= Double.parseDouble(temp[1]);
           quantity[j]=itemInfo.get(j).substring(0, itemInfo.get(j).indexOf(' ')).trim();
        }
        for(int k=0; k<priceList.length; k++)
        {
            System.out.println(priceList[k]);
            System.out.println(quantity[k]);
        }

        //while(itemPrice.length()>0)



    }
    int computeSalesTax(String item, double price, boolean importflag)
    {
        return 0;
    }
    void checkTaxExemption()
    {

    }
    void printReciept()
    {

    }
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        SalesTax salesTax = new SalesTax();
        salesTax.readItemDetails();

    }

}
