import java.util.Scanner;
public class PerfectNoORNot {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();
        int sum=0;
        for (int i = 1 ; i<number ; i++){
            if(number%i==0){
                sum = sum + i;

            }
        }if(sum == number){
            System.out.println("Its a Perfect Number!!");
        }else{
            System.out.print("Its not a Perfect Number!!");
        }

    }
    
}
