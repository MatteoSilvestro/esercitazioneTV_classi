package Televisione;

public class TV {
	public int C;
	public int V;
	public boolean acc;
	
	public TV() {
		C=1;
		V=1;
		acc = false;
	}
	
	public int incr_V(){
		return V++;
	}
	
	public int decr_V() {
		return V--;
	}
	
	public int incr_C() {
		return C++;
	}
	
	public int decr_C() {
		return C--;
	}
	
	public int setC(int C1) {
		C = C1;
		return C;
	}
	
	public void setAcc() {
		acc = !acc;
	}
	

	
	
	

}
