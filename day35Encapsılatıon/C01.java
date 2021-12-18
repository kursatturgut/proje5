package day35Encapsýlatýon;

public class C01 {

	
	
	private double not=49.9;
	
	private boolean geçerMi=false;

	
	
	public double getNot() {
		return not;
	}

	public boolean isGeçerMi() {
		if (not>=50) {
			geçerMi=true;
		}
		
		
		return geçerMi;
	}

	public void setNot(double not) {
		
		this.not = not;
	}

	
	

}
