public class challenge
{
	public static void main(String[] args) {
		
		String star="*";
		
		        for(int i=0;i<9;i++){  
		            if(i<3)
		            {
		        System.out.println(star);
		        star=star+"*"; 
		        }
		        else if (i>4){
		            System.out.println(star);
		          star= star.substring(0, star.length() - 1); 
		            
		        }
		        
		            }
	}
	}