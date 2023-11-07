//Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra 
//esta entre las letras "M" y "T". Recordar que Pseint le da un valor numérico a 
//cada letra a través del Código Ascii, lo que nos deja usar operadores relacionales con 
//letras y cadenas.


Algoritmo ascii
	definir letra Como Caracter
	letra=""
	escribir "Bienvenido"
	
	
	
	codigo(letra)
FinAlgoritmo
subproceso codigo(l)
	definir i ,asci como entero
	definir letra Como Caracter
	
	asci=0
	
	escribir "Ingresa una letra"
	leer letra
	//letra=minusculas(letra)
	Segun letra  Hacer
		"m","M":
			asci=77
		"n","N":
			asci=78
		"o","O":
			asci=79
			
		"p","P":
			asci=80
			
		"q","Q":
			asci=81
			
		"r","R":
			asci=82
			
		"s","S":
			asci=83
			
		"t","T":
			asci=84
			
			
		De Otro Modo:
			asci=0
	Fin Segun
	si asci>=77 y asci<=84 Entonces
		escribir "La letra " , letra , " se encuentra dentro del rango"
	sino
		escribir "La letra " , letra , " no se encuentra dentro del rango"
	FinSi
fin subproceso

	
	
	

	