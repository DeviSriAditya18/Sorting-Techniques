public class QuickSort {
    int partition(int a[], int lb, int ub)
    {
        int pivot = a[ub]; 
        int i = (lb-1); 
        for (int j=lb; j<ub; j++)
        {
            if (a[j] <= pivot)
            {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i+1];
        a[i+1] = a[ub];
        a[ub] = t;
 
        return i+1;
    }

    void sort(int a[], int l, int h)
    {
        if (l < h)
        {
            int pi = partition(a, l, h);
            sort(a, l, pi-1);
            sort(a, pi+1, h);
        }
    }
 

    static void printArray(int a[])
    {
        int n = a.length;
        for (int i=0; i<n; ++i)
            System.out.print(a[i]+" ");
        System.out.println();
    }
 
    // Driver program
    public static void main(String args[])
    {
        int a[] = {10, 7, 8, 9, 1, 5};
        int n = a.length;

        System.out.println("Before Sorting:");
        printArray(a);
 
        App ob = new App();
        ob.sort(a, 0, n-1);
 
        System.out.println("After Sorting:");
        printArray(a);
    }
}

