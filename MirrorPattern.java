import java.util.Scanner;

public class MirrorPattern 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter line of pyramid : ");
        int n=sc.nextInt();

        for(int row=1; row<=n; row++)
        {
            for(int space=(2*(n-row)); space>=1; space--)
            {
                System.out.print(" ");
            }

            for(int col=1; col<=row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
