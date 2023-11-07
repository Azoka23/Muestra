//Realizar una función que calcule y retorne la suma de todos los divisores del número n
//distintos de n. El valor de n debe ser ingresado por el usuario.

Algoritmo divisores
	definir num como entero
	escribir "Ingresa un numero mayor a 1"
	leer num
	escribir "La suma  de los divisores del numero " , num , " es " , divi(num)
FinAlgoritmo

Funcion resultado= divi(n por referencia)
	definir resultado Como entero
	definir suma,i como entero
	suma=0
	para i=1 hasta n-1 Hacer
		si n MOd i =0 Entonces
			suma = suma+i
		FinSi
	 	
	FinPara
	resultado=suma
	FinFuncion
	