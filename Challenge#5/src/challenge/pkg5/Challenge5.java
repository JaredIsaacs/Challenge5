/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package challenge.pkg5;

import java.util.Scanner;

/**
 *
 * @author jaredisaacs
 */
public class Challenge5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Challenge5 driver = new Challenge5();
        
        String userInput;
        String transformedInput;
        
        System.out.println("Enter a word with an x.");
        do{
            userInput = sc.next();

            System.out.println("Before transform: " + userInput);

            transformedInput = driver.transform(userInput);
            System.out.println("After transform: " + transformedInput);
            System.out.println("\nEnter \"no\" to end. Or enter another word.");
        }while(!userInput.equalsIgnoreCase("no"));
    }
    
    
    public String transform(String string){
        if (string.isEmpty()){
            return "";
        }else if (string.charAt(0) == 'x'){
            return 'y' + transform(string.substring(1));
        }else{
            return string.charAt(0) + transform(string.substring(1));
        }
    }
    
    
}
