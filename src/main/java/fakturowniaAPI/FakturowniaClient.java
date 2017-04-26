package fakturowniaAPI;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.Request;


import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import okhttp3.Response;
import okhttp3.OkHttpClient;

//TODO JodaTime is unnecessary
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
//TODO use Log4j for logs



/**
 * Created by Adam on 19.04.2017.
 */

// example https://awpraktyka.fakturownia.pl/invoices.json?period=more&date_from=01_04_2017&date_to=21_04_2017&api_token=5JCdT11J5iqzJ0E6f16I
public class FakturowniaClient {

    private static OkHttpClient client = new OkHttpClient();
    //TODO refactor

    //TODO add token constructor and setter

    //TODO hardcoded string should be extracted to static final halfclass


    private static String getJSON(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();

        return response.body().string();
    }

    //region SUMMARIES

    //returns summary of a specific period
    //acceptable periods : all, this_month, last_month, this_year, last_year
    //periods that wont match to these above will throw a InvalidArgumentException
    public static InvoiceSummary getSummary(String token, String period) throws IOException, InvalidArgumentException {
        if(!period.equals("all")&&!period.equals("this_month")&&!period.equals("last_month")&&!period.equals("this_year")&&!period.equals("last_year")) {
            throw new InvalidArgumentException("Avaiable periods : this_month, last_month, this_year, last_year");
        }else {

            List<Invoice> invoiceList = getInvoices(token, period);

            double priceNet = 0;
            double priceGross = 0;
            double priceTax = 0;
            double exchangeRate = 1;

            for (Invoice invoice : invoiceList) {
                exchangeRate = Double.parseDouble(invoice.getExchangeRate());
                priceNet += Double.parseDouble(invoice.getPriceNet()) * exchangeRate;
                priceGross += Double.parseDouble(invoice.getPriceGross()) * exchangeRate;
                priceTax += Double.parseDouble(invoice.getPriceTax()) * exchangeRate;
            }
            int daysPassed = getDays(period);

            InvoiceSummary summary = new InvoiceSummary(priceNet, priceGross, priceTax, daysPassed);
            return summary;
        }
    }

    public static InvoiceSummary getSummary(String token, String dateFrom, String dateTo) throws IOException {
        double priceNet = 0;
        double priceGross = 0;
        double priceTax = 0;
        double exchangeRate = 1;
        int daysPassed = 0;

        DateTimeFormatter dtf = DateTimeFormat.forPattern("dd_MM_yyyy");
        DateTime dateTimeFrom = DateTime.parse(dateFrom,dtf);
        DateTime dateTimeTo = DateTime.parse(dateTo,dtf);

        List<Invoice> invoiceList = getInvoices(token, dateFrom, dateTo);

        for( Invoice invoice :invoiceList){
            exchangeRate = Double.parseDouble(invoice.getExchangeRate());
            priceNet += Double.parseDouble(invoice.getPriceNet()) * exchangeRate;
            priceGross += Double.parseDouble(invoice.getPriceGross()) * exchangeRate;
            priceTax += Double.parseDouble(invoice.getPriceTax()) *exchangeRate;
        }

        daysPassed = getDays(dateTimeFrom,dateTimeTo);

        InvoiceSummary summary = new InvoiceSummary(priceNet,priceGross,priceTax, daysPassed);
        return summary;
    }



    //endregion

    //region INVOICE GETTERS

    //returns invoices from specific perioids
    //acceptable periods : all, this_month, last_month, this_year, last_year
    //periods that wont match to these above will throw a InvalidArgumentException
    //TODO period should be a enum type.
    public static List<Invoice> getInvoices(String token, String period) throws InvalidArgumentException, IOException {
        if(!period.equals("all")&&!period.equals("this_month")&&!period.equals("last_month")&&!period.equals("this_year")&&!period.equals("last_year")) {
            throw new InvalidArgumentException("Avaiable periods : this_month, last_month, this_year, last_year");
        }else {
            String url = createJsonURLfromToken(token, period);
            String json = getJSON(url);

            List<Invoice> invoiceList = pharseJSON(json);

            return invoiceList;
        }
    }

    //returns invioices from  a custom perioid
    // date format dd_MM_yyyy
    @Deprecated
    public static List<Invoice> getInvoices(String token, String date_from, String date_to) throws IOException {
        String url = createJsonURLfromToken(token,date_from,date_to);
        String json = getJSON(url);

        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Invoice>>(){}.getType();
        List<Invoice> invoiceList =  gson.fromJson(json, listType);

        return invoiceList;
    }

    //TODO java.time.LocalDate <-
    //returns invioices from  a custom perioid
    public static List<Invoice> getInvoices(String token, Date date_from, Date date_to) throws IOException {
       String dateFrom = dateToString(date_from);
       String dateTo = dateToString(date_to);
       String url = createJsonURLfromToken(token,dateFrom,dateTo);
       String json = getJSON(url);

       List<Invoice> invoiceList = pharseJSON(json);



        return invoiceList;
    }

    //endregion

    //region URL CREATORS


    private static String createJsonURLfromToken(String token){
        final String mainDomain = ".fakturownia.pl/";
        final String formatType = "invoices.json?";
        String domainName = token.substring(token.indexOf("/")+1,token.length());

        String url = "https://"
                + domainName
                + mainDomain
                + formatType
                + "&api_token="
                + token;

        return url;
    }



    private static String createJsonURLfromToken(String token, String period){
        final String mainDomain = ".fakturownia.pl/";
        final String formatType = "invoices.json?";
        String domainName = token.substring(token.indexOf("/")+1,token.length());

        String url = "https://"
                + domainName
                + mainDomain
                + formatType
                + "period="
                + period
                + "&api_token="
                + token;

        return url;
    }

    private static String createJsonURLfromToken(String token, String dateFrom, String dateTo){
        final String mainDomain = ".fakturownia.pl/";
        final String formatType = "invoices.json?";
        String domainName = token.substring(token.indexOf("/")+1,token.length());

        String url = "https://"
                + domainName
                + mainDomain
                + formatType
                + "period=more"
                + "&date_from="
                + dateFrom
                + "&date_to="
                + dateTo
                + "&api_token="
                + token;

        return url;
    }
    //endregion

    //region DATE THINGS

    private static int getDays(DateTime dateFrom, DateTime dateTo){
        return Days.daysBetween(dateFrom,dateTo).getDays();
    }

    //calculate days by specific period
    private static int getDays(String period){
        int daysPassed = 0;
        if (period.equals("this_month")) {
            DateTime start = new DateTime().withDayOfMonth(1);
            DateTime end = new DateTime();
            daysPassed= Days.daysBetween(start,end).getDays();
        }
        if (period.equals("last_month")) {
            DateTime start = new DateTime().minusMonths(1).withDayOfMonth(1);
            DateTime end = new DateTime().minusMonths(1);
            end = end.dayOfMonth().withMaximumValue();
            daysPassed= Days.daysBetween(start,end).getDays();
        }
        if (period.equals("this_year")) {
            DateTime start = new DateTime().withMonthOfYear(1).withDayOfMonth(1);
            DateTime end = new DateTime();
            daysPassed= Days.daysBetween(start,end).getDays();
        }
        if (period.equals("last_year")) {
            DateTime start = new DateTime().minusYears(1).withMonthOfYear(1).withDayOfMonth(1);
            DateTime end = new DateTime().minusYears(1);
            end = end.monthOfYear().withMaximumValue();
            end = end.dayOfMonth().withMaximumValue();
            daysPassed= Days.daysBetween(start,end).getDays();
        }

        return daysPassed;
    }

    // dd_MM_yyyy format
    private static String dateToString(Date date){
        String formattedDate = new SimpleDateFormat("dd_MM_yyyy").format(date);

        return formattedDate;
    }

    //endregion

    // returns list of invoices
    private static List<Invoice> pharseJSON(String json){
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Invoice>>(){}.getType();
        List<Invoice> invoiceList = gson.fromJson(json, listType);
        return invoiceList;
    }

}
