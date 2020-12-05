package main;
import java.util.StringTokenizer;
import base.*;
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
   public static Integer[] makeToken(String obj){
       Integer array[] = new Integer[6];
       StringTokenizer st = new StringTokenizer(obj, ",");
       int i =0; 
       while(st.hasMoreTokens()){
           array[i] = Integer.valueOf(st.nextToken());
           i++;
        }
          return array;
    }
    
   public static Circle makeCircle(Integer x, Integer y, Integer r){
       return (new Circle(x, y, r));
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
