package javaslips;

public class slip1a extends Thread
{
    public void run()
    {
        for (char i = 'A'; i <= 'z'; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(2000);
            } catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) 
    {
        slip1a s = new slip1a();
        s.start();
    }
}
