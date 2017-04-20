package fakturowniaAPI;

/**
 * Created by Adam on 19.04.2017.
 */


public class InvoiceSummary {
    private double priceNet;
    private double priceGross;
    private double priceTax;
    private int daysPassed;

    //region CONSTRUCTORS

    public InvoiceSummary(double priceNet, double priceGross, double priceTax , int daysPassed){
        this.priceGross = priceGross;
        this.priceNet = priceNet;
        this.priceTax = priceTax;
        this.daysPassed = daysPassed;
    }


    //endregion

    //region GETTERS & SETTERS


    public double getPriceNet() {
        return priceNet;
    }

    public double getPriceGross() {
        return priceGross;
    }

    public double getPriceTax() {
        return priceTax;
    }

    public void setPriceNet(double priceNet) {
        this.priceNet = priceNet;
    }

    public void setPriceGross(double priceGross) {
        this.priceGross = priceGross;
    }

    public void setPriceTax(double priceTax) {
        this.priceTax = priceTax;
    }
    //endregion

    //region PRICE PER DAY

    //returns infinity if cant determinate the value
    public double getPriceNetPerDay(){
        return priceNet/daysPassed;
    }

    //returns infinity if cant determinate the value
    public double getPriceGrossPerDay(){
        return priceGross/daysPassed;
    }

    //returns infinity if cant determinate the value
    public double getPriceTaxPerDay(){
        return priceTax/daysPassed;
    }

    //endregion
}
