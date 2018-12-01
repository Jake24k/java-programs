import java.util.*;
public class Fact {

    public static void main(String[] args) {
        int fact = 1;
        int num=0;
        
        System.out.println("enter a number to factor: ");
        
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        
        for(int i=1;i<=num;i++){
            fact=i*fact;
        }
        System.out.println("The factorial of " +num+ " is " +fact);
    }
    
}