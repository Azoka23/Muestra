Algoritmo extra5
	definir num Como Entero
	escribir " ingrese un año"
	leer num
	Si 0=num Mod 4 Entonces
		escribir " el año es bisiesto"
	SiNo
		
		Si 0=num Mod 100 y 0=num Mod 400 Entonces
			escribir "el año es bisiesto"
		SiNo
			escribir "el año no es bisiesto"
		Fin Si
	Fin Si
	
FinAlgoritmo
