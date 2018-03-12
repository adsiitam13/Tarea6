package memento;

public class Calculos{
	public static void main(String[] args){
		Calculadora calc=new Calculadora();
		CareTaker lista=new CareTaker();

		calc.sumar(5+4);

		calc.sumar(3+2);
		//guardamos el resultado
		lista.add(calc.guardarResultado());

		calc.sumar(9+2);
		//guardamos el resultado
		lista.add(calc.guardarResultado());
		
		//recuperamos el primer resultado
		calc.recuperarResultado(lista.get(0));
		//usamos ese resultado para realizar un nuevo resultado
		calc.sumarRes(10);
		//guardamos el resultado
		lista.add(calc.guardarResultado());
		
		
	}
}
