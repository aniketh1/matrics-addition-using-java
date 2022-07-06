import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        int[][] a = {{0,0},{0,0}};
        int[][] b = {{0,0},{0,0}};
        int[][] c = {{0,0},{0,0}};
        System.out.println("Enter the values for 2x2 matrix : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<a.length;i++){
            System.out.println(i+1+"  round values :");
            for(int j = 0;j<a.length;j++){
                System.out.print("Enter the "+(j+1)+" value : ");
                a[i][j] = sc.nextInt();

            }
        }
        for (int[] ints : a) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }

        // This is the section of b matrics
        System.out.println("====This is b matrics====");
        for(int i = 0;i<a.length;i++){
            System.out.println(i+1+"  round values :");
            for(int j = 0;j<a.length;j++){
                System.out.print("Enter the "+(j+1)+" value : ");
                b[i][j] = sc.nextInt();

            }
        }
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("====This is c matrics====");
        for(int i = 0;i<a.length;i++){

            for(int j = 0;j<a.length;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+"\t");

            }
            System.out.println();
        }

    }


}

/*
* The logic is in the first loop the i will be o and the inner loop which is j ,it is also 0 and again the loop runs j becomes 1 and i will be 0
* next the j loop breaks and it comes out and run the i loop then i becomes 1 and now j is 0 and again the j loop runs and the j becomes 1
* there fore the logic is 00 01 and 10 11
* */
