Algoritmo sin_titulo
	
	Definir eleccion como Real
	Definir salario Como Real
	Definir ventasSemanales, precioXH,cantHoras Como Real
	Escribir "1- Comision"
	Escribir "2- Salario fijo mas comision"
	Escribir "3- Salario fijo "
	Leer eleccion
	
	Si eleccion== 1 Entonces
		Escribir "Ingrese el valor de sus ventas semanales"
			Leer ventasSemanales
			salario=(40*ventasSemanales)/100
			Escribir "Su salario es con comision ", salario
		SiNo 
			Si eleccion==2 Entonces
				Escribir "Ingrese las ventas semanales y el precio por hora, tambien ingrese la cantidad de horas trabajadas"
				Leer ventasSemanales
				Leer precioXH
				Leer cantHoras
				Si cantHoras>40 Entonces
					cantHoras=40
				FinSi
				salario=cantHoras*precioXH+(25*ventasSemanales)/100
				Escribir "Su salario es  salario fijo mas comision ", salario
			Sino
				Si eleccion==3
					Escribir "Ingrese el precio por hora, tambien ingrese la cantidad de horas trabajadas"
					Leer precioXH
					Leer cantHoras
					Si cantHoras>40 Entonces
						salario=40*precioXH+(cantHoras-40)*((precioXH*0.5)+precioXH)
						Escribir "Su salario es salario fijo con horas extra ", salario	
					SiNo 
						salario=40*precioXH
						Escribir "Su salario es salario fijo sin horas extras", salario	
					FinSi
				FinSi
				
			FinSi
		FinSi
		
FinAlgoritmo
