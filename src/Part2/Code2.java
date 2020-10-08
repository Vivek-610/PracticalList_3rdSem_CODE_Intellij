package Part2;
import java.util.Date;
import java.util.Scanner;

class Account{
    private int accountId=0;
    private double accountBalance=500;
    private double annualInterestRate = 0.07;
    private Date dateCreated;
    Scanner sc;
    Account(){
        accountId = 0;
        accountBalance = 500;
        annualInterestRate = 0.07 ;
        dateCreated = new Date();
        sc = new Scanner(System.in);
    }
    Account(int id,double balance){
        accountId = id;
        accountBalance = balance;
        annualInterestRate = 0.07 ;
        dateCreated = new Date();
        sc = new Scanner(System.in);
    }
    void accessorAccountDetails(){
        System.out.println("Account Id : "+accountId);
        System.out.println("Account balance : "+accountBalance);
        System.out.println("Account annual interest rate : "+annualInterestRate);
    }
    void accessorDateCreated(){
        System.out.println("Account was created on : " + dateCreated);
    }
    void mutator(){
        System.out.print("Enter account Id : ");
        accountId = sc.nextInt();
        System.out.print("Enter account balance : ");
        accountBalance = sc.nextDouble();
        System.out.print("Enter annual interest rate : ");
        annualInterestRate = sc.nextDouble();
    }
    double getMonthlyInterestRate(){
        return annualInterestRate;
    }
    double getMonthlyInterest(){
        return accountBalance*annualInterestRate;
    }
    void withdrawMoney(){
        System.out.print("Enter amount to withdraw : ");
        double money = sc.nextDouble();
        accountBalance = accountBalance - money;
    }
    void depositMoney(){
        System.out.print("Enter amount to deposit : ");
        double money = sc.nextDouble();
        accountBalance = accountBalance + money;
    }
}
public class Code2 {
    public static void main(String[] args){
        Account p1 = new Account();
        p1.mutator();
        p1.accessorAccountDetails();
        p1.accessorDateCreated();
        
        System.out.println(String.format("%3f",p1.getMonthlyInterest()));
        System.out.println(String.format("%3f",p1.getMonthlyInterestRate()));
        
        System.out.println();
        
        p1.withdrawMoney();
        p1.accessorAccountDetails();

        System.out.println();

        p1.depositMoney();
        p1.accessorAccountDetails();

        p1 = new Account(2,7000);
        p1.accessorAccountDetails();
        p1.accessorDateCreated();

        System.out.println(String.format("%3f",p1.getMonthlyInterest()));
        System.out.println(String.format("%3f",p1.getMonthlyInterestRate()));
				
				System.out.println("Code by - Vivek D Kapadia \n19CE055");
    }
}
