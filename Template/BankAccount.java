public class BankAccount{
    //instance variables

    //constructor 1
    public BankAccount(String account, String name, String address){

    }
    //consructor 2
    public BankAccount(String account, String name, String address, double initBalance){


    }
    public boolean depositMoney(double amount){


    }
    public boolean withdrawMoney(double amount){

    }

    public boolean transferMoney(BankAccount from, BankAccount to, double amount){

        

    }
    public String toString(){
        return this.accountNumber + " - " + this.name +": $" + this.balance;
    }

    public boolean equals(String accountNumber){


    }
    public String getAccountNumber(){

    }
    public String getAddress(){
       

    }
    public void setAddress(String newAddress){
        
    }
    public double getBalance(){
        

    }
    public String getName(){
        
    }
    public void setName(String newName){
        
    }
    public static void main(String[]args){
        //
        BankAccount askshat = new BankAccount ("123","askshat","White House", 10000.00);
        BankAccount bernice = new BankAccount("345","bernice","Statu of Liberty", 2.00);
        bernice.transferMoney(askshat, bernice, 2.00);
        System.out.println(bernice.getBalance());
        System.out.println(askshat.getBalance());
        System.out.println(askshat.equals(bernice.accountNumber));
        System.out.println(askshat.name);
        System.out.println(askshat.balance);

    }
}
