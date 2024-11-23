
package machineatm.atmmachine;

import java.util.Scanner;

public class Withdraw extends AtmCoreInformation{
    
    public void withdrawCash(Scanner scan){
        
        System.out.println("\n========[ WITHDRAW CASH ]========");
        System.out.print("ENTER CASH TO WITHDRAW: ");
        _withdrawCash = scan.nextDouble();
        
        if (_withdrawCash >= 1 && _withdrawCash <= _balanceCash){
            
            System.out.println("\nYou Want To Withdraw the Amount of " + _withdrawCash + ", Enter PIN to Confirmed.");
            System.out.print("\nAcount PIN: ");
            _pinNumber = scan.nextInt();
        
            if (_pinNumber == _PinNum){
                
                _balanceCash = (_balanceCash - _withdrawCash);
                
                System.out.println("\n------------------------------------------------------------");
                System.out.println("Successfully Withdrew Amount of : " + _withdrawCash);
                System.out.println("------------------------------------------------------------");
                System.out.println("\nGet The Amount of : " + _withdrawCash);
                
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
                System.out.println("\n[[[[ SYSTEM AUTOMATICALLY STOPPED ]]]]");
                System.exit(0);
            }
            
            
        }else {
            
            if (_withdrawCash < 1){
                
                System.out.println("\nINVALID CASH VALUE");
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
                
            }else if (_withdrawCash > _balanceCash){
                
                System.out.println("\nINEFFICIENT ACCOUNT BALANCE.");
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
        
        
    }
    
}
