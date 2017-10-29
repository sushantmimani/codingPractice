package preparation;

import java.util.*;

public class Boggle {

    static String word[] = {"a", "ac","adc"};
    static List<String> words = new ArrayList<String>(Arrays.asList(word));

    static void findWords(char[][] boggle, boolean[][] visited, String str, int i, int j){

        visited[i][j] = true;
        str+=boggle[i][j];
        if(words.contains(str)){
            System.out.println(str);
        }
        for(int k=i-1;k<=i+1 && k<boggle.length;k++){
            for(int l=j-1;l<=j+1 && l<boggle[0].length;l++){

                // This ensures that we can visit all 8 adjacent neighbours
                if(k>=0 && l>=0 && !visited[k][l]){

                // This avoids the diagonal neighbours
//                    if(k>=0 && l>=0 && !visited[k][l] && (Math.abs(k-i)!=1 || Math.abs(l-j)!=1)){
                    findWords(boggle, visited, str, k, l);
                }
            }
        }


            visited[i][j]=false;
    }

    static void findWords(char[][] boggle){
        boolean visited [][] = new boolean[boggle.length][boggle[0].length];
        for(int i=0;i<boggle.length;i++){
            String str = "";
            for(int j=0;j<boggle[0].length;j++){
                findWords(boggle, visited, str, i,j);
            }
        }
    }

    public static void main(String[] args) {
        char boggle[][] = {{'a','b'},
                            {'c','d'}};

        findWords(boggle);
    }
}
