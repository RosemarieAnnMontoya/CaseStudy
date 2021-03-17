
package com.calculator;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculator {
   @WebMethod
   public int add(int a, int b){
       return a+b;
   }
   @WebMethod
   public int subtract(int a, int b){
       return a-b;
   }
   @WebMethod
   public int multiply(int a, int b){
       return a*b;
   }
   @WebMethod
   public int division(int a, int b){
       return a/b;
   }
}
