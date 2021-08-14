import java.util.Scanner;
public class PerfectSquare {

    public static void perfectSquare(int num){
        int i;
        for(i=1 ; i*i<=num ; i++){
            if((num%i==0)&&(num/i==i)){
                System.out.println("Its a Perfect Square");
                break;
            }else{
                System.out.println("Its not a Perfect Number");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = scanner.nextInt();
        perfectSquare(number);
        
    }
    
}
