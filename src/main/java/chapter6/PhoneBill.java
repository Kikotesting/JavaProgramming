package chapter6;

public class PhoneBill {

    int id;
    double baseCost;
    int allottedMinutes;
    int minutesUsed;

    // default
    public PhoneBill(){
        id = 0;
        baseCost = 20.90;
        allottedMinutes = 1000;
        minutesUsed = 1000;
    }
    // id only
    public PhoneBill(int id){
        this.id = id;
        baseCost = 20.90;
        allottedMinutes = 1000;
        minutesUsed = 1000;
    }
    // all fields
    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    // All fields can use as setter and getter
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBaseCost(){
        return baseCost;
    }
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }
    public int getAllottedMinutes(){
        return allottedMinutes;
    }
    public void setAllottedMinutes(int minutes){
        allottedMinutes = minutes;
    }
    public int getMinutesUsed(){
        return minutesUsed;
    }
    public void setMinutesUsed(int minutes){
        minutesUsed = minutes;
    }

    public double calculateOverage(){
        if (minutesUsed <= allottedMinutes){
            return 0;
        }
        double overageRate = 0.25;

        double overageMinutes = minutesUsed - allottedMinutes;

        return overageMinutes * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.15;

        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }


}
