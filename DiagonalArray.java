import java.util.*;
public class DiagonalArray {
     public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a[][]=new int[4][4];
         System.out.println("enter 4*4 matrix");
          for(int i=0;i<4;i++)
          {
              for(int j=0;j<4;j++){
                  a[i][j]=ob.nextInt();
              }
          }
         
         
          System.out.println("diagonal matrices is:");
          for(int i=0;i<4;i++)
          {
              for(int j=0;j<4;j++){
                  if(i==j){
                      System.out.println(a[i][j]);
                  }
                  }
              }
    
}
}

    

