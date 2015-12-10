
/**
 * Write a description of class ArrayOperations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayOperations
{
    
    public static void main(String[] args) 
    {
        //a
        double [] x= {8, 4, 5, 21, 7, 9, 18, 2, 100}; 
        //b 
        System.out.println("Length;"+x.length);
        //c
        System.out.println("First Item:"+x[0]); 
        //d
        System.out.println("Last Item: "+ x[8]); 
        //e
        System.out.println(x[x.length-1]); 
        for( int i=0; i<x.length; i++) 
        {
            System.out.println(x[i]); 
        }
        for(int i=0; i<x.length; i++)
        {
            System.out.println(i+"\t"+x[i]);
        }    
        for( int i= x.length-1; i>=0; i--) 
        {
            System.out.println(x+"\t"+x[i]);
        }    
        for( double value: x) 
        {
            System.out.println(value);
        }    

        
    }    
    

   
}
