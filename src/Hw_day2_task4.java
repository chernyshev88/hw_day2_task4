import java.util.Scanner;

public class Hw_day2_task4 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a==0){
            a=10;
        }
        else {
        a = (a>0) ? (a=a+1) : (a=a-2) ;
        }
        System.out.println(a);
    }
}
