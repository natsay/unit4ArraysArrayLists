
/**
 * Write a description of class ArrayOperations2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayOperations2
{
    private int [] values; 
    public ArrayOperations2(int [] intialValues) 
    {
        values=intialValues; 
    }
    public void swapFirstAndLast() 
    {
        int j= values.length-1;
        int temp=values[0];
        values[0]=values[j];
        values[j]=temp;

    }
    public void shiftRight() 
    {
       for(int i=0,j=values.length-1;i<j;i++,j--)
       {
           int temp= values[i]; 
           values[i]=values[j]; 
           values[j]=temp;
       } 
    }
    public void evenZero()
    {
        for( int i=0; i<values.length; i++) 
        {
            if( values[i]%2==0) 
            {
                values[i]=0;
            }    
        }    
    } 
    
    public void replaceLarger() 
    {
        for (int i = 1; i < values.length - 1; i++) 
        {
            if (values[i + 1] > values[i - 1]) 
            {
                values[i] = values[i + 1];
            } else if (values[i - 1] > values[i + 1])
            {
                values[i] = values[i - 1];
            }
        }   
    } 
    
    public void middleRemove() 
    {
        int middle = values.length / 2;
        if (values.length % 2 == 0) 
        {
            for (int i = middle; i < values.length - 1; i++) 
            {
                values[i - 1] = values[i + 1];
            }
            values[values.length - 1] = 0;
            values[values.length - 2] = 0;
        } 
        else if (values.length % 2 == 1) 
        {
            for (int i = middle; i < values.length - 1; i++) 
            {
                values[i] = values[i + 1];
            }
            values[values.length - 1] = 0;
        }
        
    }    
        public static void moveEvenElements(int[] values) {
        int swapPos = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                int temp = values[swapPos];
                values[swapPos] = values[i];
                values[i] = temp;
                swapPos += 1;
            }
        }
    }

    // G
    public static int secondLargestElement(int[] values) 
    {
        int largest = values[0];
        int secondLargest = largest;
        for (int i = 0; i < values.length; i++) 
        {
            if (values[i] > largest) 
            {
                int temp = largest;
                largest = values[i];
                secondLargest = temp;
            }
        }
        return secondLargest;
    }

    // H
    public static boolean isSorted(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // I
    public static boolean hasAdjacentDuplicates(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) 
            {
                return true;
            }
        }
        return false;
    }

    // J
    public static boolean hasDuplicateElements(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (i != j && values[i] == values[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

 
   

