import java.util.*;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        if(A>B){
            System.out.println(">");
        }else if(A<B){
            System.out.println("<");
        }else{
            System.out.println("==");
        }
    }
}