Algoritmo Menu
	Definir usuario,contrasena,login como caracter
	definir contador  como entero
	
	contador=0
	
	repetir
		escribir "ingresar usuario y contrasena"
		leer usuario
		leer contrasena
		Si usuario='Albus_D' y contrasena='caramelosDelimon' Entonces
			
			login='verdadero'
			
		SiNo
			contador=contador+1
		fin si
		
	hasta que contador==3 o usuario = 'Albus_D' o contrasena = 'caramelosDelimon'
	
	
	
FinAlgoritmo
