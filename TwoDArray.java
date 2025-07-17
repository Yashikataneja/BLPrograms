import java.util.Scanner;

/* print the twod array using scanner class*/

public class TwoDArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("enter the ele of array: ");
        int arr[][]=new int[n][n];
        int i;
        int j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the array is: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
