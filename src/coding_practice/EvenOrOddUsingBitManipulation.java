import java.util.*;
class EvenOrOddUsingBitManipulation {
    public static void main(String[] args) {
        
        //check if the number is even or odd using bit manipulation

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if( (n&1) == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
       
    }
}
