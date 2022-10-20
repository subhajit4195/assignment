package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class High_Peak {

//this method is used to minimize the value between the high price goodies and low price goodies
    static int minDiff(int array[], int N, int M)
    {
    	//this  inbuilt method gives highest max value in integer 
		  int result = Integer.MAX_VALUE;
		  //shorting arrays
		  Arrays.sort(array);
          for (int i=0; i<= N-M;i++)
        	  //it gives minimum value between two parameters
		    result = Math.min(result, array[i + M - 1] - array[i]);
		  return result;
    }
      /* to distribute goodies,we need to find the element,this method gives the index to find minimum 
        difference between highest and lowest goodies price */
    static int findelements(int res,int array[], int N, int M)
    {
    	//this  inbuilt method gives highest max value in integer 
		  int result = Integer.MAX_VALUE;
		  for(int i=0; i<=N; i++)
		  {
			  // //it gives minimum value between two parameters
		       result = Math.min(result, array[i + M - 1] - array[i]);
		       if (res==result)
		       return i;
		  }
		  return 0;
	}

    public static void main(String[] args) {
    	int count =0;
           //it will continue unlimited time for checking our all inputs
    	while(true) {
    	
           int array[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
           String items[]={ "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" };
           int N = array.length;
           System.out.println("Enter the number of employees : ");
           Scanner s = new Scanner(System.in);
           int M=s.nextInt();
           //calling minDiff methods
           int result=minDiff(array, N, M);
           System.out.println("Number of the employees : "+M);
           //calling find elements method
           int startindex=findelements(result,array,N,M);
           System.out.println("Here the goodies that are selected for distribution are : ");
           for(int i=startindex;i<startindex+M;i++)
           System.out.println(items[i]);
           System.out.println("\n");
           System.out.println("And the difference between the chosen goodies with highest price and the lowest price is : "+result);
           count++;
           //for running loop 3 times as per instruction 
          if(count==3)break;
           
    }
    
    }
}
