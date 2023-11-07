Algoritmo sin_titulo
	menu()
FinAlgoritmo

SubProceso menu()
	Definir opc Como Entero
	limpiar pantalla
	Escribir "Bienvenido "
	Escribir "Te presentamos nuestras opciones "
	Escribir ""
	Escribir "1- Calcular muro de ladrillo"
	Escribir "2- Calcular viga de hormigon"
	Escribir "3- Calcular columnas de hormigon"
	Escribir "4- Calcular contrapisos"
	Escribir "5- calcular techos"
	Escribir "6- Calcular pisos"
	Escribir "7- Calcular pintura"
	Escribir "8-Calcular iluminación"
	Escribir "9-Salir"
	Leer opc
	limpiar pantalla
	Hacer
		
		Segun opc hacer
			1:
				calcularMuro()
				Esperar Tecla
				menu()
			2:
				calcularViga()
				Esperar Tecla
				menu()
			3:
				calcularColumna()
				Esperar Tecla
				menu()
			4:
				calcularContrapisos()
				Esperar Tecla
				menu()
			5:
				calcularTecho()
				Esperar Tecla
				menu()
			6:
				calcularPisos()
				esperar Tecla
				menu()
			7:
				calcularPintura()
				Esperar Tecla
				menu()
			8:
				calcularIluminacion()
				Esperar Tecla
				menu()
				
			9: 
				Escribir "Usted eligió finalizar el programa"
				
			//De Otro Modo:
				//Escribir "Elija una opción válida "
				//Leer opc
				//Esperar Tecla
				
		FinSegun
		
		
	Hasta  Que (opc<10 y opc>0)
	
FinSubProceso


SubProceso calcularSuperficie(area Por Referencia)
	Definir base,altura Como Real
	
	Escribir "Ingrese el base y la altura que posee la superficie"
	Leer base,altura
	area=base*altura
	
	
FinSubProceso

SubProceso calcularVolumen(volumen Por Referencia)
	Definir base,altura,largo Como Real
	Escribir "Ingrese el espesor, ancho y largo"
	Leer altura, base , largo
	volumen=base*altura*largo
	
FinSubProceso

SubProceso calcularMuro()
	
	definir med,sup,cem,aren,lad,l,a Como Real
	repetir
		limpiar pantalla
		escribir "****************************"
		escribir "    Calcular muro   "
		escribir "*****************************"
		escribir "1-espesor de 20 cm"
		escribir "2-espesor de 30 cm"
		escribir ""
		Escribir "Elegi la opcion que necesitas"
		leer med
		Escribir "Ingrese el largo y alto del muro en metros"
		Leer l,a
		limpiar pantalla
	hasta que med=1 o med=2
	Segun med Hacer
		1:
			sup=l*a
			cem=sup*10.9
			aren=sup*0.09
			lad=sup*90
			escribir "La cantidad de materiales requeridos es "
			escribir ""
			Escribir "La superficie del muro es: ",sup, " m²"
			escribir"cemento : " , cem , " kg"
			Escribir "arena : " , aren , " m³"
			Escribir "ladrillos : " , lad " unidades "
			escribir ""
		2:
			sup=l*a
			cem=sup*15.2
			aren=sup*0.115
			lad=sup*120
			escribir "La cantidad de materiales requeridos es "
			escribir ""
			Escribir "La superficie del muro es: ",sup," m²"
			escribir"cemento : " , cem , " kg"
			Escribir "arena : " , aren , " m³"
			Escribir "ladrillos : " , lad " unidades "
			escribir ""
			
		De Otro Modo:
			escribir "Volve a intentarlo"
	Fin Segun
	
FinSubProceso

SubProceso calcularViga()
	
	Definir l,cem,aren,pied,h8,h4 Como Real
	escribir "****************************"
	escribir "    Calcular viga  "
	escribir "*****************************"
	Escribir "Ingrese el largo de la viga"
	Leer l
	cem=l*9
	aren=l*0.02
	pied=l*0.02
	h8=l*4
	h4=l*3
	escribir "Los materiales que se necesitan son:"
	Escribir ""
	Escribir "cemento : ", cem , " kg"
	Escribir "arena: ", aren , " m³"
	Escribir "piedras : " , pied , " m³"
	Escribir "hierro del 8 : " , h8 ," m "
	Escribir "hierro del 4: " , h4 ," m "
	
FinSubProceso

SubProceso calcularColumna()
	Definir l,cem,aren,pied,h10,h4 Como Real
	escribir "****************************"
	escribir "    Calcular columna  "
	escribir "*****************************"
	Escribir "Ingrese el largo de la columna"
	Leer l
	cem=l*7.5
	aren=l*0.016
	pied=l*0.016
	h10=l*6
	h4=l*3
	escribir "Los materiales que se necesitan son:"
	Escribir ""
	Escribir "cemento : ", cem , " kg"
	Escribir "arena: ", aren , " m³"
	Escribir "piedras : " , pied , " m³"
	Escribir "hierro del 10 : " , h10 ," m "
	Escribir "hierro del 4: " , h4 ," m "
		
		
FinSubProceso	


SubProceso calcularContrapisos()
	Definir volumen,cem,aren,pied Como Real
	escribir "****************************"
	escribir "    Calcular contrapiso   "
	escribir "*****************************"
	volumen=0
	calcularVolumen(volumen)
	
	cem=volumen*115
	aren=volumen*0.045
	pied=volumen*0.09
	escribir "Los materiales que se necesitan son:"
	Escribir ""
	Escribir "cemento : ", cem , " kg"
	Escribir "arena: ", aren , " m³"
	Escribir "piedras : " , pied , " m³"
	
FinSubProceso

SubProceso calcularTecho()
	Definir volumen Como Real
	volumen=0
	calcularVolumen(volumen)
	
	Definir cem,aren,pied,h8,h6 Como Real
	
	
	cem=volumen*33
	aren=volumen*0.072
	pied=volumen*0.072
	h8=volumen*7
	h6=volumen*4
	escribir "Los materiales que se necesitan son:"
	Escribir ""
	Escribir "cemento : ", cem , " kg"
	Escribir "arena: ", aren , " m³"
	Escribir "piedras : " , pied , " m³"
	Escribir "hierro del 8 : " , h8 ," m "
	Escribir "hierro del 6 : " , h6 ," m "
	
FinSubProceso


SubProceso calcularPisos()
	Definir area Como Real
	area=0
	calcularSuperficie(area)
	Escribir "El area es :",area*1.1
	
FinSubProceso

SubProceso calcularPintura()
	Definir area Como Real
	area=0
	calcularSuperficie(area)
	
	Escribir "Para una superficie de  ",area, "m², Se necesitan ",trunc(area/6)+1,"m² Litros de pintura"
	
	
FinSubProceso

SubProceso calcularIluminacion()
	Definir area Como Real
	area=0
	calcularSuperficie(area)
	
	Escribir "La cantidad mínima de superficie de iluminación natural(ventanas y puertas de vidrio), es: ",area*0.20
	
FinSubProceso