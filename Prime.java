import java.util.*;
public class Prime{
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is prime. ");
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        boolean isPrime = true;
        double startTime = System.currentTimeMillis();
        for(int i =2; i<=number/2; i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
        }
        double elapsedTime = (System.currentTimeMillis() - startTime)/ 1000;
        System.out.println("This took: "+elapsedTime+" seconds");
        if(isPrime==false){
            System.out.println(number+" is not a prime number.");
        }
        else{
            System.out.println(number+" is a prime number");
        }
    }
}

// 6700417 0.065sec
// 2147483647 ~18sec
// 67280421310721 ~69sec