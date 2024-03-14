package Q1;
import java.util.*;

public class Q1 {
    public class math{
        public static void operation(int w, int h){
            System.out.println(w*h);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int w=scan.nextInt();
    	int h=scan.nextInt();
        math.operation(w, h);
        scan.close();
    }
}