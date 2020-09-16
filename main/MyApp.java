package main;
import java.util.StringTokenizer;

/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
   public void makeToken(String data){
       StringTokenizer obj2 = new StringTokenizer(data, ",");
       
       int array[] = new int[5]; 
       for(int i =0; obj2.hasMoreElements(); i++)
       {   
        }
    }
    
   public void makeCircle(){
       
    }
    
    public static void main(String[] args){
       Integer[] array;
       String data = "2,3,4,3,4,10";
       array = makeToken(data);
       Circle c1 = makeCircle(array[0], array[1], array[2]);
       Circle c2 = makeCircle(array[3], array[4], array[5]);
       
       System.out.println("원1 :" + c1 + " ==> 면적 : " + c1.getArea());
       System.out.println("원2 :" + c2 + " ==> 면적 : " + c2.getArea());
       if(c1. equals(c2))
            System.out.println("같은 원" ); 
       else
            System.out.println("서로 다른 원");
    }

}
