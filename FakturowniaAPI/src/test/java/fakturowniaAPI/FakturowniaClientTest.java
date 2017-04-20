package fakturowniaAPI;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;


import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Adam on 20.04.2017.
 */
public class FakturowniaClientTest {
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
    public void getSummary() throws  Exception{
        boolean finite;
        InvoiceSummary summary;
        summary = FakturowniaClient.getSummary("5JCdT11J5iqzJ0E6f16I/awpraktyka","all");
        finite = Double.isFinite(summary.getPriceGrossPerDay());
        assertFalse(finite);
        finite = Double.isFinite(summary.getPriceNetPerDay());
        assertFalse(finite);
        finite = Double.isFinite(summary.getPriceTaxPerDay());
        assertFalse(finite);
        summary = FakturowniaClient.getSummary("5JCdT11J5iqzJ0E6f16I/awpraktyka","01_04_2010" ,"01_12_2020");
        finite = Double.isFinite(summary.getPriceGrossPerDay());
        assertTrue(finite);
        finite = Double.isFinite(summary.getPriceNetPerDay());
        assertTrue(finite);
        finite = Double.isFinite(summary.getPriceTaxPerDay());
        assertTrue(finite);

    }

    @org.junit.Test
    public void getInvoices() throws Exception {
        List<Invoice> actual;
        List<Invoice> expected;
        String json;

        actual = FakturowniaClient.getInvoices("5JCdT11J5iqzJ0E6f16I/awpraktyka","all");;
        json = getJSON("https://awpraktyka.fakturownia.pl/invoices.json?period=all&api_token=5JCdT11J5iqzJ0E6f16I/awpraktyka");
        expected = pharseJSON(json);

        for (int i=0 ;i <expected.size();i++){
            assertEquals(actual.get(i).toString(),expected.get(i).toString());
        }

        actual = FakturowniaClient.getInvoices("5JCdT11J5iqzJ0E6f16I/awpraktyka","this_month");;
        json = getJSON("https://awpraktyka.fakturownia.pl/invoices.json?period=this_month&api_token=5JCdT11J5iqzJ0E6f16I/awpraktyka");
        expected = pharseJSON(json);

        for (int i=0 ;i <expected.size();i++){
            assertEquals(actual.get(i).toString(),expected.get(i).toString());
        }

        actual = FakturowniaClient.getInvoices("5JCdT11J5iqzJ0E6f16I/awpraktyka","last_month");
        json = getJSON("https://awpraktyka.fakturownia.pl/invoices.json?period=last_month&api_token=5JCdT11J5iqzJ0E6f16I/awpraktyka");
        expected = pharseJSON(json);

        for (int i=0 ;i <expected.size();i++){
            assertEquals(actual.get(i).toString(),expected.get(i).toString());
        }

        actual = FakturowniaClient.getInvoices("5JCdT11J5iqzJ0E6f16I/awpraktyka","this_year");
        json = getJSON("https://awpraktyka.fakturownia.pl/invoices.json?period=this_year&api_token=5JCdT11J5iqzJ0E6f16I/awpraktyka");
        expected = pharseJSON(json);

        for (int i=0 ;i <expected.size();i++){
            assertEquals(actual.get(i).toString(),expected.get(i).toString());
        }

        actual = FakturowniaClient.getInvoices("5JCdT11J5iqzJ0E6f16I/awpraktyka","last_year");
        json = getJSON("https://awpraktyka.fakturownia.pl/invoices.json?period=last_year&api_token=5JCdT11J5iqzJ0E6f16I/awpraktyka");
        expected = pharseJSON(json);

        for (int i=0 ;i <expected.size();i++){
            assertEquals(actual.get(i).toString(),expected.get(i).toString());
        }
    }

    @org.junit.Test
    public void getInvoices1() throws Exception {
        List<Invoice> actual = FakturowniaClient.getInvoices("5JCdT11J5iqzJ0E6f16I/awpraktyka","01_04_2017","25_04_2017");

        String json = getJSON("https://awpraktyka.fakturownia.pl/invoices.json?period=more&date_from=01_04_2017&date_to=25_04_2017&api_token=5JCdT11J5iqzJ0E6f16I/awpraktyka");
        List<Invoice> expected = pharseJSON(json);

        for (int i=0 ;i <expected.size();i++){
            assertEquals(actual.get(i).toString(),expected.get(i).toString());
        }
    }

    @org.junit.Test
    public void getInvoices2() throws Exception {
        DateTimeFormatter dtf = DateTimeFormat.forPattern("dd_MM_yyyy");
        DateTime dateFrom = dtf.parseDateTime("01_04_2017");
        DateTime dateTo = dtf.parseDateTime("25_04_2017");
        List<Invoice> actual = FakturowniaClient.getInvoices("5JCdT11J5iqzJ0E6f16I/awpraktyka",dateFrom.toDate(),dateTo.toDate());

        String json = getJSON("https://awpraktyka.fakturownia.pl/invoices.json?period=more&date_from=01_04_2017&date_to=25_04_2017&api_token=5JCdT11J5iqzJ0E6f16I/awpraktyka");
        List<Invoice> expected = pharseJSON(json);

        for (int i=0 ;i <expected.size();i++){
            assertEquals(actual.get(i).toString(),expected.get(i).toString());
        }

    }


}