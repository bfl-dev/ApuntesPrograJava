Proceso CtoF
	Definir opcion como entero;
	definir c como real;
	definir f como real;
	
	Escribir "ingrese la opci�n que desea";
	Escribir "(1) C a F";
	Escribir "(2) F a C";
	Leer opcion;
	
	Si opcion=1 Entonces
		Escribir "ingrese grados C";
		Leer c;
		f<-c*(9/5)+32;
		Escribir c,"�C son ",f,"�F";
	SiNo
		Si opcion=2 Entonces
			Escribir "ingrese grados F";
			Leer f;
			c<-(f-32)*(5/9);
			Escribir f,"�F son ",c,"�C";
		Sino
			Escribir "opci�n no v�lida";
		FinSi
		
	FinSi	
FinProceso

