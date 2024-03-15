package naeem.secondclass;

import static java.lang.Math.pow;

/**
 *
 * @author Student
 */
public class Secondclass {

    public static void main(String[] args) {
        
//        int year;
//        year = 1600;
//        
//        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
//            System.out.println("Leap Year ");
//        } else {
//            System.out.println("Not Leap Year ");
//        }
//        
//        int base = 3,p = 3;
//        
//        power(base, p);
//        
//        int n = 42 + power(base, p) -10;
//        
//        System.out.println("Value of n = "+n);
//        
//        rec(5);
//        
        profile p1 = new profile();
        p1.firstName="Rup";
        p1.lastName= "Chowdhury";
        p1.email= "rup@gmail.com";
        p1.phone= "01915817061";
        p1.dob= "1/2/1999";
        p1.password= "******";
        
        registration(p1);
    }
    
//    
//    
//    public static int power(int base,int p){
//        
//        int result = 1;
////        result = (int) pow( base,p);   //using power function
////        
////        System.out.println(result);
////        
//        for(int i = 0; i < p; i++){             //using loop
//            result = result * base;
//        }
////        System.out.println(result);
//        
//        return result;
//    }
    
    public static void registration(profile userDetails){
        
       System.out.println("Username: " + userDetails.firstName+ " " + userDetails.lastName );
         System.out.println("Emai: " +userDetails.email);
        System.out.println("Number: "+userDetails.phone);
        System.out.println("Date of birth: "+ userDetails.dob);
        
    }
    
//    public static void rec(int i){
//        if(i<0) return;
//        System.out.println(i);
//        rec(i-1);
//        System.out.println(i);
//    }
}