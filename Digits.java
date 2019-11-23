public class Digits{
    public static void main(String[]args){
        int num=5;
        if(num>0&&num<=9){
            System.out.println("single digit");
        }
        else if(num>10&&num<99){
            System.out.println("double digit");
        }

        
        else if(num>100&&num<999){
            System.out.println("triple digit");
        }

        
    }
}