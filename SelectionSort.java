public class SelectionSort {
    public static void main(String[] args) throws Exception {
        int a[]={23,45,1,4,75};
        int n=a.length;
        System.out.println("Before sorting:");
        for(int i=0;i<n;i++){
           System.out.println(a[i]);
        }
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min!=i){
                int t=a[i];
                a[i]=a[min];
                a[min]=t;
            }
        }
        System.out.println("After sorting:");
        for(int i=0;i<n;i++){
           System.out.println(a[i]);
        }
    }
}
