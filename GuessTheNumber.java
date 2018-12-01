
import java.util.Scanner;        
import java.util.Random;         


public class GuessTheNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

	Random rndNum = new Random();
	rndNum.nextInt(100);
        int guess = rndNum.nextInt(100) +1;
        
        
        for(int x=0;x<5;x++){
            System.out.println("Enter your Guess number: ");
            int num = sc.nextInt();
                     
            if(num<guess){
                System.out.println("HIGHER!! Try again!");
                if(x==3){
			System.out.println("This is your last chance!");
		}
            }else if(num>guess){
                System.out.println("LOWER!! Try again");
                if(x==3){
			System.out.println("This is your last chance!");
		}
                
                        
            }else{
                System.out.println("You have Enter the right Number");
                System.exit(0);
            }           
        }
         
	 System.out.println("The correct answer is " +guess);

  
    }
}