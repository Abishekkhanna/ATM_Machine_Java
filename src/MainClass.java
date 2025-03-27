import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AtmOperationInterface op = new AtmOperationImplement();
        int pin=123;
        int no=123;
        System.out.println("Welcome to ATM Machine");
        System.out.println("Enter Your Card Number : ");
        int atmno = sc.nextInt();
        System.out.println("Enter Your Pin Number : ");
        int atmpin = sc.nextInt();
        if((atmno==no)&&(atmpin==pin)){
            while(true){
                System.out.println("1.Check Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini Statement\n5.Exit");
                System.out.println("Enter Your Choice : ");
                int ch = sc.nextInt();
                if(ch==1){
                    op.viewBalance();
                }else if(ch==2){
                    System.out.println("Enter Amount to Withdraw : ");
                    int withdrawamount = sc.nextInt();
                    op.withdrawAmount(withdrawamount);
                }else if(ch==3){
                    System.out.println("Enter Amount to Deposit : ");
                    int depositamount = sc.nextInt();
                    op.depositAmount(depositamount);
                }else if(ch==4){
                    op.viewMiniStatement();
                }else if(ch==5){
                    System.out.println("Thank You !");
                    System.exit(0);
                }else{
                    System.out.println("Invalid Option");
                }
            }
        }else{
            System.out.println("Invalid Pin");
        }
    }
}
