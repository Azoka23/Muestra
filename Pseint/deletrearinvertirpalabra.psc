Algoritmo palabrainvertida
	definir palabra,letra,rpta Como Caracter
	definir size,i,k como entero
	
	escribir "ingresar palabra"
	leer palabra
	size=longitud(palabra)
	escribir " tu palabra tiene " , size , " caracteres"
	Para i<-0 Hasta size Con Paso 1 Hacer
		letra=subcadena(palabra,i,i) //aca toma de una letra
		escribir sin saltar "   " ,letra // aca muetra la palabra deletreada
	Fin Para
	k=0
	rpta=''
	Para i<-0 Hasta size Con Paso 1 Hacer
		letra= subcadena(palabra, size-k,size-k)//aca toma de a una las letras hacia atras
		rpta=concatenar (rpta,letra) 
		k=k+1
	Fin Para
	escribir ""
	escribir  " tu palabra invertida es " , " " , rpta
FinAlgoritmo
