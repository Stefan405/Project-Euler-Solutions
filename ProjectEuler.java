import java.io.*;
import java.util.*;

import java.lang.Math;
public class Euler{
  public static void main(String[] args){
    
    //System.out.println(three_five());
    //int i = 0;
    //int counter = 0;
    //while(golden_ratio(i) <= 4000000){
      //counter += golden_ratio(i);
      //i += 3;
    //}
    //System.out.println(counter);
    //System.out.println(largest_prime());
    //System.out.println(nth_prime(10001));
    //System.out.println(pythag_trip_1000());
    //System.out.println(prime_sum(600000));
    //int[] a = {2,4,3,4,10,6,5,4,5,6,7,8,1};
    //System.out.println(array_max(a));
    System.out.println(triangular_divisors(500));
  }
  
  //So for q11 we need to create a 2D array (matrix) and fill it with the numbers. Copy and paste the numbers in and treat the numbers as pairs.
  //Then work out how to solve the problem :/
  
  
  public static int smallest_multiple(){
    int i = 1;
    while(i<1000000000){
      if((i%1==0)&&(i%2==0)&&(i%3==0)&&(i%4==0)&&(i%5==0)&&(i%6==0)&&(i%7==0)&&(i%8==0)&&(i%9==0)&&(i%10==0)&&(i%11==0)&&(i%12==0)&&(i%13==0)&&(i%14==0)&&(i%15==0)&&(i%16==0)&&(i%17==0)&&(i%18==0)&&(i%19==0)&&(i%20==0)){
        return i;
      }
      i++;
    
    }
    return 1;
 }
  
  
  public static int array_max(int[] a){
    int max = a[0];
    for(int counter = 1;counter<a.length;counter++){
      if(a[counter]>max){
        max = a[counter];
      }
    }
    return max;
  }
  
  //public static int[][] create_matrix(){
    //int n = 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static double sum_squares(int n){
    double sum_of_squares = 0;
    int sum = 0;
    for(int i = 1; i<=n;i++){
      sum_of_squares = sum_of_squares + Math.pow(i,2);
      sum = sum + i;
      
    
    }
    double square_sum = Math.pow(sum,2);
    return square_sum - sum_of_squares;
  }
  
  public static boolean is_prime(int n){
    if(n==1){
        return false;}
    for(int i = 2; i<=Math.pow(n,0.5);i++){
      if(n%i==0){
        return false;
      }
    
    }
    return true;
  }
  
  public static int nth_prime(int n){
    int count = 0;
    for(int i = 1; i<1000000000; i++){
      if(is_prime(i)==true){
        count = count + 1;
      }
      if(count == n){
        return i;
      }
    }
    return 1;
  }
  
  public static int pythag_trip_1000(){
    for(int i = 0;i<500;i++){
      for(int j = 0;j<500;j++){
        for(int z = 0;z<500;z++){
          if((Math.pow(i,2)+Math.pow(j,2)==Math.pow(z,2))&&(i+j+z==1000)){
            return i*j*z;
          }
        }
      }
    }
    return 1;
  }
  
  public static int prime_sum(int n){
    int count = 0;
    int i = 0;
    while(i<n){
      if(is_prime(i)==true){
        count = count + i;
      }
      i++;
    }
    return count;
  }
  
  public static int triangular_divisors(int n){
    for(int i = 0;i<1000000000;i++){
      int triangular_number = 0;
      int divs = 0;
      for(int j = 0;j<=i;j++){
        triangular_number = triangular_number + j;
      }
      for(int x = 1; x<=triangular_number; x++){
        if(triangular_number%x == 0){
          divs = divs + 1;
        }
        if(divs >= n){
          return triangular_number;
        }
      }
    }
    return -1;
  }
  
        
            
          
  
         
             
    
  
        
        
  
    
        
      
        
      
        
      
  
      
      
        
      
      
   
  
  
  
  
  
  
  public static int three_five(){
    int count = 0;
    for(int i = 0; i<1000; i++){
      if(i%3 == 0 || i%5 == 0){
        count += i;}
    }
    return count;
  }
  
  public static double golden_ratio(int n){
    double ans = ((Math.pow(1.618034,n))-(Math.pow(-0.618034,n)))/Math.sqrt(5);
    int fin = (int)ans;
    return fin;
    
  }
}
      
//So basically we just need to use a while loop and increment i every 3 ints and use golden_ratio to calculate the number and then add it to count!! Yay go Stefan!!
      
  
 // public static int fibonacci(){
//    int[] array = new int[4000000];
  //  for(int i = 0; i<array.length; i++){
    //  array[i] = 
