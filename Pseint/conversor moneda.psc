Algoritmo sin_titulo
	definir dolares,pesos,euros,tipo_de_cambio,op Como Real
	escribir "******************************************"
	escribir "*********Elige la opcion deseada**********"
	escribir" ***1 dolares ****** 2 euros ***"
	leer op
	Limpiar Pantalla
	escribir" ingresa la cantidad de pesos "
	leer pesos
	
	escribir "ingresa el valor del tipo_de_cambio solicitado"
	leer tipo_de_cambio
	Si op=1 Entonces
		dolares=pesos/tipo_de_cambio
		
		
		escribir" valor de dolares" , dolares
		
	SiNo
		euros= pesos/tipo_de_cambio
		escribir" valor de euros" , euros
		
	Fin Si 
	
FinAlgoritmo
