import java.util.*;
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if(input!=42)
        {
            System.out.println(input);
        }

        while(input!=42)
        {
             input = sc.nextInt();

             if(input!=42)
             {
                System.out.println(input);
             }   

        }
    }
}
