public class Funciones {

	public static void main(String[] args) {
		double resultado;
		double a=-12.342567;
		double b=90;
		double c=10.4672;
		double d=3;
		double e=4;
                double f=27;
                double g=100;
                double h=101;
                double i=30.56789;
                double j=45;
                double k=180;
		
		
		resultado=ABS(a);           // resultado guarda el valor absoludo de a
		System.out.println("Funcion Math.abs de "+a+"\t es= "+resultado);
		
		resultado=COS(b);           // resultado guarda el coseno de a
		System.out.println("Funcion Math.cos de "+b+"\t es= "+resultado);
		
		resultado=FLOOR(c);           // resultado la parte entera 
		System.out.println("Funcion Math.floor= "+c+"\t es= "+resultado);
		
		resultado=HYPOT(d, e);           // encuentra la hipotenusa de un triangulo rectangulo 
		System.out.println("Funcion Math.hypot= "+d+" y "+e+"\t es= "+resultado);
		
		resultado=MAX(c, d);           // guarda el valor maximo de dos valores
		System.out.println("Funcion Math.max= "+c+" y "+d+"\t es= "+resultado);
		
		resultado=MIN(c, d);           // guarda el valor Minimo de dos valores
		System.out.println("Funcion Math.min= "+c+" y "+d+"\t es= "+resultado);
		
                resultado=CBRT(f);           // guarda la raiz cubica de la variable
		System.out.println("Funcion Math.cbrt= "+f+"\t\t es= "+resultado);
                
                resultado=RANDOM()*1;           // Random genera al azar un numero decimal entre 0.999 y 0.001
		System.out.println("Funcion Math.random= "+1+"\t\t es= "+resultado);
                
                resultado=LOG10(g);           // se obtiene el exponente de base 10 para obtener la variable
		System.out.println("Funcion Math.log= "+g+"\t\t es= "+resultado);
                
                resultado=GETEXPONENT(h);           // se obtiene el exponente de base 10 para obtener la variable
		System.out.println("Funcion Math.getExponent= "+h+"\t es= "+resultado);
                
                resultado=NEXTUP(i);           // se obtiene el exponente de base 10 para obtener la variable
		System.out.println("Funcion Math.nextUp= "+i+"\t es= "+resultado);
                
                resultado=RINT(c);           // se obtiene el exponente de base 10 para obtener la variable
		System.out.println("Funcion Math.rint= "+c+"\t es= "+resultado);
                
                resultado=SIN(j);           // se obtiene el seno de un angulo
		System.out.println("Funcion Math.sin= "+j+"\t\t es= "+resultado);
                
                resultado=TAN(k);           // se obtiene la tangente de un angulo
		System.out.println("Funcion Math.tan= "+k+"\t\t es= "+resultado);
                
                resultado=IEEEREMAINDER(d, g);           // guarda el valor Minimo de dos valores
		System.out.println("Funcion Math.IEEEremainder= "+d+" y "+g+"\t es= "+resultado);
                

	}
	
	public static double ABS(double x){  // se crea la funcion abs de Math
		double res;
		res =Math.abs(x);
		return res;
	}
	
	public static double COS(double x){
		double res;
		res=Math.cos(x);
		return res;
	}
	
	public static double FLOOR(double x){
		double res;
		res=Math.floor(x);
		return res;
	}
	
	public static double HYPOT(double x, double y){
		double res;
		res=Math.hypot(x, y);
		return res;
	}
	
	public static double MAX(double x, double y){
		double res;
		res=Math.max(x, y);
		return res;
	}
	
	public static double MIN(double x, double y){
		double res;
		res=Math.min(x, y);
		return res;
	}
	
        public static double CBRT(double x){
		double res;
		res=Math.cbrt(x);
		return res;
	}
	
        public static double RANDOM(){
		double res;
		res=Math.random();
		return res;
	}
        
        public static double LOG10(double x){
		double res;
		res=Math.log10(x);
		return res;
	}
        
        
       public static int GETEXPONENT(double x){
		int res;
		res=Math.getExponent(x);
		return res;
	} 
        
	public static double NEXTUP(double x){
                double res;
		res=Math.nextUp(x);
		return res;
        }
	
	public static double RINT(double x){
                double res;
		res=Math.rint(x);
		return res;
        }
	
	public static double SIN(double x){
		double res;
		res=Math.sin(x);
		return res;
	}
        
        public static double TAN(double x){
		double res;
		res=Math.tan(x);
		return res;
	}
        //IEEEremainder
        public static double IEEEREMAINDER(double x, double y){
		double res;
		res=Math.IEEEremainder(x, y);
		return res;
	}
}
