package mypack;

public class Salary {
	
	double basic;
	double da;
	double pf;
	double gross;
	
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getGross() {
		return gross;
	}
	public void setGross(double gross) {
		this.gross = gross;
	}
	public double getNet() {
		return net;
	}
	public void setNet(double net) {
		this.net = net;
	}
	double net;
	
	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", da=" + da + ", pf=" + pf + ", gross=" + gross + ", net=" + net + "]";
	}

}
