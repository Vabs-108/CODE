


class InsertionSort
{
    private int n[]=new int[6];
    public void getArray(int x[])
    {
        n=x;
    }
    public void putArray()
    {
        for(int i = 0 ;i<=n.length-1;i++)
        {
            System.out.print(n[i]+"\t");
        }
    }
    
   
    
    public void qs(int low,int high)
    {
        if(low>high)
            return;
        int pivot,i,j,temp;
        pivot = n[low];
        i = low+1;
        j= high;
        while(i<=j)
        {
            while((i<=high)&& (n[i]<=pivot))
            {
               i++;
            }
            while((j>=low)&&(n[j]>pivot))
            {
                j--;
            }
            if(i<j)
            {
             temp = n[i];
             n[i]=n[j];
             n[j]=temp;
            }
        }
        
        if(low<j)
        {
            temp = n[low];
            n[low]=n[j];
            n[j]=temp;
        }
        
        qs(low,j-1);
        qs(j+1,high);
        
        
    } 
           
    



    public static void main(String[] args) {
        int arr[]={5,89,12,14,8,10};
        InsertionSort obj = new InsertionSort();
        obj.getArray(arr);
        obj.qs(0, arr.length-1);
        obj.putArray();
        
    }
    
}


//====================================================

//merge sort 


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
