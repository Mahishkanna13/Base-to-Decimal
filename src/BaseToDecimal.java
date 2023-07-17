import java.util.Scanner;

public class BaseToDecimal {
    public static int Conversion(String number,int base)
    {
        int sum=0;
        int n=number.length();
        for(int i=0;i<number.length();i++)
        {
            int temp=Integer.parseInt(String.valueOf(number.charAt(n-i-1)));
            sum+=temp*Math.pow(base,i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String number= scanner.nextLine();
        int base= scanner.nextInt();
        System.out.println(Conversion(number,base));
    }
}
