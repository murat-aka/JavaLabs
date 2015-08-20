
package javalab2_murat;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*

  @author:  murat aka
  @version: v1 
  @date:    2015/02/10
  @email:   murat-aka@hotmail.com
 

///////Objective////////

The purpose of this document is to provide a structure for the design of an application 
able to display 3 diamonds on the screen, using 3 different control structures (for, while and do 
while), of variable height, storing the structure on a String array and finally displaying the contents 
of the array on the screen. As an added complication, we should be able to print a special character 
(“o”) in the middle of the pyramid.

///////Solution////////

Due to the repetitive elements found within a diamond, the natural choice to build them
would be through repetitive control structures that walk from top to bottom or bottom to top 
adding '*' or spaces as and when required. In this case the requirement is very specific. All we need 
is 3 methods within the same class, each one with a type of loop.

///////Conclusion////////

The objective required on point 3 was reached through the solution. What took the most
time on putting the solution together was the calculation of where to put the '*' against where to put 
the spaces. The control structures were relatively simple as they are similar to those in C, php, etc.

*/
public class JavaLab2_murat {
 //static String[] dimond;
   static ArrayList<String> dimond; 

  
    public static void main(String[] args) {
        // TODO code application logic here
       
        for(;;)
        {
            userinterface();
            pauseprog();
        }
        
        
           // userinterface();          
    }
    
    public static void pauseprog(){
        System.out.println("Press enter to continue...");
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
    }
    
       
    public static int getinput(){
        
        Scanner in = new Scanner(System.in);
        int a = 0;
        
        try {
         
        a = in.nextInt();
        
        
        } 
        catch (InputMismatchException exception) 
    //Add import java.util.InputMismatchException; at the top
        {
        System.out.println("Error - Enter an integer");
        getinput();
        }
       
      return a;
    }
    
    public static void userinterface(){
           
        text();
        int choice = getinput();
        

        switch (choice) {
            case 1:  forloop();break;
            case 2:  whileloop();break;
            case 3:  dowhileloop();break;
            case 4:  System.exit(0);break;
            default:break;
       }
       
    }
    
    public static void text(){
        
        System.out.println("Dimond creating app! \n Choose an aplication\n "
                + "using \n"
                + "1. for loop \n"
                + "2. while loop\n"
                + "3. do while loop\n"
                + "4. to exit"
         );
        System.out.print("Enter(1-4): ");
    }
    
    public static void printdimond()
    {
        
        System.out.println(); 
        int arrayListSize = dimond.size();
        dimond.set( (arrayListSize)/2, "0" );  //replace the center with special character
 
        for(int i = 0; i < arrayListSize; i++)
        {
            System.out.print(dimond.get(i));
        }
       
    }
    public static void checkeven(int n){
    
    if (n % 2 == 0){
         System.out.println("you cant use even numbers");
         getheight();
    }
    
    }
    public static int getheight(){
        System.out.print("Please enter height: ");
        int n = getinput();
        checkeven(n);
        
        return n;
    }
    
    public static void forloop(){
        
        dimond = new ArrayList<String>();
         
            int n = getheight();
           
    for (int i = 1; i <= (n+1)/2; i++)  ///top part of the dimond
            {
                  for (int j = 0; j < (n - i); j++)
                      dimond.add(" ");
                      //  System.out.print(" ");
                  for (int j = 1; j <= i; j++)
                      dimond.add("*");
                       // System.out.print("*");
                  
                 for (int k = 1; k < i; k++)
                     dimond.add("*");
                        //System.out.print("*");
                  //System.out.println();
                 dimond.add("\n");
            }
    
     for (int i = (n+1)/2 - 1; i >= 1; i--) // bottom part of the dimond
            {
                  for (int j = 0; j < (n - i); j++)
                      dimond.add(" ");
                       // System.out.print(" ");
                  for (int j = 1; j <= i; j++)
                      dimond.add("*");
                       // System.out.print("*");
                  for (int k = 1; k < i; k++)
                      dimond.add("*");
                       // System.out.print("*");
                        
                  //System.out.println();
                  dimond.add("\n");
            }
 
            printdimond();
    
   }

    
    
    public static void whileloop(){
        
        
        dimond = new ArrayList<String>();
         int n = getheight();
         int i=0;
        while (i != (n+1)/2)  ///top part of the dimond
            {
            i++;
                    int j = 0;
                  while ( j < (n - i))
                  {
                      j++;
                      dimond.add(" ");
                  }
                      j=1;
            //  System.out.print(" ");
                  while ( j <= i )
                  {
                      j++;
                      dimond.add("*");
                       // System.out.print("*");
                  }
                  
                  int k = 1;
                 while ( k < i )
                 {
                     k++;
                     dimond.add("*");
                 }
                        //System.out.print("*");
                  //System.out.println();
                 dimond.add("\n");
            }
        
        
    i= (n+1)/2 -1 ;
     while( i >= 1) // bottom part of the dimond
            {
        
                    int j = 0;
                 while ( j < (n - i))
                 {
                      j++;
                      dimond.add(" ");
                 }
                       // System.out.print(" ");
                 j = 1;
                  while (  j <= i){
                       j++;
                      dimond.add("*");
                  }
                      
                       // System.out.print("*");
                  int k = 1;
                  while ( k < i )
                  {
                      dimond.add("*");
                      k++;
                  }
                       // System.out.print("*");
                        
                  //System.out.println();
                  dimond.add("\n");
                  
                   i--;
            }
            printdimond();
    }
    
    
    public static void dowhileloop(){
        
         dimond = new ArrayList<String>();
         int n = getheight();
         int i=0;
        do
            {
            i++;
                    int j = 0;
                  do
                  {
                      j++;
                      dimond.add(" ");
                  }while ( j < (n - i));
                      j=1;
            //  System.out.print(" ");
                  do
                  {
                      j++;
                      dimond.add("*");
                       // System.out.print("*");
                  }while ( j <= i );
                  
                  int k = 1;
                 do
                 {
                     k++;
                     dimond.add("*");
                 }while ( k < i );
                        //System.out.print("*");
                  //System.out.println();
                 dimond.add("\n");
            }while (i != (n+1)/2);  ///top part of the dimond
        
        
    i= (n+1)/2 -1 ;
     do // bottom part of the dimond
            {
        
                    int j = 0;
                 do
                 {
                      j++;
                      dimond.add(" ");
                 }while ( j < (n - i));
                       // System.out.print(" ");
                 j = 1;
                  do{
                       j++;
                      dimond.add("*");
                  }while (  j <= i);
                      
                       // System.out.print("*");
                  int k = 1;
                  do
                  {
                      dimond.add("*");
                      k++;
                  }while ( k < i );
                       // System.out.print("*");
                        
                  //System.out.println();
                  dimond.add("\n");
                  
                   i--;
            }while( i >= 1);
            printdimond();
        
    }
    
    


}