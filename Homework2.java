public class MyClass {

    public static void main(String args[]) {
        
        String star = "*";
        int j = 3 ;
        
        for(int i = 0 ; i < 9 ; i++){
            
            if(i < 4){
                
                System.out.println(star);
                star += "*";
                
            } else if(j > 0) {
                
                System.out.println(star.substring(star.length() - j));
                j--;
                
            }
            
        }

    }
    
}