import java.io.*;

public class Binary {
public static BufferedReader br;

    public static void main(String[] args)throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        Menu();
    }    
    public static void Menu()throws IOException{
        
    
        System.out.println("******** BINARY CONVERSION *********");
        
        System.out.println("[1] Decimal to Binary\n"
                + "[2] Hexadecimal to Binary\n"
                + "[3] Octal to Binary\n"
                + "[4] Exit\n");
        System.out.print("Enter your choice : ");
        
        int choose = Integer.parseInt(br.readLine());
        
        switch(choose){           
            case 1:
                Decimal();
                
                break;            
            case 2:
                hexa();
                
                break;
            case 3:
                Octal();
                
                break;
            case 4:
                System.out.println("Thank You!");
                System.exit(0);
                break;
        }
    
    }
        
        public static void Decimal()throws IOException{
            System.out.print("Enter a decimal number : ");
            int n=Integer.parseInt(br.readLine());
 
            int r;
            String s=""; //para mastore yung result
 
            char dig[]={'0','1'}; //array na iniistore sa character to binary
 
            while(n>0)
            {
                r=n%2; //finding remainder by dividing the number by 2
                s=dig[r]+s; //inaadd yung remainder sa result tas nirereverse niya 
                n=n/2;
            }
            
            
            System.out.println("The number converted to binary is " +s);
            System.out.println("Do you want to try again?\n"
                + "y/n");
        String end = br.readLine();
        if(end.equals("y")){
            Decimal();            
        }
        else if(end.equals("n")){
            Menu();
        }
            
        }        
        public static void hexa()throws IOException{          
            System.out.print("Enter HexaNumber :");
            String hexa = br.readLine();
            
            int b = Integer.parseInt(hexa,16);
            
            String hex = Integer.toBinaryString(b);
            System.out.println("The hexaNumber converted to binary is " +hex);
            
            System.out.println("Do you want to try again?\n"
                + "y/n");
        String end = br.readLine();
        if(end.equalsIgnoreCase("y")){
            hexa();            
        }
        else if(end.equals("n")){
            Menu();
        }
        
        
        }
        public static void Octal()throws IOException{
            System.out.print("Enter Octal Number :");
            String oc = br.readLine();
            
            int b = Integer.parseInt(oc,8);
            
            String octal = Integer.toBinaryString(b);
            System.out.println("The Octal number converted to Binary is " +octal);
            
            
            System.out.println("Do you want to try again?\n"
                + "y/n");
        String end = br.readLine();
        if(end.equals("y")){
            Octal();            
        }
        else if(end.equals("n")){
            Menu();
        }
    }
       
        
}