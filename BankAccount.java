public class BankAccount {
    private int balance;
    BankAccount(int num){
        if (num>0){
            this.balance = num;
        }
    }
    public int getBalance(){
        if(this.balance>0){
            return balance;
        }
        else{
            return -1;
        }
    }
    public void depositAmount(int num){
        if (num>0){
            this.balance+=num;
            System.out.printf("%d deposited in account",num);
        }
    }
    public void withdrawAmount(int num){
        if(this.balance>num){
            this.balance-=num;
            System.out.printf("%d withdrawn from account",num);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
