import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Map2 {

	private int [][] map1=new int [9][9];
	private int [][] map2=new int [9][9];
	private int [][] map3=new int [9][9];
	private int [][] map4=new int [9][9];
	private int [][] map5=new int [9][9];
	


public void dosyaOku() {
	
	int i=0;
	int sayac1=1;
    int sayac2_baslangic=10;
	int sayac3=1;
	int sayac4=10;
	int sayac5=1;

	  try
      {
          BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\mehmet\\Desktop\\map.txt"));
          
          

          try {
			for(String satir ; (satir = r.readLine()) != null; )
			  {
				/*if(i>8) {
				  break;
			  }*/
				  if (satir.length()==18 && i<6) {
					  
					  for(int j=0;j<9;j++) {
						  if((satir.substring(sayac1-1,sayac1).equals("*")) || (satir.substring(sayac2_baslangic-1,sayac2_baslangic).equals("*"))) {
							  map1[i][j]=0;
							  map2[i][j]=0;
						  }
						  else {
						  map1[i][j]=Integer.parseInt(satir.substring(sayac1-1,sayac1));
						  map2[i][j]=Integer.parseInt(satir.substring(sayac2_baslangic-1,sayac2_baslangic));}
						  sayac1++;
						  sayac2_baslangic++;
						  if(sayac1>9 || sayac2_baslangic>18) {
							  sayac1=1;
							  sayac2_baslangic=10;
						  }
						 
					  
					  }
						  
				  }
				  if(satir.length()==21 && (i>=6 && i<9)) {
					  sayac2_baslangic=13;
					  for(int j=0;j<9;j++) {
						  if((satir.substring(sayac1-1,sayac1).equals("*")) || (satir.substring(sayac2_baslangic-1,sayac2_baslangic).equals("*")) ) {
							  map1[i][j]=0;
							  map2[i][j]=0;
						  }
						  else {
						  map1[i][j]=Integer.parseInt(satir.substring(sayac1-1,sayac1));
						  map2[i][j]=	Integer.parseInt(satir.substring(sayac2_baslangic-1,sayac2_baslangic));}
						 
						  sayac1++;
						  sayac2_baslangic++;
						  if(sayac1>9 || sayac2_baslangic >21  ) {
							  sayac1=1;
							  sayac2_baslangic=13;
						  }
					  }
				  }
				  
				  
 if (satir.length()==18 && (i>14 && i<21)) {
				
					  for(int j=0;j<9;j++) {
						  if((satir.substring(sayac3-1,sayac3).equals("*")) || (satir.substring(sayac4-1,sayac4).equals("*")) ) {
							  map3[i-12][j]=0;
							  map4[i-12][j]=0;
						  }
						  else {
						  map3[i-12][j]=Integer.parseInt(satir.substring(sayac3-1,sayac3));
						  map4[i-12][j]=Integer.parseInt(satir.substring(sayac4-1,sayac4));}
						  sayac3++;
						sayac4++;
						  if(sayac3>9 || sayac4>18) {
							  
							  sayac3=1;
						sayac4=10;
							
						  }
					  
					  }
				
					
					
				  }
 
 if(satir.length()==21 && (i>=12 && i<15)) {
	 sayac4=13;
	  for(int j=0;j<9;j++) {
		  if((satir.substring(sayac3-1,sayac3).equals("*")) || (satir.substring(sayac4-1,sayac4).equals("*")) ) {
			  map3[i-12][j]=0;
			  map4[i-12][j]=0;
		  }else {
		  map3[i-12][j]=Integer.parseInt(satir.substring(sayac3-1,sayac3));
		  map4[i-12][j]=Integer.parseInt(satir.substring(sayac4-1,sayac4));}
		  sayac3++;
		  sayac4++;
		  if(sayac3>9 || sayac4>21 ) {
			  sayac3=1;
			 sayac4=10;
		  }
	  }
 }
 
  if(satir.length()==21 && i>5 && i<9) {
	 sayac5=7;
	 for(int j=0;j<9;j++) {
		  if((satir.substring(sayac5-1,sayac5).equals("*")) ) {
			  map5[i-6][j]=0;
			 
		  }else {
		  map5[i-6][j]=Integer.parseInt(satir.substring(sayac5-1,sayac5));}
		  sayac5++;
		  if(sayac5>15) {
			  sayac5=7;
		  }
	  }
 }
  
 if(satir.length()==9 && i>8 && i<12) {
	 sayac5=1;
	 for(int j=0;j<9;j++) {
		 if((satir.substring(sayac5-1,sayac5)).equals("*") ) {
			  map5[i-6][j]=0;
			 
		  }else {
		  map5[i-6][j]=Integer.parseInt(satir.substring(sayac5-1,sayac5));}
		  sayac5++;
		  if(sayac5>9) {
			  sayac5=1;
		  }
	  }
 }
 
 if(satir.length()==21 && i>11 && i<15) {
	 sayac5=7;
	 for(int j=0;j<9;j++) {
		 if((satir.substring(sayac5-1,sayac5)).equals("*")) {
			  map5[i-6][j]=0;
			 
		  }else {
		  map5[i-6][j]=Integer.parseInt(satir.substring(sayac5-1,sayac5));}
		  sayac5++;
		  if(sayac5>15) {
			  sayac5=7;
		  }
	  }
}
			    
			     
			    	 
			    	 i++;
			  }
		
			
			/*   
				
			 for( i=0;i<9;i++) {
		    	 for(int j=0;j<9;j++) {
		    		System.out.print(map1[i][j]);
		    	 }
		    		 System.out.println();
		     }  	  
			  
			    	
		*/
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        	   
          
      }
      catch (FileNotFoundException e)
      {
          e.printStackTrace();
      }
  	
	
	 
} 

public int MapbyIndex(int[][] map,int i,int j) {
	return map[i][j];
}

public int[][] getMap1() {
	return map1;
}


public void setMap1(int[][] map1) {
	this.map1 = map1;
}


public int[][] getMap2() {
	return map2;
}


public void setMap2(int[][] map2) {
	this.map2 = map2;
}


public int[][] getMap3() {
	return map3;
}


public void setMap3(int[][] map3) {
	this.map3 = map3;
}


public int[][] getMap4() {
	return map4;
}


public void setMap4(int[][] map4) {
	this.map4 = map4;
}


public int[][] getMap5() {
	return map5;
}



public void setm5(int [][] map5,int i, int j,int [][]map) {
this.map5[i][j]=map[i][j];
	
}
public void setm4(int [][] map4,int i, int j,int[][] map) {
	this.map4[i][j]=map[i][j];
	
}
public void setm3(int [][] map3,int i, int j,int[][] map) {
	this.map3[i][j]=map[i][j];
	
}
public void setm2(int [][] map2,int i, int j,int[][] map) {
	this.map2[i][j-6]=map[i-6][j]; 
	

}
public void setm1(int [][] map1,int i, int j,int [][] map) { // harita sonra matris
	this.map1[i-6][j-6]=map[i][j];
	
}

public int getm5(int[][] map5,int i,int j) {
	return map5[i][j];
}

public int getm4(int[][] map4,int i,int j) {
	return map4[i][j];
}
public int getm3(int[][] map3,int i,int j) {
	return map3[i][j];
}
public int getm2(int[][] map2,int i,int j) {
	return map2[i][j];
}
public int getm1(int[][] map1,int i,int j) {
	return map1[i][j];
}

}