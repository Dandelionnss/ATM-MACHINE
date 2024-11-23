
package machineatm.atmmachine;

import java.util.Scanner;

public class Deposit extends AtmCoreInformation{
    
    public void depositCash(Scanner scan){
        
        System.out.println("\n========[ DEPOSIT CASH ]========");
        System.out.print("ENTER CASH TO DEPOSIT: ");
        _depositCash = scan.nextDouble();
        
        if (_depositCash >= 1){
        
        System.out.println("\nYou Deposit " + _depositCash + ", Enter Your PIN to Confirmed.");
        
        System.out.print("\nAcount PIN: ");
        _pinNumber = scan.nextInt();
        
            if (_pinNumber == _PinNum){
                
                _balanceCash = (_balanceCash + _depositCash);
                
                System.out.println("\n------------------------------------------------------------");
                System.out.println("Successfully Deposited Amount of : " + _depositCash);
                System.out.println("------------------------------------------------------------");
                //System.out.printf("\nACCOUNT BALANCE: %.2f%n",_balanceCash);
                
                    System.out.println("\nWould You Like To Do Another Transaction? (Y/N)");
                    System.out.print("Enter Here: ");
                    char choices = scan.next().toUpperCase().charAt(0);

                    if (choices == 'N'){

                        System.out.println("\n[[[[ SYSTEM STOPPTED ]]]]");
                        System.exit(0);
                    
                    }else if (choices == 'Y'){
                        scan.nextLine();
                    }else {
                        System.out.println("--------[ ERROR ENCOUNTERED ]--------");
                        System.out.println("\n[[[[ SYSTEM AUTOMATICALLY STOPPED ]]]]");
                        System.exit(0);
                    }
                
            }else {
                System.out.println("\nINVALID PIN NUMBER");
                System.out.println("\n[[[[ AUTOMATICALLY STOPPED ]]]]");
                System.exit(0);
            }
        
        }else {
            System.out.println("\nINVALID CASH VALUE");
        }
        
    }
    
}
