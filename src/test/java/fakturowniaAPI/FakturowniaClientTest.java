package fakturowniaAPI;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;
import static org.junit.Assert.*;

/**
 * Created by Adam on 20.04.2017.
 */
public class FakturowniaClientTest {

    private final FakturowniaClient client = new FakturowniaClient("5JCdT11J5iqzJ0E6f16I/awpraktyka");

    private static String getJSON(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();

        return response.body().string();
    }

    private static List<Invoice> pharseJSON(String json){
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Invoice>>(){}.getType();
        List<Invoice> invoiceList = gson.fromJson(json, listType);
        return invoiceList;
    }

    @org.junit.Test
    public void getSummaryThisYear() throws  Exception{
        boolean finite;
        InvoiceSummary summary;
        summary = client.getSummary(Period.THIS_YEAR);
        finite = Double.isFinite(summary.getPriceGrossPerDay());
        assertTrue(finite);
    }

    @org.junit.Test
    public void getSummaryThisMonth() throws  Exception{
        boolean finite;
        InvoiceSummary summary;
        summary = client.getSummary(Period.THIS_MONTH);
        finite = Double.isFinite(summary.getPriceGrossPerDay());
        assertTrue(finite);
    }

    @org.junit.Test
    public void getSummaryLastYear() throws  Exception{
        InvoiceSummary summary;
        long commonYearDays = 365;
        long leapYearDays = 366;
        summary = client.getSummary(Period.LAST_YEAR);
        long currentDays = summary.getDaysPassed();

        if (!((currentDays == commonYearDays) || (currentDays==leapYearDays))){
            fail();
        }

    }

    @org.junit.Test
    public void getSummaryLastMonth() throws  Exception{
        boolean finite;
        InvoiceSummary summary;
        summary = client.getSummary(Period.LAST_MONTH);
        finite = Double.isFinite(summary.getPriceGrossPerDay());
        assertTrue(finite);
    }

    @org.junit.Test
    public void getSummaryByDate1() throws  Exception{
        InvoiceSummary summary;
        long expected;
        LocalDate dateFrom = LocalDate.now().minusMonths(1);
        LocalDate dateTo = LocalDate.now();
        summary = client.getSummary(dateFrom,dateTo);
        expected = DAYS.between(dateFrom,dateTo);
        assertEquals(summary.getDaysPassed(),expected);
    }


    @org.junit.Test
    public void getSummaryALL() throws  Exception{


        boolean finite;
        InvoiceSummary summary;
        summary = client.getSummary(Period.ALL);
        finite = Double.isFinite(summary.getPriceGrossPerDay());
        assertFalse(finite);
        finite = Double.isFinite(summary.getPriceNetPerDay());
        assertFalse(finite);
        finite = Double.isFinite(summary.getPriceTaxPerDay());
        assertFalse(finite);

    }


    //region getInvoices TEST
    @org.junit.Test
    public void getInvoicesThisMonth() throws Exception {
        List<Invoice> actual;
        List<Invoice> expected;
        String json;

        actual = client.getInvoices(Period.THIS_MONTH);;
        json = getJSON("https://awpraktyka.fakturownia.pl/invoices.json?period=this_month&api_token=5JCdT11J5iqzJ0E6f16I/awpraktyka");
        expected = pharseJSON(json);

        for (int i=0 ;i <expected.size();i++){
            assertEquals(actual.get(i).toString(),expected.get(i).toString());
        }
    }

    @org.junit.Test
    public void getInvoicesLastMonth() throws Exception {
        List<Invoice> actual;
        List<Invoice> expected;
        String json;

        actual = client.getInvoices(Period.LAST_MONTH);
        json = getJSON("https://awpraktyka.fakturownia.pl/invoices.json?period=last_month&api_token=5JCdT11J5iqzJ0E6f16I/awpraktyka");
        expected = pharseJSON(json);

        for (int i=0 ;i <expected.size();i++){
            assertEquals(actual.get(i).toString(),expected.get(i).toString());
        }
    }

    @org.junit.Test
    public void getInvoicesThisYear() throws Exception {
        List<Invoice> actual;
        List<Invoice> expected;
        String json;

        actual = client.getInvoices(Period.THIS_YEAR);
        json = getJSON("https://awpraktyka.fakturownia.pl/invoices.json?period=this_year&api_token=5JCdT11J5iqzJ0E6f16I/awpraktyka");
        expected = pharseJSON(json);

        for (int i=0 ;i <expected.size();i++){
            assertEquals(actual.get(i).toString(),expected.get(i).toString());
        }
    }

    @org.junit.Test
    public void getInvoicesLastYear() throws Exception {
        List<Invoice> actual;
        List<Invoice> expected;
        String json;

        actual = client.getInvoices(Period.LAST_YEAR);
        json = getJSON("https://awpraktyka.fakturownia.pl/invoices.json?period=last_year&api_token=5JCdT11J5iqzJ0E6f16I/awpraktyka");
        expected = pharseJSON(json);

        for (int i=0 ;i <expected.size();i++){
            assertEquals(actual.get(i).toString(),expected.get(i).toString());
        }
    }


    @org.junit.Test
    public void getInvoicesALL() throws Exception {
        List<Invoice> actual;
        List<Invoice> expected;
        String json;

        actual = client.getInvoices(Period.ALL);;
        json = getJSON("https://awpraktyka.fakturownia.pl/invoices.json?period=all&api_token=5JCdT11J5iqzJ0E6f16I/awpraktyka");
        expected = pharseJSON(json);

        for (int i=0 ;i <expected.size();i++){
            assertEquals(actual.get(i).toString(),expected.get(i).toString());
        }
    }


    @org.junit.Test
    public void getInvoicesByDate1() throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy");
        LocalDate dateFrom = LocalDate.parse("01_04_2017",dtf);
        LocalDate dateTo = LocalDate.parse("25_04_2017",dtf);
        List<Invoice> actual = client.getInvoices(dateFrom,dateTo);

        String json = getJSON("https://awpraktyka.fakturownia.pl/invoices.json?period=more&date_from=01_04_2017&date_to=25_04_2017&api_token=5JCdT11J5iqzJ0E6f16I/awpraktyka");
        List<Invoice> expected = pharseJSON(json);

        for (int i=0 ;i <expected.size();i++){
            assertEquals(actual.get(i).toString(),expected.get(i).toString());
        }

    }

    @org.junit.Test
    public void getInvoicesByDate2() throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy");
        LocalDate dateFrom = LocalDate.parse("01_03_2017",dtf);
        LocalDate dateTo = LocalDate.parse("05_04_2017",dtf);
        List<Invoice> actual = client.getInvoices(dateFrom,dateTo);

        String json = getJSON("https://awpraktyka.fakturownia.pl/invoices.json?period=more&date_from=01_03_2017&date_to=05_04_2017&api_token=5JCdT11J5iqzJ0E6f16I/awpraktyka");
        List<Invoice> expected = pharseJSON(json);

        for (int i=0 ;i <expected.size();i++){
            assertEquals(actual.get(i).toString(),expected.get(i).toString());
        }

    }
    //endregion


}