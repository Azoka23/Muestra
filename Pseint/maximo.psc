
	//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el usuario.
	//A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor m�s grande del vector.
	
	
	Algoritmo sin_titulo
		definir vector,i,x,resultado,max Como Entero
		
		Escribir "Cuantos numeros queres ingresar?"
		leer x
		dimension vector(x)
		escribir "Ingresa los " , x , " numeros "
		para i=0 hasta x-1 hacer
			
			Leer vector(i)
		fin para
		max= maxi(vector,x)
		escribir "El elemento mayor del arreglo es " ,max
FinAlgoritmo

funcion resultado=maxi(vector por referencia,n)
	definir resultado,j como entero
	resultado=0
	
	para j=0 hasta n-1 hacer
		si resultado<vector(j) entonces
			resultado=vector(j)
		FinSi
		
	fin para
	
FinFuncion



	