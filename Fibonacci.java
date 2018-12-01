import java.io.*;

public class Fibonacci {
    

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter n: ");
        int n = Integer.parseInt(br.readLine());
        
        int num1 = 0, num2 = 1;
        
        System.out.print("First " + n + " terms: ");
        
        
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(num1 + " ");
            if(i==n){
                System.out.println("\nThe Value is " + num1);
            }

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
          
        } 
    }
}