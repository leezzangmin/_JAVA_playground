package gugudan;
import java.util.Scanner;

public class gugudanJAVA {
    public static void main(String[] args)
    {
        //2단
        Scanner scan= new Scanner(System.in);
        int dan=scan.nextInt();
        int[] result=new int[9];
        int count = 1;
        for (int i=0;i<result.length;i++){
            result[i] = dan * count;
            count++;
            System.out.println(result[i]);
        }


    }
}