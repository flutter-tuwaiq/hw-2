/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinetb;

import static java.time.Clock.system;

/**
 *
 * @author fawzisaleh
 */
public class Hinetb {¸

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
String ii ="*";
		       
// TODO code application logic here
for(int i=0;i<9;i++){  
		      if(i<=4)
		            {
		        System.out.println("*"+ii);ii=ii+"*";
		        }
		         if (i>3){
		          ii= ii.substring(0, ii.length()- 1);
		               System.out.println(ii);

		        }
		        
		            }
	}
	}    
  

    
    
    

