package gugudan;
import java.util.Scanner;

public class gugudanJAVA {
    public static int[] calc(int times){
        int[] result = new int[9];
        for(int i=0;i<result.length;i++) {
            result[i]=times* (i+1);
        }
        return result;
    }
    public static void main(String[] args)
    {
        //2단
        Scanner scan= new Scanner(System.in);
        int dan=scan.nextInt();
        int[] result=calc(dan);
        int count = 1;
        for(int e:result){
            System.out.println(e);

        }


    }
}