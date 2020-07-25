import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
 class Giftt{
	       public void sorted(String choco[]) {
	      int len=choco.length,min;
				int i,j;
	           for(i=0;i<len-1;i++)
						  {
	        	   min=i;
	             for(j=i+1;j<choco.length;j++)
							  {
	        	          if(Integer.parseInt(choco[min])>Integer.parseInt(choco[j]))
	        		             min=j;
	               }
	            String t=choco[i];
	            choco[i]=choco[j];
	            choco[j]=t;
	            }
        for(int k=0;k<len-1;k++)
	      System.out.println(choco[k]);
	       }
}
//count sweets.
 class  Sweets{
	    public void totalsweets(String sweet[]) {
	    System.out.println("No.of sweets present are :"+(sweet.length));

	    }
	}

//sum of rest of choco and sweet weights.
 class Wei_Of_Sweets{
	    public void totalweisweets(String  choco[], String  sweet[]) {
	    System.out.println("Weight of strings:"+(choco.length+sweet.length));
	    }
	}

//main method
public class Gift{
   	public static void main(String args[]) {
   	Scanner s = new Scanner(System.in);
   	int n,cou,cou2,i;
	  String choco[] = new String[5];
	  String sweet[] = new String[5];
	  cou=s.nextInt();
	  for(i=0;i<cou;i++)
		 {
	       System.out.print("Enter chocolate name:");
	       choco[i]=s.next();
	   }
	  System.out.print("enter chocolate count:");
	  cou2=s.nextInt();
   	for(i=0;i<cou2;i++)
	  {
	   System.out.print("Enter Candy name:");
	   sweet[i]=s.next();
	  }
	  Giftt g=new Giftt();
  	g.sorted(choco);
  	Sweets swt=new Sweets();
	  swt.totalsweets(sweet);
		Wei_Of_Sweets ws=new Wei_Of_Sweets();
   	ws.totalweisweets(choco, sweet);
	}
	}
