package memento;

public class Calculadora{

	private  double res;

	public Calculadora(){
	
	}
	
	public double getRes(){
		return res;
	}

	// guarda el resultado actual
	public Memento guardarResultado(){
		return new Memento(res);
	}
	
	// suma dos números
	public double sumar(double num1, double num2){
		res=num1+num2;
		return res;
	}
		
	// suma el resultado con otro numero
	public double sumarRes(double num2){
		res+=m.getRes()+num2;
		return res;
	}

	public void recuperarResultado(Memento m){
		this.res=m.getRes();
	}

}
