package Part2;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

class AccountByClass {
    static int counter = 0;
    private String accountId;
    private double accountBalance = 300;
    private double annualInterestRate = 0.07;
    private Date dateCreated;
    Scanner sc;

    AccountByClass() {
        counter++;
        if (counter >= 10) {
            accountId = "AC0" + (counter);
            accountBalance = 300;
            annualInterestRate = 0.07;
            dateCreated = new Date();
            sc = new Scanner(System.in);
        } else {
            accountId = "AC00" + (counter);
            accountBalance = 300;
            annualInterestRate = 0.07;
            dateCreated = new Date();
            sc = new Scanner(System.in);
        }
    }

    AccountByClass(int id, double balance) {
        if (id >= 10) {
            accountId = "AC0" + Integer.toString(id);
            accountBalance = balance;
            annualInterestRate = 0.07;
            dateCreated = new Date();
            sc = new Scanner(System.in);
        } else {
            accountId = "AC00" + Integer.toString(id);
            accountBalance = balance;
            annualInterestRate = 0.07;
            dateCreated = new Date();
            sc = new Scanner(System.in);
        }
    }

    void accessorAccountDetails() {
        System.out.println("Account Id : " + accountId);
        System.out.println("Account balance : " + accountBalance);
        System.out.println("Account annual interest rate : " + annualInterestRate);
    }

    void balanceInquiry() {

        System.out.print("Account " + accountId + " balance : " + accountBalance + " Created on : " + dateCreated);
        System.out.println();
    }

    void accessorDateCreated() {
        System.out.println("Account was created on : " + dateCreated);
    }

    String getAccountId() {
        return accountId;
    }

    int balanceMutator() {
        System.out.print("Enter account balance : ");
        double money = sc.nextDouble();
        if (money > 300) {
            accountBalance = money;
            return 1;
        } else {
            System.out.println("Enter balance greater than 300 Rs");
            return 0;
        }
    }

    double getMonthlyInterestRate() {
        return annualInterestRate;
    }

    double getMonthlyInterest() {
        return accountBalance * annualInterestRate;
    }

    void withdrawMoney(double money) {
        if (accountBalance >= 300 && (accountBalance - money) > 300) {
            accountBalance = accountBalance - money;
        } else {
            System.out.println("Not enough fund available");
        }
    }

    void depositMoney(double money) {
        accountBalance = accountBalance + money;
    }
}

public class Code3 {

    static int getIndex(ArrayList<AccountByClass> persons) {
        int i = 0;
        String id = null;
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter Id of the account : ");
        boolean flag = true;
        for (i = 0; i < persons.size() + 1; i++) {
            if (flag) {
                id = sn.next();
                i = 0;
                flag = false;
            } else if (i == persons.size()) {
                System.out.print("No account found enter account Id again : ");
                flag = true;
                i = 0;
                continue;
            }
            if (id.equals(persons.get(i).getAccountId())) {
                System.out.println("Account Id " + persons.get(i).getAccountId() + " Found");
                break;
            }
        }
        return i;
    }

    public static void main(String args[]) {
        ArrayList<AccountByClass> persons = new ArrayList<AccountByClass>();
        boolean flag = true;
        double money;
        int i;

        for (i = 0; i < 10; i++) {
            AccountByClass p = new AccountByClass();
            persons.add(p);
        }
        int a = 0;
        Scanner sn = new Scanner(System.in);
        while (flag) {

            System.out.println();
            System.out.println("Enter number for following choice : ");
            System.out.println("1. Balance inquiry ");
            System.out.println("2. Withdraw money ");
            System.out.println("3. Deposit money");
            System.out.println("4. Money Transfer");
            System.out.println("5. Create Account ");
            System.out.println("6. Deactivate Account ");
            System.out.println("7. Exit");
            System.out.print(" -------> ");

            a = sn.nextInt();

            if (a <= 0 || a > 7)
                continue;
            else if (a == 7)
                break;

            System.out.print(" -------> ");

            switch (a) {
                case 1:
                    i = getIndex(persons);
                    persons.get(i).balanceInquiry();
                    break;
                case 2:
                    i = getIndex(persons);
                    System.out.print("Enter amount to withdraw : ");
                    money = sn.nextDouble();
                    persons.get(i).withdrawMoney(money);
                    break;
                case 3:
                    i = getIndex(persons);
                    System.out.print("Enter amount to deposit : ");
                    money = sn.nextDouble();
                    persons.get(i).depositMoney(money);
                    break;
                case 4:
                    i = getIndex(persons);
                    System.out.println("Enter account id in which you want to transfer money :");
                    int j = getIndex(persons);
                    System.out.print("Enter the amount to be transfered : ");
                    money = sn.nextDouble();
                    persons.get(i).withdrawMoney(money);
                    persons.get(j).depositMoney(money);
                    break;
                case 5:
                    AccountByClass p = new AccountByClass();
                    System.out.println("Account ID is :" + p.getAccountId());
                    System.out.print("Enter account balance : ");
                    money = sn.nextDouble();
                    if (money > 300) {
                        money = money - 300;
                        p.depositMoney(money);
                        persons.add(p);
                    } else {
                        System.out.println("Sorry your account is deleted \nEnter balance greater than 300 Rs.");
                        AccountByClass.counter--;
                    }
                    break;
                case 6:
                    i = getIndex(persons);
                    persons.remove(i);
                    System.out.println("Account removed successfully.");
                    break;
            }
        }
        System.out.println("Coded By Vivek D Kapadia\n19CE055");
        sn.close();
    }
}
