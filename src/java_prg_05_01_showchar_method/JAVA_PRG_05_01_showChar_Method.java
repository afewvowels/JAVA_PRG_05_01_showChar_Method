/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_05_01_showchar_method;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 * Write a method named showChar. The method should accept two arguments: a
 * reference to a String object and an integer. The integer argument is a
 * character position within the String, with the first character being at
 * position 0. When the method executes, it should display the character at that
 * character position. Here is an example of a call to the method:
 * 
 *      showChar("New York", 2);
 * 
 * In this call, the method will display the character w because it is in
 * position 2. Demonstrate the method in a complete program.
 */
public class JAVA_PRG_05_01_showChar_Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String strString;
        int intCharPos;
        
        strString = getString();
        intCharPos = getInt(strString);
        
        showChar(strString, intCharPos);
    }
    
    public static String getString()
    {
        String strInput;
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        System.out.println("Please enter a string value: ");
        
        strInput = scrKeyboard.nextLine();
        
        return strInput;
    }
    
    public static int getInt(String strString)
    {
        int intInput = -1;
        
        boolean booIsValid = false;
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        while (booIsValid == false)
        {
            System.out.print("Please enter an integer value: ");
            
            intInput = scrKeyboard.nextInt();
            
            if (intInput >= 0 && intInput <= (strString.length() - 1))
            {
                booIsValid = true;
            }
            else if (intInput < 0 || intInput > strString.length())
            {
                booIsValid = false;
            }
        }
        
        return intInput;
    }
    
    public static void showChar(String strString, int intCharNum)
    {
        char chrChar;
        
        chrChar = strString.charAt(intCharNum);
        
        System.out.println("Character " + intCharNum + " of string \'" +
                strString + "\' is \'" + chrChar + "\'");
    }
    
}
