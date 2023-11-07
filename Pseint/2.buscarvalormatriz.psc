Algoritmo sin_titulo
	//Escribir un programa que realice la búsqueda lineal de un número 
	//entero ingresado por el usuario en una matriz de 5x5, llena de 
	//números aleatorios y devuelva por pantalla las coordenadas donde 
	//se encuentra el valor, es decir en que fila y columna se encuentra. 
	//En caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.
	definir matri,i,j,c,n como entero
	escribir "Ingresa que numero queres buscar" 
	leer n
	escribir " "
	dimension matri[ 5,5]
	para i=0 hasta 4 Hacer
		
		para j=0  hasta 4 Hacer
			 matri[i,j]=aleatorio(-50,50)
			
		FinPara
	FinPara
	
	c=0
	para i=0 hasta 4 Hacer
		para j=0 hasta 4 Hacer
		si n=matri[i,j] entonces
			escribir " El numero " , n , " se encuentra en la fila " , i , " y la columna  " , j
			escribir " "
			c=1
		FinSi
	FinPara
	fin para
	si c=0 Entonces
		escribir " El numero ", n , " no se encuentra en la matriz "
		escribir " "
	FinSi
	
	para i=0 hasta 4 hacer
		para j=0 hasta 4  hacer
			escribir  sin saltar "[" , matri[i,j], "]" , " "
			
		fin para
		escribir " "
	fin para
FinAlgoritmo
