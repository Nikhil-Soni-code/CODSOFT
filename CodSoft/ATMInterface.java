package CodSoft;

import java.util.Scanner;

class ATM_Machine{
    Scanner sc = new Scanner(System.in);
    String name;
    private int balance = 0;
    public void withdraw(int amount){

        if(balance>=amount){
            balance-=amount;
            System.out.println(amount+" withdrawn succeessfully !!");
            System.out.println("Type y to Check Account Balance");


        }
        else{
            System.out.println("Not Enough Amount! Type y to Check Account Balance");
        }
        char choice;
        choice = sc.next().charAt(0);
        if(choice == 'y' || choice == 'Y'){
            System.out.println("Total Balance: "+checkBalance());
        }
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public int checkBalance(){
        return balance;
    }

}
public class ATMInterface {

    public static void main(String[] args) {
        ATM_Machine person = new ATM_Machine();
        System.out.println("WELCOME TO THE ATM INTERFACE");
        System.out.println("Our Services :");
        System.out.println("1. Withdraw\n2. Deposit\n3.Check Balance\n4.Exit");
        Scanner sc = new Scanner(System.in);

        int amount;
        boolean flag = true;
        while(flag) {
            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Amount to Withdraw");
                    amount = sc.nextInt();
                    person.withdraw(amount);
                    break;
                case 2:
                    System.out.println("Enter Amount to Deposit");
                    amount = sc.nextInt();
                    person.deposit(amount);
                    break;
                case 3:
                    System.out.println("Total Amount = " + person.checkBalance());
                    break;
                default:
                    System.out.println("Thank You!! The Machine is shutting down");
                    flag = false;
            }
        }
    }
}
