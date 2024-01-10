//The program outputs the index of the largest value in the array
public class CommonArrayAlgorithms {
    public static void main(String[] Args){
        int[] numArray={23,41,23,5323,1234,234,21,0};
        int max=-9999;
        int index=0;
        //Going through the array and update both the maximum value and index
        for(int i=0;i<numArray.length;i++){
            if(numArray[i]>max){
                max=numArray[i];
                index=i;
            }
        }
        System.out.println(index);
    }
}
