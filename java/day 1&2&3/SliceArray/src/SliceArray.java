import java.util.Arrays;   
public class SliceArray  
{   public static int[] getSlice(int[] array, int startIndex, int endIndex)   
{   
int[] slicedArray = new int[endIndex - startIndex];   
for (int i = 0; i < slicedArray.length; i++)   
{   
slicedArray[i] = array[startIndex + i];   
}   
return slicedArray;   
}   
public static void main(String args[])   
{   
int[] array = {23, 56, 78, 22, 45, 90, 67, 91, 0, 31};   
int startIndex = 3, endIndex = 8;   
int[] slicedArray = getSlice(array, startIndex, endIndex + 1);   
System.out.println("Slice of Array: "+Arrays.toString(slicedArray));   
}   
}  