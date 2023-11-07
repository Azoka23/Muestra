//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.

Algoritmo primos
	definir num Como Entero
	escribir "Ingresa un numero"
	leer num
	escribir primo(num)
	
FinAlgoritmo

funcion resultado=primo(n)
	definir resultado Como Caracter
	definir i,cont como entero
	cont=0
	para i=1 hasta n-1 hacer
	si n Mod i =0 entonces
		cont=cont+1
		fin si
     fin para
	 escribir " La cantidad de divisores del numero es " , cont +1
	 si (cont+1) >2 Entonces
		 escribir "El numero no es primo"
	 SiNo
		 escribir "El numero es primo"
	 FinSi
FinFuncion
	