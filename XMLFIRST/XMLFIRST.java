
import java.math.BigInteger;

import nu.xom.Attribute;
import nu.xom.Document;
import nu.xom.Element;
import java.io.*;




/**
 * <p>
 * Demonstrates the creation of a simple xml document
 * with basic nested element structure and some attributes
 * on the elements.
 * </p>
 * 
 * @author Elliotte Rusty Harold
 * @version 1.0
 *
 */
public class XMLFIRST{

  public static void main(String[] args) {
   
	  file = new 
	  
	  BigInteger low  = BigInteger.ONE;
      BigInteger high = BigInteger.ONE;      
      
      Element root = new Element("Fibonacci_Numbers");  
      for (int i = 1; i <= 10; i++) {
        Element fibonacci = new Element("fibonacci");
        fibonacci.appendChild(low.toString());
        Attribute index = new Attribute("index", String.valueOf(i));
        fibonacci.addAttribute(index);
        root.appendChild(fibonacci);
        
        BigInteger temp = high;
        high = high.add(low);
        low = temp;
      }
      Document doc = new Document(root);
      System.out.println(doc.toXML());  
      StringXMLFileName = 
  }

}