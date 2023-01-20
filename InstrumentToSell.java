public class InstrumentToSell extends Instrument {
    //creating attributes
    private int price;
    private int discountPercent;
    private String sellDate;
    private boolean isSold;

    //creating constructor of this class
    public InstrumentToSell(String instrumentName, int price) {
        //calling constructor of parent(Instrument) class
        super(instrumentName);
        this.price = price;
        sellDate = "";
        discountPercent = 0;
        isSold = false;
    }

    public void sellInstruments(String customerName, String phone, int PANnumber, String sellDate, int discountPercent)
    {
        //checking whether the instrument is sold out or not
        if(isSold){
            System.out.println("The instrument was bought by " + getCustomerName() + 
                                " (contact no. : " +getCustomerMobileNumber() + ")");
            }
        else{
            //assigning parameter variable values to some attributes of parents class 
            //using setter method and super keyword
            super.setCustomerName(customerName);
            super.setCustomerMobileNumber(phone);
            super.setPAN_number(PANnumber);
            //assigning parameter variable values to instance variable of this class 
            //using setter methods
            setSellDate(sellDate);

            setDiscountPercent(discountPercent);

            float val = (float) discountPercent/100;

            setPrice((int)(price - val * price));
            setSold(true);
        }
    } 
    @Override
    public void display(){
        //checking if the instrument is sold out or not
        if(isSold) {
            super.display();
            System.out.println("It was sold out on "+ getSellDate());
            System.out.println("Price of the " + getInstrumentName() +  " was Rs."+ getPrice() + ".");
        }
        else{
            System.out.println("Price of the " + getInstrumentName() +  " is Rs."+ getPrice() + ".");
        }
        
    }

    //defining setters for each attributes
    public void setPrice(int val) {
        //checking whether the instrument is sold out or not
        if(!isSold) {
            this.price = val;
        }
        else {
            System.out.println("The instrument is already sold out.");
        }
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    //getter for each attributes
    public int getPrice() {
        return price;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public String getSellDate() {
        return sellDate;
    }

    public boolean isSold() {
        return isSold;
    }
}