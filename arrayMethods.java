// classwork from 2022-10-05
public class arrayMethods{
  public static void main(String[] args){
    System.out.println("tests");
    int[] array1 = {1,2,3};
    int[] array2 = {4,5,6};
    System.out.println( aryToString(returnCopy(array1)) );
    System.out.println( array1 != returnCopy(array1) );
    System.out.println( aryToString(returnCopy(array2)) );
    System.out.println( array2 != returnCopy(array2) );
    System.out.println( aryToString(concatArray(array1,array2)) );

  }

  public static int[] returnCopy(int[] ary){
    int[] result = new int[ary.length];
    for (int i=0; i < ary.length; i++){
      result[i] = ary[i];
    }
    return result;
  }

  public static int[] concatArray(int[]ary1, int[] ary2){
    int[] result = new int[ary1.length+ary2.length];
    for (int i=0; i < ary1.length; i++){
      result[i] = ary1[i];
    }
    for (int k=ary1.length; k < ary2.length; k++ ){
      result[k] = ary2[k-ary1.length];
    }
    return result;
  }

  public static String aryToString(int[] nums){
    String result = "{";
    for (int i=0; i < nums.length; i++){
      if (i == nums.length-1){
        result += nums[i];
      }else{
        result += nums[i] + " ,";
      }
    }
    return result + "}";
  }

}
