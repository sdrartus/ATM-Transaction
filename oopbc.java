import java.util.Scanner;
import java.util.ArrayList;
public class oopbc extends Banking{
    Banking b = new Banking();
    public static void main (String[] args){
        System.out.println("");
        menu();
        
        }
    public static char menu (){
        Scanner sc = new Scanner(System.in);
        System.out.println("                   OOPBC                          ");
        System.out.println(" Object Oriented Programming Banking Corporation  ");
        System.out.println(" S -> Start Transaction  ");
        System.out.println(" Q -> Quit  ");
        System.out.println(" ");
        System.out.println(" Enter your choice: ");
        char option = sc.next().charAt(0);
        isValid(option);
        return option;
    }
    public static void isValid(char x){
        Scanner sc = new Scanner(System.in);
        char option = x;
        Banking b = new Banking();
      if (option == 'S' || option == 's'){
            boolean pinCorrect = false;
            int counter = 2;
                do{
            System.out.println("Enter pin");
            int pinNum = sc.nextInt();
            if (counter <= 0){
                System.out.println("CAPTURED CARD... PLEASE CALL 143-44");
                menu();
            }
                if(pinNum == 0000 || pinNum == 1111 || pinNum == 2222 || pinNum == 3333|| pinNum == 4444|| pinNum == 5555){
                pinCorrect = true;
                int pinIndex = 0;
                switch(pinNum){
                    case 1111:
                        pinIndex = 0;
                        break;
                    
                    case 2222:
                        pinIndex = 1;
                        break;
                    
                    case 3333:
                        pinIndex = 2;
                        break;
                    
                    case 4444:
                        pinIndex = 3;
                        break;
                    
                    case 5555:
                        pinIndex = 4;
                        break;
                }
                //start transaction
                    do{
                    System.out.println("                   OOPBC                          ");
                    System.out.println(" Object Oriented Programming Banking Corporation  ");
                    System.out.println(" B -> Balance Inquiry  ");
                    System.out.println(" W -> Withdrawal  ");
                    System.out.println(" D -> Deposit  ");
                    System.out.println(" C -> Cancel  ");
                    System.out.println(" ");
                    System.out.println(" Enter your choice: ");
                    System.out.println("----------------------------");
                    char option1 = sc.next().charAt(0);
                    if(option1 == 'B' || option1 == 'b'){
                        b.getBalance(pinIndex);
                    
                    } 
                    else if (option1 == 'W' || option1 == 'w'){
                            b.withdraw(pinIndex);
                    
                    }
                    
                    
                }while(true);
            } else {
            pinCorrect = false;
            System.out.println("Trials left: "+counter);
             
            }
            
            counter--; 
        }while (!pinCorrect && counter >= 0);
        }
        
        else if (option == 'Q' || option == 'q'){
            System.out.println("Program Closed.");
        } else{
            System.out.println("Invalid input.");
        }
    }
    }
    
class  Banking {
    private String[] actNum = {"0123-4567-8901","2345-6789-0123","3456-7890-1234",
             "4567-8901-2345","5678-9012-3456",};
    private String[] actName = {"Roel Richard","Dorie Marie","Railee Darrel",
            "Railynne Dessirei","Raine Dessirei"};
    
    private int[] pin = {0000, 1111, 2222, 3333, 4444, 5555};
    // Constructors
    Banking(){
        
    }
    
    public void getBalance(int index){
        float[] balance = {5000.00f, 0.00f, 10000, 2500, 10000};
        
        String[] actNum = {"0123-4567-8901","2345-6789-0123","3456-7890-1234",
             "4567-8901-2345","5678-9012-3456",};
        String[] actName = {"Roel Richard","Dorie Marie","Railee Darrel",
            "Railynne Dessirei","Raine Dessirei"};
        
        System.out.println("Account    #   "+actNum[index]);
        System.out.println("Account Name   "+actName[index]);
        System.out.println("Balance        "+balance[index]);
        System.out.println("----------------------------");
    }
    public void withdraw(int index){
        Scanner sc = new Scanner (System.in);
        float amount = 0, input_amt = 0;
        float u_b1 = 0, u_b2 = 0, u_b3 = 0,u_b4 = 0,u_b5 = 0;
        switch (index){
            case 1:
                amount = 5000.00f;
                System.out.println("                   OOPBC                          ");
                System.out.println(" Object Oriented Programming Banking Corporation  ");
                System.out.println("Enter Amount: ");
                input_amt = sc.nextFloat();
                    if(input_amt >= 100 && input_amt <= amount ){
                        u_b1 = (amount - input_amt);
                        System.out.println("Updated Balance: "+u_b1);
                        
                    }
                    if(input_amt == 450 || input_amt == 10){
                        System.out.println("Invalid amount.");
                        break;
                    }
                    break;
            case 2:
                amount = 0.00f;
                System.out.println("                   OOPBC                          ");
                System.out.println(" Object Oriented Programming Banking Corporation  ");
                System.out.println("Enter Amount: ");
                input_amt = sc.nextFloat();
                    if(input_amt >= 100 && input_amt <= amount ){
                        u_b2 = (amount - input_amt);
                        System.out.println("Updated Balance: "+u_b2);
                        
                    }
                    if(input_amt == 450 || input_amt == 10){
                        System.out.println("Invalid amount.");
                        break;
                    }
                break;
            case 3:
                amount = 10000;
                System.out.println("                   OOPBC                          ");
                System.out.println(" Object Oriented Programming Banking Corporation  ");
                System.out.println("Enter Amount: ");
                input_amt = sc.nextFloat();
                    if(input_amt >= 100 && input_amt <= amount ){
                        u_b3 = (amount - input_amt);
                        System.out.println("Updated Balance: "+u_b3);
                        
                    }
                    if(input_amt == 450 || input_amt == 10){
                        System.out.println("Invalid amount.");
                        break;
                    }
                break;
            case 4:
                amount = 2500;
                System.out.println("                   OOPBC                          ");
                System.out.println(" Object Oriented Programming Banking Corporation  ");
                System.out.println("Enter Amount: ");
                input_amt = sc.nextFloat();
                    if(input_amt >= 100 && input_amt <= amount ){
                        u_b4 = (amount - input_amt);
                        System.out.println("Updated Balance: "+u_b4);
                        
                    }
                    if(input_amt == 450 || input_amt == 10){
                        System.out.println("Invalid amount.");
                        break;
                    }
                break;
            case 5:
                amount = 10000;
                System.out.println("                   OOPBC                          ");
                System.out.println(" Object Oriented Programming Banking Corporation  ");
                System.out.println("Enter Amount: ");
                input_amt = sc.nextFloat();
                    if(input_amt >= 100 && input_amt <= amount ){
                        u_b5 = (amount - input_amt);
                        System.out.println("Updated Balance: "+u_b5);
                        
                    }
                    if(input_amt == 450 || input_amt == 10){
                        System.out.println("Invalid amount.");
                        break;
                    }
                break;
        }
        
        
    }
    public String[] getActNum(){
        return actNum;        
    }
    public String[] getActName(){
        return actName;        
    }
    public int[] getPin(){
        return pin;        
    }
    public void setActNum(String[] act_Name){
        this.actName = act_Name;
    }
    public void setPin(int[] act_pin){
        this.pin = act_pin;
    }
    public static int getIndex(int x){
        return x;
    }
}
    



