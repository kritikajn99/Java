import java.util.*;
public class Duck
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number to be checked.");
        int num=ob.nextInt();

        boolean duck=false;
        int temp=num;
        while(temp!=0)
        {
            int lastdigit=temp%10;
            if(lastdigit==0)
            {
                duck=true;
                break;
            }
            temp=temp/10;
        }
        if(duck==true)
        {
            System.out.println(num+" is a Duck Number.");
        }
        else
        {
            System.out.println(num+" is not a Duck Number.");
        }
    }
}

