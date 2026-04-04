package Lab.Lab8;

class BankAccount{
    private String name;
    private String IC;
    private String passportNumber;
    private double amount;
    
    public BankAccount(){
        this.name = null;
        this.IC = null;
        this.passportNumber = null;
        this.amount = 0;
    }
    
    public BankAccount(String name, String IC, String passportNumber, double amount){
        this.name = name;
        this.IC = IC;
        this.passportNumber = passportNumber;
        this.amount = amount;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getIC(){
        return this.IC;
    }
    
    public void setIC(String IC){
        this.IC = IC;
    }
    
    public String getPassportNumber(){
        return this.passportNumber;
    }
    
    public void setPassportNumber(String passportNumber){
        this.passportNumber = passportNumber;
    }
    
    public void setamount(double amount){
        this.amount = amount;
    }
    
    public String display(){
        return "Name : " + this.name
                + "\n" + "IC : " + this.IC
                + "\n" + "Passport Number : " + this.passportNumber
                + "\n" + "Current Balance : " + String.format("RM %.2f",this.amount);
    }
    
    public double getCurrentBalance(){
        return this.amount;
    }
    
    public void withdrawMoney(double withdrawAmount){
        if (withdrawAmount > this.amount){
            System.out.println("Sorry you are out of balance.");
        } else{
            this.amount -= withdrawAmount;
            System.out.println("RM " + String.format("%.2f",withdrawAmount) + " deducted from your account.");
        }
    }
}

public class L8Q2 {
    public static void main(String[] args) {
        BankAccount customerA = new BankAccount();
        customerA.setName("cheekeat");
        customerA.setIC("060613XXXXXX");
        customerA.setPassportNumber("25006123");
        customerA.setamount(200);
        
        System.out.println(customerA.display());
        
        System.out.println("Withdraw " + 300);
        customerA.withdrawMoney(300);
        System.out.println("Withdraw " + 10);
        customerA.withdrawMoney(10);
        System.out.println("Curent Balance : RM " + String.format("%.2f",customerA.getCurrentBalance()));
    }
}
