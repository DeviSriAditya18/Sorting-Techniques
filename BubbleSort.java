public class BubbleSort {
    public static void main(String[] args) throws Exception {
        int a[]={23,45,1,4,75};
        int n=a.length;
        System.out.println("Before sorting:");
        for(int i=0;i<n;i++){
           System.out.println(a[i]);
        }
        for(int i=0;i<n-1;i++){
            int f=0;
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    f=1;
                }
            }
            if(f==0) break;
        }
        System.out.println("After sorting:");
        for(int i=0;i<n;i++){
           System.out.println(a[i]);
        }
    }
}
