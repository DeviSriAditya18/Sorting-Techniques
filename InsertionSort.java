public class InsertionSort {
    public static void main(String[] args) throws Exception {
        int a[]={23,45,1,4,75};
        int n=a.length;
        System.out.println("Before sorting:");
        for(int i=0;i<n;i++){
           System.out.println(a[i]);
        }
        for(int i=1;i<n;i++){
            int t=a[i];
            int j=i-1;
            while(j>=0&&a[j]>t){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=t;
        }
        System.out.println("After sorting:");
        for(int i=0;i<n;i++){
           System.out.println(a[i]);
        }
    }
}
