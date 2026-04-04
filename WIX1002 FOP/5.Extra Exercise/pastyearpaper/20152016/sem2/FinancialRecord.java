class FinancialRecord {
    private int id = 0; 
    private double balance = 0; 
    private double annualInterestRate = 0; 

    public FinancialRecord() {} 

    public FinancialRecord(int id, double balance) { 
        this.id = id;
        this.balance = balance;
    }

    // Accessors and Mutators 
    public int getId() { 
        return id; 
    }
    
    public void setId(int id) { 
        this.id = id; 
    }
    
    public double getBalance() { 
        return balance; 
    }
    
    public void setBalance(double balance) {
        this.balance = balance; 
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate; 
    }
    
    public void setAnnualInterestRate(double rate) {
        this.annualInterestRate = rate; 
    }

    public double getMonthlyInterestRate() { 
        return annualInterestRate / 12;
    }

    public void withdraw(double amount) {
        System.out.println("Previous balance: RM" + balance);
        balance -= amount;
        System.out.println("Current balance after withdrawal of RM " + amount + " is: RM" + balance);
    }

    public void deposit(double amount) {
        System.out.println("Previous balance: RM" + balance);
        balance += amount;
        System.out.println("Current balance after deposit of RM " + amount + " is: RM" + balance);
    }

    public void displayRecordInfo() { 
        System.out.println("Financial record id is: " + id);
        System.out.println("Financial record balance is: RM" + balance);
        System.out.println("Annual interest rate is: " + annualInterestRate);
    }
}