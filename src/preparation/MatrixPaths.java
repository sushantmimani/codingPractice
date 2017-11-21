package preparation;

import java.util.Arrays;

public class MatrixPaths {



    static public int count(int [][] arrA, int row, int col){

        if(row==arrA.length-1 && col==arrA[0].length-1){
            return 1;
        }
        int right =0;
        int down = 0;
        if(row!=arrA.length-1 && arrA[row+1][col]!=0){
            right = count(arrA, row+1, col);
        }
        if(col!=arrA[0].length-1 && arrA[row][col+1]!=0){
            down = count(arrA, row, col+1);
        }
        return (right + down)%(int)(Math.pow(10,9)+7);
    }


    static public int countDP(int [][] arr){
        int result [][] = new int[arr.length][arr[0].length];
        for (int i = 1; i <result.length ; i++) {
            for (int j = i; j <result[0].length ; j++) {
                if(arr[i][j]!=0){
                    result[i][j]+=1;
                    if(arr[i-1][j]>0)
                        result[i][j]+=arr[i-1][j];
                    if(arr[i][j-1]>0)
                        result[i][j]+=arr[i][j-1];
                }
            }
        }

        System.out.println(Arrays.toString(result[0]));
        System.out.println(Arrays.toString(result[1]));
        System.out.println(Arrays.toString(result[2]));

        return (result[arr.length-1][arr[0].length-1]) %(int)(Math.pow(10,9)+7);
    }
    public static void main(String[] args) {
//        int[][] a = {{1,1,1},{1,0,1},{1,0,1}};
        int[][] a = {{1,1,1,1},{1,1,1,1},{1,1,1,1}};
//        System.out.println(count(a,0,0));
        System.out.println(countDP(a));

    }

}
