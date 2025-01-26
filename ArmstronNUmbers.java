import java.util.Scanner;

public class ArmstronNUmbers {
    public static boolean isArmstrong(int num){
        int originalNum=num;
        int sum=0;
        int digits=String.valueOf(num).length();
        while(num>0){
            int digit=num%10;
            sum+=Math.pow(digit,digits);
            num/=10;
        }
        return sum==originalNum;
    }

   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the start of the range: ");
        int start=sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end=sc.nextInt();
        System.out.println("Armstrong numbers between "+start+" and "+end+":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
   }
   sc.close();
}
}

