import java.util.Scanner;

public class Main {
    public static void Recomender(double Percentage, int Backlog, String Name)
    {   int a;
        if (Percentage>=60 && Backlog==0)
        {
            System.out.println("Mr."+Name+" "+"we're recommending you for the placements");
        }
        else
        {
            System.out.println("Sorry Mr."+Name+" "+"you are not eligible for the placement criteria");
            System.out.println();
            if (Percentage<=60 && Backlog!=0)
            {
                System.out.println("because your percentage is "+Percentage);
                if (Backlog==1)
                    System.out.println("and you have "+Backlog+" Backlog");
                else
                    System.out.println("and you have "+Backlog+" Backlogs");
            }
            else if (Percentage<=60)
            {
                System.out.println("because your percentage is "+Percentage);
                System.out.println("and for the placement you're percentage should be greater than 60%");
            }
            else
            {
                System.out.println("because you have "+Backlog+" Backlogs");
            }
        }
    }



    public static void main(String[] args)  {
        float sum = 0; double pr = 0; int back = 0;
        Scanner r = new Scanner(System.in);
        Student s = new Student();

        System.out.println("input your name");
        s.name = r.nextLine();
        String n = s.name;

        System.out.println("input marks in your all five subjects");
        for (int i = 0; i<5 ; i++)
        {
            s.arr[i] = r.nextFloat();
            try
            {
                if (s.arr[i]<=0 && s.arr[i]>=100)
                {
                    throw new Xcptn("invalid input");
                }
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            sum = sum + s.arr[i];
        }

        for (int j = 0; j<5 ; j++)
        {
            if (s.arr[j]<40)
            {
                back++;
            }
        }
        pr = (sum/500)*100;
        Recomender(pr,back,n);
    }
}
