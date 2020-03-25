
public class Casa1 {
    public static void main(String[] args) {
    	
    	
    	String [][] cities = {{"milano","roma","basilea"},{"tokyo","oslo","manchester"}};
    	
    	int count = 0;
    	char compare = 'o';
    	   
    		for(int i = 0;i < cities.length; i++) {
    			
    		 for(int j = 0;j < cities[i].length; j++) {
    		 
    			 String ocities = cities[i][j];
    	
    		 for(int z = 1; z < ocities.length()-1; z++) {
    			char lett= ocities[z].charAt(z);
    			 if (lett == compare) {
    				 count++;
    		System.out.println(count);
    			 }
    		 }
}
    }
}
}