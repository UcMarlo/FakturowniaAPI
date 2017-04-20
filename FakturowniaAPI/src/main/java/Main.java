import fakturowniaAPI.FakturowniaClient;
import fakturowniaAPI.InvalidArgumentException;
import fakturowniaAPI.Invoice;
import fakturowniaAPI.InvoiceSummary;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by Adam on 18.04.2017.
 */
public class Main {

    public static void main(String[] args){
        Date from = new Date();
        from.setDate(1);
        Date to = new Date();
        try {
            List<Invoice> invoices = FakturowniaClient.getInvoices("5JCdT11J5iqzJ0E6f16I/awpraktyka", "this_month");
            for (int i=0; i < invoices.size();i++){
                System.out.println(invoices.get(i).getBuyerName());
                System.out.println(invoices.get(i).getPriceNet());
                System.out.println(invoices.get(i).getPriceGross());
                System.out.println(invoices.get(i).getPriceTax());
                System.out.println(invoices.get(i).getCurrency());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }

        try {
            InvoiceSummary summary = FakturowniaClient.getSummary("5JCdT11J5iqzJ0E6f16I/awpraktyka", "this_month");
            System.out.println(summary.getPriceGross());
            System.out.println(summary.getPriceGrossPerDay());
            System.out.println(summary.getPriceNet());
            System.out.println(summary.getPriceNetPerDay());
            System.out.println(summary.getPriceTax());
            System.out.println(summary.getPriceTaxPerDay());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
    }
}
