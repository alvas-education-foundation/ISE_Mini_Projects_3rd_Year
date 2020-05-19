03. Write a java program to print a number pattern 
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1



import java.util.Scanner; 
public class MainClass
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(&quot;How many rows you want in this pattern?&quot;);
        int rows = sc.nextInt();
        System.out.println(&quot;Here is your pattern....!!!&quot;);
        for (int i = 1; i &lt;= rows; i++) 
        {
            for (int j = 1; j &lt;= i; j++) 
            { 
                System.out.print(j+&quot; &quot;); 
            }
            System.out.println(); 
        }
        for (int i = rows-1; i &gt;= 1; i--)
        {
            for (int j = 1; j &lt;= i; j++)
            {
                System.out.print(j+&quot; &quot;);
            }
             
            System.out.println();
        }
        sc.close();
    }
}