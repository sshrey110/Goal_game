import java.util.Scanner;

/**
 * Created by shrey on 7/10/2015.
 */
public class main {
    static Scanner key = new Scanner(System.in);
    public static double digit;
    public static void main(String[] args) {
        System.out.println("Enter any number");
        int input = key.nextInt();
        digit = Math.pow(2, input);
        for (int i = 0; i < digit; i++) {
            String x1 = decimalToBinary(i);
            System.out.println(x1);
        }
    }
    public static String decimalToBinary(int decimal)
    {
        String binary = "";
        while (decimal != 0)
        {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }
        return binary;
    }
    public void ka(int len,String ps)
    {
        if(len==1){
            System.out.println(ps+"0");
            System.out.println(ps+"0");
            return;
        }
        ka(len-1,"0");
        ka(len-1,"1");
    }
}



