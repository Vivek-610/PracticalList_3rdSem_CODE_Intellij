package Part2;
import java.util.Date;
import java.util.Scanner;
//import java.util.ArrayList;

class AccountClass{
    static int counter = 1;
    private String accountId;
    private double accountBalance=300;
    private double annualInterestRate = 0.07;
    private Date dateCreated;
    Scanner sc;
    AccountClass(){
        counter++;
        if(counter >= 10){
            accountId = "AC0" + (counter);
            accountBalance = 300;
            annualInterestRate = 0.07 ;
            dateCreated = new Date();
            sc = new Scanner(System.in);
        } else {
            accountId = "AC00" + (counter);
            accountBalance = 300;
            annualInterestRate = 0.07 ;
            dateCreated = new Date();
            sc = new Scanner(System.in);
        }
    }
    AccountClass(int id,String t,double money){
        if( id >= 10){
            accountId = t +  Integer.toString(id);
            accountBalance = money;
            annualInterestRate = 0.07 ;
            dateCreated = new Date();
            sc = new Scanner(System.in);
        } else {
            accountId = t + "0" + Integer.toString(id);
            accountBalance = money;
            annualInterestRate = 0.07 ;
            dateCreated = new Date();
            sc = new Scanner(System.in);
        }
    }
    void accessorAccountDetails(){
        System.out.println("Account Id : "+accountId);
        System.out.println("Account balance : "+accountBalance);
        System.out.println("Account annual interest rate : "+annualInterestRate);
    }
    void balanceInquiry(){

        System.out.print("Account "+ accountId + " balance : " + accountBalance + " Created on : "+ dateCreated);
        System.out.println();
    }
    double getAccountBalance(){
        return accountBalance;
    }
    void accessorDateCreated(){
        System.out.println("Account was created on : " + dateCreated);
    }
    String getAccountId(){
        return accountId;
    }
    int balanceMutator(){
        System.out.print("Enter account balance : ");
        double money = sc.nextDouble();
        if(money > 300){
            accountBalance = money;
            return 1;
        } else {
            System.out.println("Enter balance greater than 300 Rs");
            return 0;
        }
    }
    void withDrawBalance(double a){
        accountBalance = accountBalance - a;
    }
    double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    double getMonthlyInterest(){
        return accountBalance*annualInterestRate;
    }
    void withdrawMoney(){
        System.out.println("Enter the amount to withdraw from normal account :");
        double money = sc.nextDouble();
        if(accountBalance >= 300 && (accountBalance-money)>300){
        accountBalance = accountBalance - money;
        } else {
            System.out.println("Not enough fund available");
        }
    }
    void depositMoney(double money){
        accountBalance = accountBalance + money;
    }
    @Override
    public String toString() {
        return "Account ID : " + accountId + "\n" + "Interest rate: " + annualInterestRate +"\n" + "Account balance :" + accountBalance + " Rs.";
    }
}
class checkingAccount extends AccountClass{
    double overDraftLimit;
    checkingAccount(double money){
        super(counter,"CK0",money);
        overDraftLimit = -1000;
    }
    @Override
    void withdrawMoney() {
        System.out.println("Enter the amount to withdraw from checking accounts:");
        double money = sc.nextDouble();
        if(getAccountBalance()-money >= overDraftLimit){
            withDrawBalance(money);
        } else {
            System.out.println("Reached below Overdraft limit ");
        }
    }
    @Override
    public String toString() {
        return "\n" + "Checking Accounts : " + "\n" + "Account ID : " + getAccountId() + "\n" + 
"Interest rate: " + 12*getMonthlyInterestRate() + "\n" + "Account balance :" + getAccountBalance() + " Rs.";
    }
}
class savingAccounts extends AccountClass{
    double overDraftLimit;
    savingAccounts(double money){
        super(counter,"SA0",money);
        overDraftLimit = 0;
    }
    @Override
    void withdrawMoney() {
        System.out.println("Enter the amount to withdraw from saving account :");
        double money = sc.nextDouble();
        if(getAccountBalance()-money >= overDraftLimit){
            withDrawBalance(money);
        } else {
            System.out.println("Reached below Overdraft limit ");
        }
    }
    @Override
    public String toString() {
        return "\n" + "Saving Accounts :"+ "\n" + "Account ID : " + getAccountId() + "\n" + "Interest rate: "
 + 12*getMonthlyInterestRate() + "\n" + "Account balance :" + getAccountBalance() + " Rs";
    }
}

public class Code4 {
    public static void main(String args[]){
        AccountClass Acc = new AccountClass(AccountClass.counter,"AC0",1000);
        checkingAccount checkingAcc = new checkingAccount(4000);
        savingAccounts savingAcc = new savingAccounts(5000);

        System.out.println(Acc);
        System.out.println(checkingAcc);
        System.out.println(savingAcc);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        Acc.withdrawMoney();

        System.out.println();
        checkingAcc.withdrawMoney();

        System.out.println();
        savingAcc.withdrawMoney();

        System.out.println();
        System.out.println(Acc);
        System.out.println(checkingAcc);
        System.out.println(savingAcc);
        System.out.println("Coded by Vivek D Kapadia\n19CE055");
        sc.close();

    }
    
}
