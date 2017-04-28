import fakturowniaAPI.*;
import fakturowniaAPI.Period;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by Adam on 18.04.2017.
 */
public class Main {

    public static void main(String[] args){
        FakturowniaClient client = new FakturowniaClient("5JCdT11J5iqzJ0E6f16I/awpraktyka");

        try {
            List<Invoice> list = client.getInvoices(Period.THIS_MONTH);

            LocalDate dateto = LocalDate.now();
            LocalDate datefrom = LocalDate.now().minusMonths(2);
            List<Invoice> list2 = client.getInvoices(datefrom,dateto);

            InvoiceSummary summary= client.getSummary(Period.THIS_MONTH);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
