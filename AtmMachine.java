
package machineatm.atmmachine;

import java.util.Scanner;
import static machineatm.atmmachine.AtmCoreInformation.*;


public class AtmMachine {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
     
        System.out.println("========[ ATM MACHINE ]========");
        System.out.print("Account Number : ");
        _accountNumber = scan.nextLine();
        System.out.print("Account PIN    : ");
        _pinNumber = scan.nextInt();
        scan.nextLine();
        if (_accountNumber.equals(_AccountNum) && _pinNumber == _PinNum){
        
        while (true){
            
            System.out.println("\n===== [ SELECT YOUR TRANSACTION ]=====");
            System.out.println("1. DEPOSIT ");
            System.out.println("2. WITHDRAW ");
            System.out.println("3. BALANCE INQUIRY ");
            System.out.println("4. FAST CASH ");
            System.out.println("0. Exit System");
            System.out.print("ENTER HERE: ");
            String option = scan.nextLine();
            
            if (option.equals("1")){
                
                Deposit deposit = new Deposit();
                deposit.depositCash(scan);
                
            }else if (option.equals("2") ){
                
                Withdraw withdraw = new Withdraw();
                withdraw.withdrawCash(scan);
                
            }else if (option.equals("3")){
                
                BalanceInquiry balanceinquiry = new BalanceInquiry();
                balanceinquiry.balanceCheck(scan);
                
                
            }else if (option.equals("4")){
                
                FastCash fastCash = new FastCash();
                fastCash.fastCash(scan);
                
            }else if (option.equals("0")){
                
                System.out.println("=== SYSTEM EXIT ===");
                System.exit(0);
                
            }else {
                System.out.println("\nINVALID OPTIONS");
                
                System.out.println("[[[[ AUTOMATICALLY SYSTEM EXIT ]]]]");
                System.exit(0);
            }
            
        }
        
        }else {
            System.out.println("\nINVALID ACCOUNT NUMBER OR PIN NUMBER.");
        }
        
    }
}
        
