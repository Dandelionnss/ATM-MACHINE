
package machineatm.atmmachine;

import java.util.Scanner;

public class BalanceInquiry extends AtmCoreInformation {
    
    public void balanceCheck(Scanner scan){
        
        System.out.println("\n========[ BALANCE ACCOUNT ]========");
        System.out.println("\n------------------------------------------------------------");
        System.out.printf("ACCOUNT BALANCE: %.2f%n", _balanceCash);
        System.out.println("------------------------------------------------------------");
        
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
    }
    
}
