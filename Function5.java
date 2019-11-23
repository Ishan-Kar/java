import java.util.Scanner;
public class Function5{
  public static int evenodd(int n){
        if(n%2==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[]args){
Scanner input=new Scanner(System.in);
int num;
System.out.println("Please enter a number");
num=input.nextInt();
System.out.println(evenodd(num));
    }
}