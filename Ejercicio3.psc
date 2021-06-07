Algoritmo Ejercicio3
	Definir numero1 Como Entero
	Definir factorial Como Entero
	factorial = 1
	Escribir 'Ingrese el numero para calcular su factorial'
	Leer numero1
	Si numero1 < 0
		Escribir 'No existe factorial de numero negativo'
	SiNo
		si numero1 = 0
			Escribir 'El factorial de ' numero1 ' es ' factorial 
		SiNo
			Para i<-1 Hasta numero1 Con Paso 1 Hacer
				factorial= factorial * i
			Fin Para
			Escribir 'El factorial de ' numero1 ' es ' factorial 
		FinSi
	FinSi
FinAlgoritmo
