// 11653 - 소인수분해
import java.io.*;
import java.util.*;
public class Main {

   public static void main(String[] args) throws IOException {
      
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      
      int num = Integer.parseInt(bf.readLine());
      
      for (int i=2; i<=num; i++) {
         while (num % i == 0) {
            num /= i;
            System.out.println(i);
         }
      }
      bf.close();
   }
}