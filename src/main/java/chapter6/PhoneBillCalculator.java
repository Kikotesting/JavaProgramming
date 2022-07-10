package chapter6;

public class PhoneBillCalculator {

    public static void main(String args[]){
        PhoneBill bill = new PhoneBill();

        bill.setMinutesUsed(2000);
        bill.setAllottedMinutes(1000);
        bill.setBaseCost(1000);
        bill.setId(1);

        bill.printItemizedBill();
    }
}