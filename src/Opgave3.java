import java.util.ArrayList;

public class Opgave3 {
    public class Transaction{
        private String deposit;
       private double amount;


        public Transaction(String deposit, double amount){
            this.deposit = deposit;
            this.amount = amount;
        }


        public String toString(){
          return deposit + " " + amount + " kr in account";
        }
    }

    public class BankAccount{
        String owner;
        double balance;
        ArrayList<Transaction> transactions;


        public BankAccount(String owner, double startBalance){
            this.owner = owner;
            this.balance = startBalance;
            this.transactions = new ArrayList<>();
        }

        public double deposit(double amount){
            transactions.add(new Transaction("Deposit",amount));
            return balance + amount;


        }

        public void withdraw(double amount){
            if(amount > balance){
                System.out.println("no can do");
            } else {
                balance = balance - amount;
                System.out.println(amount + "kr withdrew");
                transactions.add(new Transaction("Withdrawed",amount));
            }
        }

        public void printTransactionHistory(){
            for(Transaction t : transactions){
                System.out.println(t);
            }

        }

        public double getBalance() {
            return balance;
        }
    }



    void main(){
        BankAccount sims = new BankAccount("Simon",1000000);
        sims.withdraw(100);
        sims.deposit(10000);
        sims.withdraw(10000);
        sims.printTransactionHistory();
        double finalBalance = sims.getBalance();
        System.out.println(finalBalance);
    }


}
