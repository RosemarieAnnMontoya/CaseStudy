
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://my.org/ns/")
public class Methods {

public static void main (String [] args) {
sayHelloWorld();

sayHelloTo("Ji Chang Wook");
sayHelloTo("Cha Eun Woo");

int x = returnFive();

System.out.println(x);
}

@WebMethod
static int returnFive() {
return 5;
}
@WebMethod
static void sayHelloTo (String name) {
System.out.println("Hello, " + name);
}

@WebMethod
static void sayHelloWorld() {
System.out.println("Hello, World!");
}
}