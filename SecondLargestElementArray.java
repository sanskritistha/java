
public class SecondLargestElementArray {
    public static void main(String[] args) {
        int a[]={2,4,6,8,8,3};
        int max1=a[0];
        int max2=a[1];
     for(int i:a){
         if(i>max1){
        max2=max1;
        max1=i;
         }else if( i>max2&&i!=max1){
             max2=i;
         }           
     }
        System.out.println("the second largest element in the array is:"+max2);       
                
    }
}
    

