public class Instrument extends SarangiSansar {

    //creating attributes
    private static int instrumentID = 0;
    private String instrumentName, customerName,customerMobileNumber;
    private int PANnumber;


    //creating constructor of this class
    public Instrument(String instrumentName){
        //assigning parameter variable instrumentName value to local variable instrumentName
        this.instrumentName = instrumentName;
        instrumentID +=1;
        this.customerName = "";
        this.customerMobileNumber = "";
        this.PANnumber = 0;
    }


    public Instrument(String instrumentName2, int chargePerDay) {
    }


    //displaying information related to instrument and customer
    public void display(){
        System.out.println(instrumentID + ". " + instrumentName + ".");

        //checking if customer exist or not
        if(!customerName.isEmpty()) System.out.println("The instrument is taken by " + customerName + ".");

        //checking whether the customer gave his/her phone no. or not
        if(!customerMobileNumber.isEmpty()) System.out.println("The contact no. of " + customerName + " is " + customerMobileNumber + ".");

        //checking whether customer gave his/her PAN no. or not
        if(PANnumber>0) System.out.println("The PAN no. of "+ customerName + " is " + PANnumber);
    }

    //setter method for all attributes
    public static void setInstrumentID(int instrumentID) {
        Instrument.instrumentID = instrumentID;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerMobileNumber(String customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public void setPAN_number(int PANnumber) {
        this.PANnumber = PANnumber;
    }

    //getter method for all attributes
    public static int getInstrumentID() {
        return instrumentID;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public int getPAN_number() {
        return PANnumber;
    }


    public static Instrument get(int i) {
        return null;
    }
}