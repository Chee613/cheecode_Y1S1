class Rebate extends CreditCard {
    public Rebate(String name, String number) { super(name, number, "Cash Rebate"); }
    public void getReward(String type, double amount) {
        double r = 0;
        if (type.equals("Fuel")) r = amount * 0.08;
        else if (type.equals("Utility")) r = amount * 0.05;
        else if (type.equals("Grocery")) r = amount * 0.02;
        else r = amount * 0.002;
        this.totalReward += r;
    }
}
