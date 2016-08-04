import javax.swing.JOptionPane;
import java.util.Scanner;

class Saudacao{
		public static void main(String args[]){
						
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do Triangulo :"));
			double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do Triangulo :"));

			Triangulo t1 = new Triangulo(altura,base);
			System.out.println("A área do triângulo é : " + areaTriangulo(base,altura));
						System.out.println("A área do triângulo2 é : " + t1.Area());

		}
		
		public static double areaTriangulo(double base,double altura){
			return (base*altura/2);
		}
		public static double areaRetangulo(double base,double altura){
			return (base*altura);
		}
}


class Triangulo{
	double altura;
	double base;
	
	public Triangulo(double a,double b){
		this.altura = a;
		this.base = b;
	}
	
	public double Area(){
		return ((altura*base)/2);
	}
	
	
}

