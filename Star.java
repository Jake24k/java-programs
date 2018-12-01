import java.util.*;

public class Star {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("___________________________________________\n");

        for(int i = num; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("___________________________________________");
        int k =0;
        for(int i = 1; i < num; ++i, k = 0) {
            for(int star = 1; star <= num - i; ++star) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
        for(int i = num; i >= 1; --i) {
            for(int star = 1; star <= num - i; ++star) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
        
    
    
}