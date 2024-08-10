/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int i = 0;
		int length = args.length();
		int[] num = new int[length];
		
		while(i<length)
		{
		    args[i] = Integer.parseInt(args[i]);
		    i++;
		}
		
		int temp= 0,j = 0;
		i = 0;
		
		while(i<length)
		{
		    j = 0;
		    while(j<length)
		    {
		        if(num[i] < num[j])
		        {
		            temp = num[i];
		            num[i] = num[j];
		            num[j] = temp;
		        }
		        j++;
		    }
		    i++;
		}
		
		i = 0;
		while(i<length)
		{
		    System.out.println(num[i]);
		    i++;
		}
	}
}
