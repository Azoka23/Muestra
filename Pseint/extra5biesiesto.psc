Algoritmo extra5
	definir num Como Entero
	escribir " ingrese un a�o"
	leer num
	Si 0=num Mod 4 Entonces
		escribir " el a�o es bisiesto"
	SiNo
		
		Si 0=num Mod 100 y 0=num Mod 400 Entonces
			escribir "el a�o es bisiesto"
		SiNo
			escribir "el a�o no es bisiesto"
		Fin Si
	Fin Si
	
FinAlgoritmo
