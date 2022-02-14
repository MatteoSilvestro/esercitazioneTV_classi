package Televisione;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		String dato="";
		int comando=0,canale=0;
		boolean stato=true;
		
	    InputStreamReader input = new InputStreamReader(System.in);
	    BufferedReader tastiera= new BufferedReader (input);
	    
	    TV tv = new TV();
	    
	    while(stato) {
	    	

	    	
	    	System.out.println("1-Aumentare il volume");
	    	System.out.println("2-Diminuire il volume");
	    	System.out.println("3-Incrementare il numero del canale");
	    	System.out.println("4-Diminuire il numero del canale");
	    	System.out.println("5-Cambiare il canale");
	    	System.out.println("6-Accendere/spegnere la TV");
	    	System.out.println("7-Esci");
	    	
	    	do {

	    	try{
	    		dato = tastiera.readLine();
	    		comando = Integer.valueOf(dato).intValue();
	    	}catch(Exception e) {}
	    	
	    	}while(comando<1 && comando>7);
	    	
	    	switch(comando) {
	    		case 1: 
	    			if(tv.acc) {
	    			tv.incr_V();
	    			break;
	    			} else {
	    				System.out.println("La TV è spenta");
	    				break;
	    			}
	    		case 2:
	    			if(tv.acc) {
		    			if(tv.V<=0) {
		    				System.out.println("Impossibile diminuire il volume");
		    				break;
		    			}
		    			else {
		    				tv.decr_V();
		    				break;
		    			}	
	    			} else {
	    				System.out.println("La TV è spenta");
	    				break;
	    			}

	    		case 3:
	    			if(tv.acc) {
	    				tv.incr_C();
	    				break;		    			
	    			} else {
	    				System.out.println("La TV è spenta");
	    				break;
	    			}

	    		case 4:
	    			if(tv.acc) {
	    				if(tv.C<=0) {
	    					System.out.println("Impossibile diminuire il canale");
	    					break;
	    				}
	    				else {
	    					tv.decr_C();
	    					break;
	    				}		    			
	    				} else {
		    				System.out.println("La TV è spenta");
		    				break;
		    			}

	    		case 5:
	    			if(tv.acc) {
	    				try {
	    					dato = tastiera.readLine();
	    					canale = Integer.valueOf(dato).intValue();
	    				}catch(Exception e) {}
	    				if(canale<0) {
	    					System.out.println("Impossibile impostare il canale");
	    					break;
	    				}
	    				else {
	    					tv.setC(canale);
	    					break;
	    															}		    			
	    			} else {
	    				System.out.println("La TV è spenta");
	    				break;
	    			}
	    			

	    		case 6:										
	    			tv.setAcc();
	    			break;
	    			
	    		case 7:
	    			stato = false;
	    			break;
	    			
	    		default : 
	    			System.out.println("Comando non valido");
	    		
	    	}
	    	
	    	if(stato) {
	    	System.out.println();
	    	System.out.println("Canale= "+tv.C);
	    	System.out.println("Volume= "+tv.V);
	    	if(tv.acc) System.out.println("La TV è accesa");
	    	else {
	    		System.out.println("La TV è spenta");
	    	}
	    	}
	    	
	    }

	}

}

