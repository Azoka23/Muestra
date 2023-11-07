Algoritmo contardigitos
	definir num,uni,dec,cen Como Entero
	escribir "ingresa un numero"
	leer num
	uni= num Mod 10
	num= trunc (num/10)
	dec= num Mod 10
	num= trunc (num/10)
	cen= num Mod 10
	num= trunc (num/10)
	Si cen>0 Entonces
		escribir "el numero que ingresaste tiene tres digitos"
	SiNo
		escribir "el numero no tiene 3 digitos,ingresa otro numero"
		
	Fin Si
FinAlgoritmo
