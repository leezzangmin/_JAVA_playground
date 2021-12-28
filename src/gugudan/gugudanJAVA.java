package gugudan;
import java.util.Scanner;

public class gugudanJAVA {
    public static void main(String[] args)
    {
        //2단
        Scanner scan= new Scanner(System.in);
        int dan;
        dan=scan.nextInt();
        int result;
        for(int i=1;i<10;i++) {
            result = dan * i;
            System.out.println(result);


        }
    }
}