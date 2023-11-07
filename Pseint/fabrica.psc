//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//		un 15% si el turno es nocturno.
//	El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día
//			de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además,2
//			debemos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era
//			festivo o no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.

Algoritmo fabrica
	definir  nombre,dia,turno,feriado  Como Caracter
	Definir horas,tarifa Como real
	
	escribir "Ingresa tu nombre"
	leer nombre
	escribir "Ingresa dia "
	leer dia
	escribir"Es feriado? s/n"
	leer feriado
	escribir "Ingresa turno  d/n"
	leer turno
	escribir "Ingresa cantidad de horas"
	leer horas
	feriado=Minusculas(feriado)
	turno=Minusculas(turno)
	
	escribir "El trabajador " , nombre , " en el dia " , dia , "recibira un jornal de " , jornal(feriado,turno, horas)
FinAlgoritmo

funcion resultado =jornal(f por referencia,t por referencia,h por referencia)
	definir resultado como real
	si t='d' y f='s' entonces
		resultado=90*h + (90*h*0.1)
	SiNo
		si t='d' y f='n' entonces
			resultado=90*h
		fin si	
	fin si
	si t='n' y f='s' entonces
		resultado=125*h + (125*h*0.15)
	SiNo
		si t='n' y f='n' entonces
			resultado=125*h
			
		fin si	
	FinSi	
	
FinFuncion
