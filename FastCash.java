
package machineatm.atmmachine;

import java.util.Scanner;

public class FastCash extends AtmCoreInformation{
    
    
    public void fastCash(Scanner scan){
        
        System.out.println("\n========[ FAST CASH WITHDRAW ]========");
        System.out.println("1. P50");
        System.out.println("2. P100");
        System.out.println("3. P200");
        System.out.println("4. P500");
        System.out.println("5. P1000");
        System.out.print("ENTER HERE: ");
        String option = scan.nextLine();
        
        if (option.equals("1")){
            
            if (50 <= _balanceCash){
                
                System.out.println("\nYou Want To Withdraw the Amount of " + 50 + ", Enter PIN to Confirmed.");
                System.out.print("\nAcount PIN: ");
                _pinNumber = scan.nextInt();

                if (_pinNumber == _PinNum){
                
                    _balanceCash = (_balanceCash - 50);
                    System.out.println("\n------------------------------------------------------------");
                    System.out.println("Successfully Withdrew Amount of : " + 50);
                    System.out.println("------------------------------------------------------------");
                    System.out.println("\nGet The Amount of : " + 50);

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
            
        }else if (option.equals("2")){
            
                if (100 <= _balanceCash){
                
                System.out.println("\nYou Want To Withdraw the Amount of " + 100 + ", Enter PIN to Confirmed.");
                System.out.print("\nAcount PIN: ");
                _pinNumber = scan.nextInt();

                if (_pinNumber == _PinNum){
                
                    _balanceCash = (_balanceCash - 100);
                    System.out.println("\n------------------------------------------------------------");
                    System.out.println("Successfully Withdrew Amount of : " + 100);
                    System.out.println("------------------------------------------------------------");
                    System.out.println("\nGet The Amount of : " + 100);

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
            
        }else if (option.equals("3")){
            
                if (200 <= _balanceCash){
                
                System.out.println("\nYou Want To Withdraw the Amount of " + 200 + ", Enter PIN to Confirmed.");
                System.out.print("\nAcount PIN: ");
                _pinNumber = scan.nextInt();

                if (_pinNumber == _PinNum){
                
                    _balanceCash = (_balanceCash - 200);
                    System.out.println("\n------------------------------------------------------------");
                    System.out.println("Successfully Withdrew Amount of : " + 200);
                    System.out.println("------------------------------------------------------------");
                    System.out.println("\nGet The Amount of : " + 200);

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
            
        }else if (option.equals("4")){
            
                if (500 <= _balanceCash){
                
                System.out.println("\nYou Want To Withdraw the Amount of " + 500 + ", Enter PIN to Confirmed.");
                System.out.print("\nAcount PIN: ");
                _pinNumber = scan.nextInt();

                if (_pinNumber == _PinNum){
                
                    _balanceCash = (_balanceCash - 500);
                    System.out.println("\n------------------------------------------------------------");
                    System.out.println("Successfully Withdrew Amount of : " + 500);
                    System.out.println("------------------------------------------------------------");
                    System.out.println("\nGet The Amount of : " + 500);

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
            
        }else if (option.equals("5")){
            
                if (1000 <= _balanceCash){
                
                System.out.println("\nYou Want To Withdraw the Amount of " + 1000 + ", Enter PIN to Confirmed.");
                System.out.print("\nAcount PIN: ");
                _pinNumber = scan.nextInt();

                if (_pinNumber == _PinNum){
                
                    _balanceCash = (_balanceCash - 1000);
                    System.out.println("\n------------------------------------------------------------");
                    System.out.println("Successfully Withdrew Amount of : " + 1000);
                    System.out.println("------------------------------------------------------------");
                    System.out.println("\nGet The Amount of : " + 1000);

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
            
        }else {
            System.out.println("\nINVALID OPTION.");
        }
        
    }
    
}
