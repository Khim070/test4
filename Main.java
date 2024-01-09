import java.util.Scanner;

class Person{
    private String name;
    private int id;
    Scanner s = new Scanner(System.in);
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void Person_input(){
        System.out.print("Input ID: ");
        id = s.nextInt();
        s.nextLine();
        System.out.print("Input Name: ");
        name = s.nextLine();
    }

    public void Person_output(){
        System.out.println("ID is: "+id);
        System.out.println("Name is: "+name);
    }
}
class Student extends Person{
    private int StudentID;

    public int getStudentID(){
        return StudentID;
    }
    public void setStudentID(int StudentID){
        this.StudentID = StudentID;
    }

    public void Student_input(){
        super.Person_input();
        System.out.print("Input Student ID: ");
        StudentID = s.nextInt();
    }
    public void Student_ouput(){
        super.Person_output();
        System.out.println("Student ID is: "+StudentID);
    }
}
class BankAccount{
    private String accountNumber;
    private double balance;
    private String owner;
    Scanner s = new Scanner(System.in);
    public double getBalance(){
        return balance;
    }
    public BankAccount(String accountNumber, String owner){
        this.accountNumber = accountNumber;
        this.owner = owner;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void DepositMoney(){
        double Depositamount;
        System.out.print("Enter the amount to deposit: ");
        Depositamount = s.nextDouble();
        balance = balance + Depositamount;
        System.out.println("Your total balance is: "+balance);
    }

    public void WithdrawMoney(){
        if(balance<0){
            System.out.println("Your don't have any balance to take a withdraw");
        }else{
            System.out.print("Enter the amount to withdraw: ");
            double withdraw;
            withdraw = s.nextDouble();
            if(withdraw > balance){
                System.out.println("Your balance is insufficient to take a withdraw");
            }else{
                balance -= withdraw;
                System.out.println("You still remain: "+balance);
            }
        }
    }

    public void AccountDetail(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
        System.out.println("Owner: "+owner);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BankAccount ba = new BankAccount("500 292 906", "LEANG Vakhim");
        int op;
        do {
        System.out.println("\n\n1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check account details");
        System.out.println("4. Exit");
        System.out.print("Enter number of operation: ");
        op = s.nextInt();
            switch (op){
                case 1:
                    ba.DepositMoney();
                    break;
                case 2:
                    ba.WithdrawMoney();
                    break;
                case 3:
                    ba.AccountDetail();
                    break;
                case 4:
                    System.out.println("Thank for using our services!");
                    break;
            }
        }while(op != 4);
    }
}