public class Q5 {
    public static void main(String[] args) {
        Rebate r = new Rebate("John Lim", "1111222233334444");
        Point p = new Point("John Lim", "5555666677778888");

        Object[][] items = {
            {"Grocery", "Saturday", 124.80}, {"Other", "Friday", 64.60},
            {"Fuel", "Sunday", 95.40}, {"Utility", "Friday", 100.00},
            {"Other", "Tuesday", 220.00}
        };

        for (Object[] item : items) {
            r.getReward((String)item[0], (double)item[2]);
            p.getReward((String)item[1], (double)item[2]);
        }

        System.out.println(r + "\n" + p);
        System.out.println("The best card is " + (r.getReward() > p.getReward() ? "Cash Rebate Card" : "Point Reward Card"));
    }
}