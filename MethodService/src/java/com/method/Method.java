package com.method;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Method {
   @WebMethod
   public int name (int Marie, int Montoya){
       return Marie+Montoya;
   }
   @WebMethod
   public int age (int forty, int twenty){
       return forty-twenty;
   }
   @WebMethod
   public int course (int bsit, int bscs){
       return bsit/bscs;
   }
   @WebMethod
   public int school(int TSU, int PSU){
       return TSU/PSU;
   }
}