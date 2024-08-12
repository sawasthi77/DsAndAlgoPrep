package org.example.Strings;

public class ReduceString {
    static String reduceString(String str, int k){
        if( k <= 1 || str.isEmpty() || str.length() < k){
            return str;
        }

        StringBuilder sb = new StringBuilder(str);
        boolean reduced;

        do{
            reduced = false;
            int count = 1;

            for(int i = 1; i< sb.length(); i++){
                if(sb.charAt(i) == sb.charAt(i - 1)){
                    count ++;
                }
                else{
                    count = 1;
                }
                if( count == k){
                    sb.delete(i - k + 1, i + 1);
                    reduced = true;
                    break;
                }
            }
        }while(reduced);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reduceString("saumyaaAwaasthiiyaayy",2));
    }
}
