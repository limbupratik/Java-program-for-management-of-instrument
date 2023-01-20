import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SarangiSansar {
 
    // ArrayList<Instrument> instrumentList = new ArrayList<>();

    final static int EMPTY = -1;
    final static int INVALID = -2;
    int e = 1;
    String x = " ";

    private JFrame frame;
    private JPanel panel1, panel2, subPanel1, subPanel2, subPanel3, subPanel4, subPanel5, subPanel6;
    private JLabel instrumentRentAddName, instrumentRentLabel, instrumentSellLabel, chargePerDayLbl, instrumentRentName,
            customerName, rentPhone, dateOfRent, dateOfReturn, noOfDays, instrumentNameReturn, panRent,
            instrumentSellAddName, price, instrumentSellName, customerNameSell, customerPhSell, panSell, sellDate,
            discountPercent;
    private JTextField instrumentRentAddNameTF, chargePerDayTF, instrumentRentNameTF, customerNameTF, rentPhoneTF,
            noOfDaysTF, instrumentNameReturnTF, panRentTF, instrumentSellAddNameTF, priceTF, instrumentSellNameTF,
            customerNameSellTF, customerPhSellTF, panSellTF, discountPercentTF;
    private JButton addToInstrument, rentHandler, returnHandler, displayRentHandler, clearRentHandler,
            addToSellInstrument, sellHandler, displaySellHandler, clearSellHandler;
    private JComboBox<String> day, month, year, dayR, monthR, yearR, dayS, monthS, yearS;

    public SarangiSansar() {

        // date
        String days[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
        String years[] = { "2022", "2023", "2024", "2025" };

        // color
        Color c1 = new Color(207, 227, 250);

        // 1

        // frame
        frame = new JFrame();
        frame.setTitle("SarangiSansar");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(false);
        frame.setSize(1300,900);

        // panel 1 --> Instrument to rent
        panel1 = new JPanel();
        panel1.setBounds(20, 20, 500, 650);
        panel1.setLayout(null);
        panel1.setBackground(c1);
        frame.add(panel1);

        instrumentRentLabel = new JLabel();
        instrumentRentLabel.setText("Instrument To Rent");
        instrumentRentLabel.setBounds(200, 10, 200, 20);
        instrumentRentLabel.setBackground(Color.black);
        panel1.add(instrumentRentLabel);

        // sub panel 1 --> add to instrument
        subPanel1 = new JPanel();
        subPanel1.setBounds(10, 40, 480, 130);
        subPanel1.setLayout(null);
        panel1.add(subPanel1);

        instrumentRentAddName = new JLabel();
        instrumentRentAddName.setText("Instrument Name: ");
        instrumentRentAddName.setBounds(10, 15, 150, 30);
        subPanel1.add(instrumentRentAddName);

        instrumentRentAddNameTF = new JTextField();
        instrumentRentAddNameTF.setBounds(170, 15, 200, 30);
        subPanel1.add(instrumentRentAddNameTF);

        chargePerDayLbl = new JLabel();
        chargePerDayLbl.setText("Charge per day: ");
        chargePerDayLbl.setBounds(10, 50, 150, 30);
        subPanel1.add(chargePerDayLbl);

        chargePerDayTF = new JTextField();
        chargePerDayTF.setBounds(170, 50, 200, 30);
        subPanel1.add(chargePerDayTF);

        // add to instrument button
        addToInstrument = new JButton("Add");
        addToInstrument.setBounds(200, 90, 90, 30);
        addToInstrument.setFocusPainted(false);
        addToInstrument.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInstrumentHandler();
            }
        });
        subPanel1.add(addToInstrument);

        // sub panel 2 --> rent the instrument

        subPanel2 = new JPanel();
        subPanel2.setBounds(10, 180, 480, 310);
        subPanel2.setLayout(null);
        panel1.add(subPanel2);

        instrumentRentName = new JLabel();
        instrumentRentName.setText("Instrument Name: ");
        instrumentRentName.setBounds(10, 15, 150, 30);
        subPanel2.add(instrumentRentName);

        instrumentRentNameTF = new JTextField();
        instrumentRentNameTF.setBounds(170, 15, 200, 30);
        subPanel2.add(instrumentRentNameTF);

        customerName = new JLabel();
        customerName.setText("Customer Name: ");
        customerName.setBounds(10, 50, 150, 30);
        subPanel2.add(customerName);

        customerNameTF = new JTextField();
        customerNameTF.setBounds(170, 50, 200, 30);
        subPanel2.add(customerNameTF);

        rentPhone = new JLabel();
        rentPhone.setText("Phone no:");
        rentPhone.setBounds(10, 85, 150, 30);
        subPanel2.add(rentPhone);

        rentPhoneTF = new JTextField();
        rentPhoneTF.setBounds(170, 85, 200, 30);
        subPanel2.add(rentPhoneTF);

        panRent = new JLabel();
        panRent.setText("PAN No:");
        panRent.setBounds(10, 120, 150, 30);
        subPanel2.add(panRent);

        panRentTF = new JTextField();
        panRentTF.setBounds(170, 120, 200, 30);
        subPanel2.add(panRentTF);

        dateOfRent = new JLabel();
        dateOfRent.setText("Date of Rent: ");
        dateOfRent.setBounds(10, 150, 150, 30);
        subPanel2.add(dateOfRent);

        day = new JComboBox<>(days);
        month = new JComboBox<>(months);
        year = new JComboBox<>(years);

        day.setBounds(170, 155, 50, 20);
        month.setBounds(225, 155, 50, 20);
        year.setBounds(280, 155, 60, 20);

        subPanel2.add(day);
        subPanel2.add(month);
        subPanel2.add(year);

        dateOfReturn = new JLabel();
        dateOfReturn.setText("Date of Return: ");
        dateOfReturn.setBounds(10, 185, 150, 30);
        subPanel2.add(dateOfReturn);

        dayR = new JComboBox<>(days);
        monthR = new JComboBox<>(months);
        yearR = new JComboBox<>(years);

        dayR.setBounds(170, 190, 50, 20);
        monthR.setBounds(225, 190, 50, 20);
        yearR.setBounds(280, 190, 60, 20);

        subPanel2.add(dayR);
        subPanel2.add(monthR);
        subPanel2.add(yearR);

        noOfDays = new JLabel();
        noOfDays.setText("No of Days: ");
        noOfDays.setBounds(10, 225, 150, 30);
        subPanel2.add(noOfDays);

        noOfDaysTF = new JTextField();
        noOfDaysTF.setBounds(170, 225, 70, 30);
        subPanel2.add(noOfDaysTF);

        // rent handler
        rentHandler = new JButton("Rent");
        rentHandler.setBounds(200, 265, 90, 30);
        rentHandler.setFocusPainted(false);
        rentHandler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rentInstrument();
            }
        });
        subPanel2.add(rentHandler);

        // subPanel3 --> return
        subPanel3 = new JPanel();
        subPanel3.setBounds(10, 500, 480, 100);
        subPanel3.setLayout(null);
        panel1.add(subPanel3);

        instrumentNameReturn = new JLabel();
        instrumentNameReturn.setText("Instrument Name: ");
        instrumentNameReturn.setBounds(10, 15, 150, 30);
        subPanel3.add(instrumentNameReturn);

        instrumentNameReturnTF = new JTextField();
        instrumentNameReturnTF.setBounds(170, 15, 200, 30);
        subPanel3.add(instrumentNameReturnTF);

        // return handler
        returnHandler = new JButton("Return");
        returnHandler.setBounds(200, 55, 90, 30);
        returnHandler.setFocusPainted(false);
        returnHandler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                returnInstrument();
            }
        });
        subPanel3.add(returnHandler);

        // display handler for rent
        displayRentHandler = new JButton("Display");
        displayRentHandler.setBounds(150, 610, 90, 30);
        displayRentHandler.setFocusPainted(false);
        // displayRentHandler.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         if (instrumentList.size() > 0) {
        //             for (int i = 0; i < instrumentList.size(); i++) {
        //                 if (instrumentList.get(i) instanceof InstrumentToRent) {
        //                     InstrumentToRent obj = (InstrumentToRent) instrumentList.get(i);
        //                     obj.Display();
        //                 }
        //             }
        //         } else {
        //             System.out
        //                     .println("There is nothing to display, not a instrument is rented or nothing is in stock");
        //         }
        //     }
        // });
        panel1.add(displayRentHandler);

        // clear handler for rent
        clearRentHandler = new JButton("Clear");
        clearRentHandler.setBounds(250, 610, 90, 30);
        clearRentHandler.setFocusPainted(false);
        clearRentHandler.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                clearRent();
            }
        });
        panel1.add(clearRentHandler);

        // panel 2 --> Instrument to sell
        panel2 = new JPanel();
        panel2.setBounds(750, 20, 500, 650);
        panel2.setLayout(null);
        panel2.setBackground(c1);
        frame.add(panel2);

        instrumentSellLabel = new JLabel();
        instrumentSellLabel.setText("Instrument To Sell");
        instrumentSellLabel.setBounds(200, 10, 150, 20);
        panel2.add(instrumentSellLabel);

        // sub panel 4 --> add to instrument for sell
        subPanel4 = new JPanel();
        subPanel4.setBounds(10, 40, 480, 130);
        subPanel4.setLayout(null);
        panel2.add(subPanel4);

        instrumentSellAddName = new JLabel();
        instrumentSellAddName.setText("Instrument Name: ");
        instrumentSellAddName.setBounds(10, 15, 150, 30);
        subPanel4.add(instrumentSellAddName);

        instrumentSellAddNameTF = new JTextField();
        instrumentSellAddNameTF.setBounds(170, 15, 200, 30);
        subPanel4.add(instrumentSellAddNameTF);

        price = new JLabel();
        price.setText("Price: ");
        price.setBounds(10, 50, 150, 30);
        subPanel4.add(price);

        priceTF = new JTextField();
        priceTF.setBounds(170, 50, 200, 30);
        subPanel4.add(priceTF);

        // add to instrument for sell button
        addToSellInstrument = new JButton("Add");
        addToSellInstrument.setBounds(200, 90, 90, 30);
        addToSellInstrument.setFocusPainted(false);
        addToSellInstrument.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInstrumentForSell();
            }
        });
        subPanel4.add(addToSellInstrument);

        // sub panel 5 --> sell the instrument

        subPanel5 = new JPanel();
        subPanel5.setBounds(10, 180, 480, 270);
        subPanel5.setLayout(null);
        panel2.add(subPanel5);

        instrumentSellName = new JLabel();
        instrumentSellName.setText("Instrument Name: ");
        instrumentSellName.setBounds(10, 15, 150, 30);
        subPanel5.add(instrumentSellName);

        instrumentSellNameTF = new JTextField();
        instrumentSellNameTF.setBounds(170, 15, 200, 30);
        subPanel5.add(instrumentSellNameTF);

        customerNameSell = new JLabel();
        customerNameSell.setText("Customer Name: ");
        customerNameSell.setBounds(10, 50, 150, 30);
        subPanel5.add(customerNameSell);

        customerNameSellTF = new JTextField();
        customerNameSellTF.setBounds(170, 50, 200, 30);
        subPanel5.add(customerNameSellTF);

        customerPhSell = new JLabel();
        customerPhSell.setText("Customer Number:");
        customerPhSell.setBounds(10, 85, 150, 30);
        subPanel5.add(customerPhSell);

        customerPhSellTF = new JTextField();
        customerPhSellTF.setBounds(170, 85, 200, 30);
        subPanel5.add(customerPhSellTF);

        panSell = new JLabel();
        panSell.setText("PAN No:");
        panSell.setBounds(10, 120, 150, 30);
        subPanel5.add(panSell);

        panSellTF = new JTextField();
        panSellTF.setBounds(170, 120, 200, 30);
        subPanel5.add(panSellTF);

        sellDate = new JLabel();
        sellDate.setText("Date of Sell: ");
        sellDate.setBounds(10, 150, 150, 30);
        subPanel5.add(sellDate);

        dayS = new JComboBox<>(days);
        monthS = new JComboBox<>(months);
        yearS = new JComboBox<>(years);

        dayS.setBounds(170, 155, 50, 20);
        monthS.setBounds(225, 155, 50, 20);
        yearS.setBounds(280, 155, 60, 20);

        subPanel5.add(dayS);
        subPanel5.add(monthS);
        subPanel5.add(yearS);

        discountPercent = new JLabel();
        discountPercent.setText("Discount Percent: ");
        discountPercent.setBounds(10, 185, 150, 30);
        subPanel5.add(discountPercent);

        discountPercentTF = new JTextField();
        discountPercentTF.setBounds(170, 185, 70, 30);
        subPanel5.add(discountPercentTF);

        // sell handler
        sellHandler = new JButton("Sell");
        sellHandler.setBounds(200, 225, 90, 30);
        sellHandler.setFocusPainted(false);
        sellHandler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sellInstrument();
            }
        });
        subPanel5.add(sellHandler);

        // display handler for sell
        displaySellHandler = new JButton("Display");
        displaySellHandler.setBounds(150, 460, 90, 30);
        displaySellHandler.setFocusPainted(false);
        // displaySellHandler.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         if (instrumentList.size() > 0) {
        //             for (int i = 0; i < instrumentList.size(); i++) {
        //                 if (instrumentList.get(i) instanceof InstrumentToSell) {
        //                     InstrumentToSell objS = (InstrumentToSell) instrumentList.get(i);
        //                     objS.Display();
        //                 }
        //             }
        //         } else {
        //             System.out.println("There is nothing to display, not a instrument is sold or nothing is in stock");
        //         }
        //     }
        // });
        panel2.add(displaySellHandler);

        // clear handler for sell
        clearSellHandler = new JButton("Clear");
        clearSellHandler.setBounds(250, 460, 90, 30);
        clearSellHandler.setFocusPainted(false);
        clearSellHandler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearSell();
            }
        });
        panel2.add(clearSellHandler);

        subPanel6 = new JPanel();
        subPanel6.setBounds(10, 500, 140, 140);
        subPanel6.setBackground(c1);
        panel2.add(subPanel6);

        // 2
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new SarangiSansar();
    }

    // add to instrument handler-->rent
    public void addInstrumentHandler() {
        String instrumentName = getInstrumentRentName();
        int chargePerDay = getChargePerDay();
        // negative
        if (e == 2) {
            e = 1;
            return;
        }
        // valid
        if (x == "invalid") {
            x = " ";
            return;
        }

        if (instrumentName.isEmpty() || chargePerDay == EMPTY) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }

    // instrument name --> rent
    public String getInstrumentRentName() {
        return instrumentRentAddNameTF.getText().trim();
    }

    // charge per day -->rent
    public int getChargePerDay() {
        // empty -1 //invalid -2
        String chargePerDayText = chargePerDayTF.getText().trim();
        int chargePerDay = INVALID;

        if (chargePerDayText.isEmpty()) {
            chargePerDay = EMPTY;
            return chargePerDay;
        }

        try {
            chargePerDay = Integer.parseInt(chargePerDayText);
            if (chargePerDay <= 0) {
                JOptionPane.showMessageDialog(frame, "Charge Per day can not be negative or 0", "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                chargePerDay = INVALID;
                e = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "charge Per day is not valid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            x = "invalid";
        }
        return chargePerDay;

    }

    // rent the instrument
    public void rentInstrument() {
        String instrumentToRentText = instrumentRentNameTF.getText().trim();
        String customerNameText = customerNameTF.getText().trim();
        String phoneText = rentPhoneTF.getText().trim();
        int panText = getPanNoRent();
        int noOfDaysText = getNoOfDays();
        boolean isUnique = true;

        if (instrumentToRentText.isEmpty() || panText == EMPTY || noOfDaysText == EMPTY || customerNameText.isEmpty()
                || phoneText.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // negative
        if (e == 2) {
            e = 1;
            return;
        }

        // valid
        if (x == "invalid") {
            x = " ";
            return;
        }
        if (isUnique == true) {
            JOptionPane.showMessageDialog(frame, "It is not found in stock", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    // get pan no for --> rent
    public int getPanNoRent() {
        String panNoText = panRentTF.getText().trim();
        int panNo = INVALID;

        if (panNoText.isEmpty()) {
            panNo = EMPTY;
            return panNo;
        }

        try {
            panNo = Integer.parseInt(panNoText);
            if (panNo <= 0) {
                JOptionPane.showMessageDialog(frame, "PAN No. can not be negative or 0",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                panNo = INVALID;
                e = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "PAN NO. is not valid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            x = "invalid";

        }
        return panNo;

    }

    // get no of day --> rent
    public int getNoOfDays() {
        String noOfDaysText = noOfDaysTF.getText().trim();
        int noOfDays = INVALID;

        if (noOfDaysText.isEmpty()) {
            noOfDays = EMPTY;
            return noOfDays;
        }

        try {
            noOfDays = Integer.parseInt(noOfDaysText);
            if (noOfDays <= 0) {
                JOptionPane.showMessageDialog(frame, "Number of Days can not be negative",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                noOfDays = INVALID;
                e = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Number of Days is not valid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            x = "invalid";

        }
        return noOfDays;

    }

    // return instrument
    public void returnInstrument() {
        String instrumentName = instrumentNameReturnTF.getText().trim();
        boolean moreThanZero = false;

        if (instrumentName.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        // if (instrumentList.size() > 0) {

        //     for (int i = 0; i < instrumentList.size(); i++) {
        //         if (instrumentList.get(i).getInstrumentName().toLowerCase().equals(instrumentName.toLowerCase())) {
        //             if (instrumentList.get(i) instanceof InstrumentToRent) {
        //                 InstrumentToRent obj = (InstrumentToRent) instrumentList.get(i);
        //                 if (obj.getIsRented() == false) {
        //                     JOptionPane.showMessageDialog(frame, "We did not rent this instrument",
        //                             "ERROR",
        //                             JOptionPane.ERROR_MESSAGE);
        //                     moreThanZero = true;
        //                     return;
        //                 }
        //                 obj.returnInstrument();
        //                 JOptionPane.showMessageDialog(frame, "Successfully returned");
        //                 obj.setIsRented(false);
        //                 moreThanZero = true;
        //                 break;

        //             }
        //         }
        //     }

            if (moreThanZero == false) {
                JOptionPane.showMessageDialog(frame, "It is neither on stock, nor we rent it", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    

    // clear in rent
    public void clearRent() {
        instrumentRentAddNameTF.setText("");
        chargePerDayTF.setText("");
        instrumentRentNameTF.setText("");
        customerNameTF.setText("");
        rentPhoneTF.setText("");
        panRentTF.setText("");
        noOfDaysTF.setText("");
        instrumentNameReturnTF.setText("");
    }

    // validation for sell
    // add to instrument handler-->sell
    public void addInstrumentForSell() {
        String instrumentName = instrumentSellAddNameTF.getText().trim();
        int price = getPrice();
        // negative
        if (e == 2) {
            e = 1;
            return;
        }

        // valid
        if (x=="invalid") {
            x = " ";
            return;
        }

        if (instrumentName.isEmpty() || price == EMPTY) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields", "WARNING",
            JOptionPane.WARNING_MESSAGE);
            return;
        }
    }

    // price for sell -->sell
    public int getPrice() {
        // empty -1 //invalid -2
        String priceText = priceTF.getText().trim();
        int price = INVALID;

        if (priceText.isEmpty()) {
            price = EMPTY;
            return price;
        }

        try {
            price = Integer.parseInt(priceText);
            if (price <= 0) {
                JOptionPane.showMessageDialog(frame, "Price can not be negative or 0",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                price = INVALID;
                e = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Price is not valid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            x = "invalid";
        }
        return price;
    }

    // sell the instrument
    public void sellInstrument() {
        String instrumentToSellText = instrumentSellNameTF.getText().trim();
        String customerNameSellText = customerNameSellTF.getText().trim();
        String customerPhoneText = customerPhSellTF.getText().trim();
        int customerPanText = getPanNoSell();
        int discountPercent = getDiscountPercent();
        boolean isUnique = true;

        if (instrumentToSellText.isEmpty() || customerPanText == EMPTY ||
                discountPercent == EMPTY
                || customerNameSellText.isEmpty()
                || customerPhoneText.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // negative
        if (e == 2) {
            e = 1;
            return;
        }

        // valid
        if (x == "invalid") {
            x = " ";
            return;
        }

        // if (instrumentList.size() > 0) {
        //     for (int i = 0; i < instrumentList.size(); i++) {
        //         if (instrumentList.get(i).getInstrumentName().toLowerCase()
        //                 .equals(instrumentToSellText.toLowerCase())) {
        //             if (instrumentList.get(i) instanceof InstrumentToSell) {
        //                 InstrumentToSell objS = (InstrumentToSell) instrumentList.get(i);
        //                 if (objS.getIssold() == true) {
        //                     isUnique = false;
        //                     JOptionPane.showMessageDialog(frame, "It is already sold", "WARNING",
        //                             JOptionPane.WARNING_MESSAGE);
        //                     return;
        //                 }
        //                 isUnique = false;
        //                 objS.sell(customerNameSellText, customerPhoneText,
        //                         customerPanText,
        //                         dateOfSell,
        //                         discountPercent);
        //                 objS.setIsSold(true);
        //                 JOptionPane.showMessageDialog(frame, "Successfully sold");

        //             }

        //             break;
        //         }

        //     }
        // }
        if (isUnique == true) {
            JOptionPane.showMessageDialog(frame, "It is not found in stock", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // pan no --> sell
    public int getPanNoSell() {
        String panNoSellText = panSellTF.getText().trim();
        int panNoSell = INVALID;

        if (panNoSellText.isEmpty()) {
            panNoSell = EMPTY;
            return panNoSell;
        }

        try {
            panNoSell = Integer.parseInt(panNoSellText);
            if (panNoSell <= 0) {
                JOptionPane.showMessageDialog(frame, "PAN No. can not be negative or 0",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                panNoSell = INVALID;
                e = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "PAN NO. is not valid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            x = "invalid";
        }
        return panNoSell;
    }

    // discount percent --> sell
    public int getDiscountPercent() {
        String discountPercentText = discountPercentTF.getText().trim();
        int discountPercent = INVALID;

        if (discountPercentText.isEmpty()) {
            discountPercent = EMPTY;
            return discountPercent;
        }

        try {
            discountPercent = Integer.parseInt(discountPercentText);
            if (discountPercent <= 0) {
                JOptionPane.showMessageDialog(frame, "Discount percent can not be negative or 0", "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                discountPercent = INVALID;
                e = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Discount Percent is not valid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            x = "invalid";
        }
        return discountPercent;
    }

    // clear--> sell
    public void clearSell() {
        instrumentSellAddNameTF.setText("");
        priceTF.setText("");
        instrumentSellNameTF.setText("");
        customerNameSellTF.setText("");
        customerPhSellTF.setText("");
        panSellTF.setText("");
        discountPercentTF.setText("");
    }

}