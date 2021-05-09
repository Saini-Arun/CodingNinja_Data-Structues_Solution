public class ComplexNumbers {
	// Complete this class
     int real;
	 int complex;
	
	public ComplexNumbers(int real, int complex) {
		this.real=real;
		this.complex=complex;
	}
    
	public void plus(ComplexNumbers c2) {
		this.real=this.real+ c2.real;
		this.complex=this.complex+ c2.complex;
	}
    
	public void multiply(ComplexNumbers c2) {
		int real=this.real;
		int complex=this.complex;
		this.real=real*c2.real-complex* c2.complex;
		this.complex=complex* c2.real+real*c2.complex;	
	}
    
	public void print() {
		System.out.println(this.real+" + i"+this.complex);
	}
    
}