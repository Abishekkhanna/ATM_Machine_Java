import java.util.HashMap;
import java.util.Map;

public class AtmOperationImplement implements AtmOperationInterface{
    Atm_Class atm = new Atm_Class();
    HashMap<Double,String> mini = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Balance : "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0){
            if(withdrawAmount<=atm.getBalance()){
                mini.put(withdrawAmount, "Withdraw");
                atm.setBalance(atm.getBalance()-withdrawAmount);
                System.out.println("Balance Amount : "+atm.getBalance());
            }else{
                System.out.println("Insufficient Balance");
                System.exit(0);
            }
        }else{
            System.out.println("Please Enter Amount Multiples of 500");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        mini.put(depositAmount, "Deposit");
        atm.setBalance(atm.getBalance()+depositAmount);
    }

    @Override
    public void viewMiniStatement() {
        System.out.println("Mini Statement");
        for(Map.Entry<Double,String> entry : mini.entrySet()){
            System.out.println("Amount "+entry.getKey()+" is "+entry.getValue());
        }
    }

}
