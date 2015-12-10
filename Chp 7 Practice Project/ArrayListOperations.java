
import java.util.ArrayList;

public class ArrayListOperations
{
    public static void main(String[] args) 
    {
        ArrayList<String> names= new ArrayList<String>(); 
        names.add(0,"Alice"); 
        names.add(1,"Bob");
        names.add(2,"Connie"); 
        names.add(3,"David"); 
        names.add(4,"Edward");
        names.add(5,"Fran"); 
        System.out.println("All Names:"+names);
        String firstname= names.get(0); 
        String lastname= names.get(names.size()-1);
        System.out.println("First Name:"+firstname+"Last Name:"+ lastname ); 
        System.out.println("Size:"+names.size()); 
        names.set(0,"Alice B.Toklas") ;
        System.out.println("Updated List"+ names); 
        
        for(String values: names) 
        {
            System.out.println("Enhance For Loop:"+ values); 
            
        }
        
        ArrayList<String>temp=new ArrayList<String>();
        ArrayList<String>names2=new ArrayList<String>(); 
        temp=names;
        names2=temp;
     
        
        names.remove(0); 
        System.out.println(names); 
        System.out.println(names2);
        
        
        
        
        
        
    }    
}    