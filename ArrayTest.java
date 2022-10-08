public class ArrayTest{
  public static void main(String[]args){
    //int[] anArray = ???
    //1 print the array variable
    System.out.println("part 1:");
    int[] anArray = new int[11];
    System.out.println( anArray );

    //Part 2 Write the loop to initialize it
    //print anArray[0], anArray[5], anArray[11] to see if it worked
    System.out.println("part 2:");
    for (int i=0; i < anArray.length; i++){
      anArray[i] = 100 + 10*i;
    }
    System.out.println(anArray[0]);
    System.out.println(anArray[5]);
    System.out.println(anArray[10]);
    // System.out.println(anArray[11]); out of bound error

    //Part 3 Write a loop to print it out (on one line)
    System.out.println("part 3:");
    for (int i=0; i < anArray.length; i++){
      System.out.println( anArray[i] );
    }
  }
}
