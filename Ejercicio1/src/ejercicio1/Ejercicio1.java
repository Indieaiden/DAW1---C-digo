/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Jorge Aiden
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                //El ejercicio1 no tiene código.
                //Esto llama al método ejercicio2
		ejercicio2();
		//Esto llama al método ejercicio3
		ejercicio3();
		//Esto llama al método ejercicio4
		ejercicio4();
		//Esto llama al método ejercicio5
		ejercicio5();
                //Esto llama al método ejercicio5
		ejercicio6();
                //Esto llama al método ejercicio5
		ejercicio8();
                //Esto llama al método ejercicio5
		ejercicio9();
                //Esto llama al método ejercicio5
		ejercicio10();
	}

    
        /*
        *   Corregir el fuente anterior y volver a compilarlo.
        */
        public static void ejercicio2 () {
            
                System.out.println("Ejercicio 2: ");
                    System.out.println();
            	int n1= 50, n2 = 30;
		//boolean suma = 0;
		int suma = 0;
		suma = n1+n2;
		System.out.println("La suma es : " + suma);
        }
        
	/*
	* Escribe un programa que intercambie el valor de dos variables.
	*/
	public static void ejercicio3 (){
            
                    System.out.println("Ejercicio 3: ");
                    System.out.println();
	//Declaro las variables, todas tipo int, pero vale cualquier tipo
                
		int a, b, aux;
		a = 1;
		b = 2;
		aux = 0;
	//Saco por pantalla los valores para que se vea
		System.out.println("Sin intercambiar");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("aux = " + aux);

	//Para cambiarlas, primero pongo el valor de una en una variable
	//auxiliar
		aux = a;
	//luego sobreescribo la que he guardado en aux
		a = b;
	//y sobreescribo la que ya he copiado en el paso anterior desde aux (XD)
		b = aux;
	//por último, pongo el valor inicial en aux
		aux = 0;
		
	//Imprimo las variables intercambiadas para ver si ha funcionado
		System.out.println("Intercambiadas");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("aux = " + aux);
	}

	/*
	* ¿Qué resultados se obtienen al realizar las operaciones siguientes? Si hay errores en la
        * compilación, corríjalos y dé una explicación de por qué suceden.
	*/
	public static void ejercicio4 () {
	
                    System.out.println("Ejercicio 4: ");
                    System.out.println();
	/*programa copiado
		int a = 10. b = 3. c = 1, d.
		e:
		float x.
		y:
		x = a / b;
		y = (float) a / b:
		*/

	/*programa corregido*/

	//No hay puntos y comas en ningún sitio. Las variables, si no se
	//declaran de una en una, tienen que ir separadas por comas.
	//Las variables c, d y e no se usan nunca así que las borro.
	
		int a = 10, b = 3;
	//No pasa nada porque esté en líneas distintas, compila pero es feo.
		float x,y;
	//Aquí habría que tener cuidado con que el valor de b no sea 0
		x = a / b;
	//Pongo unos paréntesis porque no estoy seguro de si el cast se hace
	//únicamente a la siguiente variable o a la resolución de la operación.
	//Así, me aseguro que se transforme en float la operación completa.
		y = (float) (a / b);
	//Compila aunque no he puesto comprobaciones así que suponemos que va ok.

	}

	/*
	* Escriba las sentencias necesarias para evaluar la siguiente ecuación para valores dados	
	*/
	public static void ejercicio5 () {
                
                 System.out.println("Ejercicio 5: ");
                 System.out.println();
	//ECUACION: ax^3 +bx^2 -cx+3
	//Valores para evaluar: a=5, b=-1.7, c=2 y x= 10.5

	//Lo voy a hacer todo con float porque estamos trabajando en /R
	
		float a, b, c, x;
		float aux1, aux2, aux3, suma;
	
	//declaro variables
		a = 5f;
		b = -1.7f;
		c = 2f;
		x = 10.5f;
	//Operaciones para evaluar
	 aux1 = a*(x*x*x);
	 aux2 = b*(x*x);
	 aux3 = c*x;
	//Esta es la evaluación
		suma = aux1+aux2+aux3+3f;
	//Esto es una estructura de control, en caso de que el resultado
	//sea 0, se considera que es raíz. En caso contrario, no. 
		if (suma == 0f) 
			System.out.println("El valor 10.5 es raíz de esa ecuación");
		else 	System.out.println("El valor 10.5 NO es raíz de esa ecuación");
	
    }
        
        /*
	Este ejercicio pide escribir el valor ASCII de la V y la "Â£" sin mirar
	la tabla
	*/
	public static void ejercicio6 () {
		
                 System.out.println("Ejercicio 6: ");
                 System.out.println();
		//Para sacar los valores, voy a crear dos variables INT y meterles
		//un carÃ¡cter, con lo que deberian sacarme el valor ASCII

		int char1 = 'v';
		int char2 = '£';

		System.out.println("Los valores ASCII deberiaan ser: ");
		System.out.println(char1);
		System.out.println(char2);
	}

	/*

		Ejercicio 7:
		Los datos que necesito para escribir un programa que calcule 
		una suma y una media son: Cuatro variables de tipo int, y 
		una variable de tipo float o double que almacene la media.
		Si no supiÃ©semos cuÃ¡l es el nÃºmero de elementos para calcular la
		media, nos harÃ­a falta un contador.
	*/

	/*
	Hay que evaluar otra expresion matematica
	*/

	public static void ejercicio8 () {
            
               System.out.println("Ejercicio 8: ");
               System.out.println();
	//ECUACION: (b^2-4ac)/2^a
	//Valores para evaluar: a=1, b=5, c=2

	//Lo voy a hacer todo con float porque estamos trabajando en /R
	
		float a, b, c;
		float aux1;
	
	//declaro variables
		a = 1f;
		b = 5f;
		c = 2f;
	//Operaciones para evaluar
		aux1 = (float) ((5^2-4*1*2)/2^1);
		
		System.out.println("El valor de la evaluacion ha sido: ");
		System.out.println(aux1);
	}
          
        /**
         * Escribe un programa que cada vez que lo ejecutes muestre un carácter de forma
         *  aleatoria. (Utiliza Math.random())
         * */
	public static void ejercicio9 () {
            
             System.out.println("Ejercicio 9: ");
             System.out.println();
             
             //Declaro un mínimo y un máximo para el valor de Math.random
             int minimo = 0, maximo = 255;
            
            /**
             * La tabla ASCII extendida tiene 256 valores, de 0 a 255. De esta forma
             * he cogido los máximos y los mínimos. Después de eso utilizo las funciones de Java
             * Math.floor y Math.random para coger un número aleatorio. Para saber cómo utilizar
             * las funciones, se mira en la documentación de Java online.
             * 
             * Para estar seguro de que el número obtenido es un int, hago un cast. Queremos un char
             * así que hago un cast a char en la siguiente línea. Para terminar, lo imprimo por pantalla.
             */
             int numAleatorio=(int)Math.floor(Math.random()*(minimo-maximo)+maximo);
             char charAleatorio = (char)numAleatorio;
             System.out.println("Caracter aleatorio! :D -> " + charAleatorio);
             
        }
        
        /**
         * Reescribe el ejercicio anterior para recibir como parámetros los valores a, b y c desde 
         * línea de comandos.
         */
        
        public static void ejercicio10 () {
            
            //Supondré que habla del ejercicio 8.
            
             System.out.println("Ejercicio 10: ");
             System.out.println();
             
             //ECUACION: (b^2-4ac)/2^a
	//Valores para evaluar: a=1, b=5, c=2

	//Lo voy a hacer todo con double porque estamos trabajando en /R
	
		double a, b, c;
		double aux1;
                
        //Creo un objeto Scanner, y luego con ese objeto cojo el siguiente float tres veces.
        Scanner entradaEscaner = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        a = entradaEscaner.nextDouble();
        System.out.println("Introduce un número: ");
        b = entradaEscaner.nextDouble();
        System.out.println("Introduce un número: ");
        c = entradaEscaner.nextDouble();
        

        System.out.println ("Entrada recibida por teclado es: \"" + a +"\"");
	//declaro variables
		a = 1f;
		b = 5f;
		c = 2f;
	//Operaciones para evaluar
		aux1 = ((Math.pow(b, 2)-4*a*c)/Math.pow(2, a));
		
		System.out.println("El valor de la evaluacion ha sido: ");
		System.out.println(aux1);
             
             
        }
    
}
