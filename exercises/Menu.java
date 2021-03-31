package exercises;

import java.util.Scanner;

import static exercises.Messages.*;

public class Menu {

    float num1, num2;
    public void menuData(){
        Scanner inp= new Scanner(System.in);
        Arithmetic ari = new Arithmetic();
        
        print_message(OPERATION_NUM1);          
        num1 = inp.nextFloat();
        print_message(OPERATION_NUM2); 
        num2 = inp.nextFloat();
        print_message(MENU);            
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println(ari.add(num1,num2));
            break;
        case 2:
            System.out.println(ari.sub( num1,num2));
            break;     
        case 3:
            System.out.println(ari.mult( num1,num2));
            break;
        case 4:
            System.out.println(ari.div( num1,num2));
            break;
            default:
                System.out.println("Illigal Operation");
        }    

     
    }
}
