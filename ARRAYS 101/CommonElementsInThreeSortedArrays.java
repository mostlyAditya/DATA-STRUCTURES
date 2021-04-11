package arrays;
/* Difficulty : Easy
 * https://practice.geeksforgeeks.org/problems/common-elements1132
 */
import java.util.ArrayList;

public class CommonElementsInThreeSortedArrays {
	
	static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
       ArrayList<Integer> al = new ArrayList<Integer>();
       int i = 0, j = 0, k = 0;
        
       while(i<n1 && j<n2) {
           if(k >= n3) break;
           
           if(A[i] > B[j]) j++;
           
           else if(A[i] < B[j]) i++;
            
           else {
                if(A[i] > C[k])  k++;
                
                else if(A[i] < C[k]) {
                    i++;
                    j++;
                } 
                else {
                    if(al.size() == 0) {
                        al.add(A[i]);
                    }
                    else if(al.get(al.size() - 1) != A[i]) {
                        al.add(A[i]);
                    }
                    i++;
                    j++;
                    k++;
                }
               
           }
       }
       return al;
       
    }

	public static void main(String[] args) {
		int n1 = 6; 
		int A[] = {1, 5, 10, 20, 40, 80};
		int n2 = 5; 
		int B[] = {6, 7, 20, 80, 100};
		int n3 = 8; 
		int C[] = {3, 4, 15, 20, 30, 70, 80, 120};
		
		ArrayList<Integer> res = commonElements(A, B, C, n1, n2, n3);
		 if (res.size() == 0)
         {
             System.out.print(-1);
         }
         else 
         {
             for (int i = 0;i < res.size();i++)
             {
                 System.out.print(res.get(i) + " ");
             }    
         }
	}

}
