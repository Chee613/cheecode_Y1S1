class CreditCard {
    protected String name, number, type;
    protected double totalReward;

    public CreditCard(String name, String number, String type) {
        this.name = name; this.number = number; this.type = type;
    }
    public void setReward(double r) { this.totalReward = r; }
    public double getReward() { return totalReward; }
    public String toString() {
        return "Credit Card " + name + " (" + number + ")\nCard Type: " + type + "\nTotal Cash Reward: " + totalReward;
    }
}