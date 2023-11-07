//Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla 
//la fecha anterior. Para ello se deberá utilizar un procedimiento llamado diaAnterior
//	que reciba una fecha representada a través de tres enteros dia, mes y anio, y 
//	retorne la fecha anterior. Puede asumir que dia, mes y anio representan una fecha 
//	válida. Realice pruebas de escritorio para los valores dia=5, mes=10, anio=2012
//		y para dia=1, mes=3, anio=2004.
//		FinPara


Algoritmo diaanterior
	definir dia,mes,anio Como Entero
	escribir "Ingresa el dia por favor"
	leer dia
	escribir "Ingresa el mes"
	leer mes
	escribir "ingrsar el anio"
	leer anio
	dianterior(dia,mes,anio)
	
FinAlgoritmo
subproceso dianterior(d,m,a)
	definir d0,m0,a0 Como Entero
	d0=0
	m0=0
	a0=0
	si m<>01 y d<>1 entonces
		
		d0=d-1
		m0=m
		a0=a
	sino
		
		si  m=03 o m=05 o m=07 o m=08 o m=10 o m=12 Entonces
			d0=30
			m0=m-1
			a0=a
		SiNo
			
			d0=31
			m0=m-1
			a0=a
		fin si
		
		
	fin si
	si d=1 y m=1 entonces	
		d0=31
		m0=12
		a0=a-1	
	fin si
	
	escribir "La fecha anterior a la ingresada es " , d0 ,"/ " , m0 , "/ " , a0
	
FinSubProceso

