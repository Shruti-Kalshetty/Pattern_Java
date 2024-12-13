import java.util.Scanner;

public class MirrorPatternreverse 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line of pyramid : ");
        int n=sc.nextInt();

        for(int row=1; row<=n; row++)
        {
            for(int space=((n-row)); space>=1; space--)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++)
            {
                System.out.print("* ");
            }
            System.err.println();
        }
    }
}
