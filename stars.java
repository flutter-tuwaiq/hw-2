
public class stars {

   
    public static void main(String[] args) {

            

        
            String s = "*";
            int a = 3 ;
            int x ;
            
            
            
            System.out.println("print stars with one loop       :   ");
            
            
            
                     for ( x = 0; x < 7; x++) {   
               
                              if(s.length()<=4) {                    //check the length of string 
    
                                  
                               System.out.print(s);                            //print stars
    
    
                               System.out.println(" ");      
              
                                s += "*" ;                      //increase stars 
    
                                   
                                }
            
                        
                        
                             else if(s.length()>=3){               // decrease stars
    
                           
                             System.out.println(s.substring(s.length() - a));
                             
                              a--;
            
                              }
            
            
            }
          
        
    }


}
