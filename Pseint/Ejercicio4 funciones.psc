
Algoritmo sin_titulo
	//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
    //función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la
	//función Subcadena().
	Definir letra,frase Como Caracter
	Definir cantidad Como Entero
	Escribir "Ingrese frase"
	leer frase
	Escribir "Ingrese letra"
	leer letra
	cantidad = buscar(frase,letra)
	Escribir "La letra ",letra," se encuentra ",cantidad," veces"
	
FinAlgoritmo

Funcion c = buscar(frase,letra)
	definir c,i,n Como Entero
	c=0
	i=0
	n=Longitud(frase)
	Mientras i < n Hacer
		Si letra = Subcadena(frase,i,i)Entonces
			c=c+1
		Fin Si
		i=i+1
	Fin Mientras
	
Fin Funcion
