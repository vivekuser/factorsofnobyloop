import java.util.Scanner;
public class Powerofnobyloop {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        int n= scan.nextInt();
        int p =1;
        for(int i=1; i<=n; i++){
          p = p*x;   
        }
        System.out.println(p);
    }
}