package Constructors;
class BankAccount
{
   private String DepositorName;
   private long AccountNumber;
   private String AccountType;
   private double BalanceAmount;
   
   public BankAccount()
   {
      DepositorName  = "";
      AccountNumber = 0; AccountType = "";
      BalanceAmount = -1;
    }
    public BankAccount(String dName, long accno, String accType, double balAmount)
    {
       DepositorName= dName;
       AccountNumber = accno; AccountType = accType;
       BalanceAmount= balAmount;
    }
   void initialize( String dName, long accno, String accType, double balAmount)
   {
      DepositorName= dName;
      AccountNumber = accno; AccountType = accType;
      BalanceAmount= balAmount;
    }
   void display()
   {
      System.out.println("Depositor Name is" + DepositorName);
      System.out.println("Account Number is" + AccountNumber);
      System.out.println("Account type is" + AccountType);
      System.out.println("Balance Amount is" + BalanceAmount);
    }
    void deposit(double amount)
    {
       BalanceAmount += amount;
    }
    void withdraw(double amount)
    {
       if(amount<= BalanceAmount)
       BalanceAmount -=amount;
    }
   public static void main()
   {
      BankAccount acc1 = new BankAccount();
      acc1.initialize("Ramesh", 30000, "Saving", 8000);
      BankAccount acc2 = new BankAccount("Rajesh" , 40000, "current" , 70000);
      acc1.deposit(18000);
      acc1.display();
      acc2.withdraw(20000);
      acc2.display();
    }
}

           

