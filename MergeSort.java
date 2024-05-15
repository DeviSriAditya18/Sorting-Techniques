public class MergeSort {
    public static void main(String[] args) throws Exception {
        int a[]={23,45,1,4,75};
        int n=a.length;
        int lb=0;
        int ub=n-1;
        System.out.println("Before sorting:");
        print(a,n);
        System.out.println();
        mergeSort(a,lb,ub);
        System.out.println("After sorting:");
        print(a,n);
    }
    static void mergeSort(int a[],int lb,int ub){
        if(lb<ub){
            int m=(lb+ub)/2;
            mergeSort(a,lb,m);
            mergeSort(a,m+1,ub);
            merge(a,lb,m,ub);
        }
    }
    static void merge(int a[],int lb,int m,int ub){
        int i=lb;
        int j=m+1;
        int k=lb;
        int n=a.length;
        int b[]=new int[n];
        while(i<=m&&j<=ub){
            if(a[i]<=a[j]){
               b[k]=a[i];
               i++;
            }
            else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(i>m){
            while(j<=ub){
                b[k]=a[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=m){
                b[k]=a[i];
                i++;
                k++;
            }
        }
        for(k=lb;k<=ub;k++){
            a[k]=b[k];
        }
    }
    static void print(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
