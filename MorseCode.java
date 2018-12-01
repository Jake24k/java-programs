import java.util.*;
import java.io.*;


public class MorseCode {
    public static Scanner sc;

    public static void main(String[] args) throws IOException{
        
      int option = 0;
    String sentence = "",answer = "",answer1 = "";
     char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
             'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
             'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
             ',', '.', '?' };    

     String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };  
    sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    do
    {
    System.out.println("\nChoose your option");
    System.out.println("[1]English to Morse code\n"
            + "[2]Morse Code to English\n"
            + "[3]Exit ");
    
    System.out.print("->");
    while(!sc.hasNextInt()){
        System.out.println("");
        System.err.println("ERROR!! Enter Digits Only.");
        System.out.print("->");
        sc.next();   //Repeat and Discard the previous Inputs which are not valid 
    }
    option = sc.nextInt();
    switch(option)
    {
    case 1:
    {
        System.out.println("");
        System.out.println("Enter the Sentence that you want to Transmit Using the Morse Code ");
        System.out.print("->");
        sentence = br.readLine();
        System.out.println("");
        sentence = sentence.toLowerCase(); //Because morse code is defined only for the lower case letters and the numbers and the Symbols will remain the Same
        char[] morsec = sentence.toCharArray();
        for(int i = 0; i < morsec.length;i++)   
        {
            for(int j = 0;j<english.length;j++)   
            {
                if(english[j] == morsec[i])  //If the Character Present in English array is equal to the character present in the Morsec array then Only Execute 
                {//the condition in the Inner loop will be the first to be Equated in the If Statement
                    answer = answer + morse[j] + " ";  //After Every Letter is generated in the Morse Code we will give a Space 
                }   
            }
        }
        System.out.println("The Morse Code Translation is: ");
        System.out.print(">> ");
        System.out.println(answer);
        System.out.println("");
        break;
    }
    case 2:
    {
        System.out.println("");
        System.out.println("Enter the Morse Code and After Every Letter add Space in Between ");
        System.out.print("-> ");
        sentence = br.readLine();
        System.out.println("");
        String[] morsec = sentence.split(" ");   //To use the split function to Convert Every Morse Code String as a Separate Entry in the STring array 
        for(int i = 0;i < morsec.length;i++)
        {     
            for(int j = 0;j < morse.length;j++)
            {
                if(morse[j].equals(morsec[i]))  //When you are comparing the String you have to Do this and not == 
                {
                    answer1 = answer1 + english[j];  //Since the characters in the Morse array and the English Array are in the Same Index
                }
            }
        }
        System.out.println("The English Language Translation is: ");
        System.out.print("> ");
        System.out.println(answer1);
        System.out.println("");
        break;
    }
    case 3:
    {
        System.out.println("");
        System.out.println(">Yun lang!!!<");
        System.out.println("");
        break;
    }
    default:
    {
        System.err.println("ERROR!! Invalid Option");
        System.out.println("");
        break;
    }
    }
    }
    while(option!=3);
    }
    
}