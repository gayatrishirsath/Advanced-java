package javaslips;
import java.util.*;
public class slip19a
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> l=new LinkedList();
		System.out.println("Enter limit:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			l.add(sc.nextInt());
		}
		
		System.out.println("Negative integers are:");
        for (int num : l) 
        {
            if (num < 0) 
            {
                System.out.println(num);
            }
        }



	}

}
