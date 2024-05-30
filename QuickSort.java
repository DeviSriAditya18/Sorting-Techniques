public class QuickSort {
    static int partition(int a[], int lb, int ub) {
        int pivot = a[lb]; 
        int start = lb;
        int end = ub;
        while (start < end) {
            while (a[start] <= pivot && start < end) start++;
            while (a[end] > pivot) end--;
            if (start < end) {
                int t = a[start];
                a[start] = a[end];
                a[end] = t;
            }
        }
        int t = a[lb];
        a[lb] = a[end];
        a[end] = t;
        return end;  
    }

    static void sort(int a[], int l, int h) {
        if (l < h) {
            int pi = partition(a, l, h);
            sort(a, l, pi - 1);
            sort(a, pi + 1, h);
        }
    }

    static void printArray(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int a[] = {10, 7, 8, 9, 1, 5};
        int n = a.length;

        System.out.println("Before Sorting:");
        printArray(a);

        sort(a, 0, n - 1);

        System.out.println("After Sorting:");
        printArray(a);
    }
}
