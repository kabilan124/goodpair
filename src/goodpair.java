 class goodPair {
    public int Solution(int[] arr , int b){
        int arrLength = arr.length;
        int i=0;
        int j=arrLength-1;
        int count =0;
        while(i<j){
            if (arr[i]+arr[j] == b){
                count = count+1;
            }
            if(j==i+1)
            {
                i++;
                j=arrLength;
            }
            j--;
        }
        return count;
    }
}
public class goodpair {
    public static void main(String[] args) {
        goodPair answer = new goodPair();
        System.out.println(answer.Solution(new int[]{1, 2, 4},4));

    }
}