class Point extends CreditCard {
    public Point(String name, String number) { super(name, number, "Point Reward"); }
    public void getReward(String day, double amount) {
        int points = (int) amount;
        if (day.equals("Friday")) points *= 2;
        else if (day.equals("Saturday")) points *= 3;
        else if (day.equals("Sunday")) points *= 4;
        this.totalReward += (points * 0.01);
    }
}
