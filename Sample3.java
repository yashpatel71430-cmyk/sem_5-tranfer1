import java.util.*;

abstract class Consumer
{
    int units;
    double billamt;

    abstract void input();
    abstract void calculateBill();
}

class Domestic extends Consumer
{
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units for Domestic: ");
        units = sc.nextInt();
    }

    void calculateBill()
    {
        if(units <= 100)
            billamt = units * 3;
        else
            billamt = (100 * 3) + ((units - 100) * 5);

        System.out.println("Domestic Bill: " + billamt);
    }
}

class Commercial extends Consumer
{
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units for Commercial: ");
        units = sc.nextInt();
    }

    void calculateBill()
    {
        billamt = units * 8;
        System.out.println("Commercial Bill: " + billamt);
    }
}


class Sample3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Consumer[] c = new Consumer[5];

        
        for(int i = 0; i < c.length; i++)
        {
            System.out.print("Enter type (D for Domestic / C for Commercial): ");
            char ch = sc.next().charAt(0);

            ch = Character.toUpperCase(ch);

            if(ch == 'D')
                c[i] = new Domestic();
            else
                c[i] = new Commercial();

            c[i].input();   
        }

        System.out.println("\n===== BILL DETAILS =====");

        
        for(int i = 0; i < c.length; i++)
        {
            System.out.println("Consumer " + (i+1) + ":");
            c[i].calculateBill();
        }
    }
}