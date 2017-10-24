package lineas;//PAQUETE LINEAS

import java.util.Scanner;//IMPORTACION DE LA LIBRERIA DE SCANNER PARA LECTURA DE DATOS POR CONSOLA

/*PRACTICA DE LINEAS ENLAZADAS, UNA LINEA ENLAZADA FUNCIONA UN TANTO SIMILAR A UN
 * ARREGLO UNIDIMENSIONAL, YA EN ESTA LOS DATOS ESTAN ORGANIZADOS DE LA MISMA MANERA
 * UNO A LADO DEL OTRO, A DIFERENCIA QUE ESTOS PARA PODER ESTAR SECUENCIADOS NECESITAN
 * DE ESTAR CONECTADOS POR UN ENLACE, MEDIANTE EL CUAL SE PODRAN OBTER VALORES DE TODOS
 * LOS NODOS PARTIENDO DEL PRIMERO.*/
public class principal//DECLARACION DE LA CLASE PRINCIPAL
{
	/*DEBE TENER LAS SIGUIENTES OPCIONES
	 * VACIO, INICIALIZAR, INSERTAR, LOCALIZAR, BUSCAR, ELIMINAR*/
	
	public static void main(String[] args)//CREACION DEL METODO MAIN O PRINCIPAL 
	{
		Scanner sc = new Scanner(System.in);//INSTANCIA DE LA CLASE ESCANER
		lista ls = new lista();//INSTANCIA DE LA CALSE LISTA
		int opc=0;//VARIABLE ENTERA OPC QUE CONTROLA LAS OPCIONES DEL MENÚ
		do//INICIO DE IN CUCLO DO-WHILE
		{
			print("\n\t.:: MENÚ ::.");//IMPRESION DE PANTALLA DEL MENU
			print("\n1.- Vacio?");//OPCION UNO DEL MENU, PREGUNTAR SI LA LISTA ESTA VACIA
			print("\n2.- Insertar al Inicio");//OPCION DOS DEL MENU, INSERTAR UN NUMERO AL PRICIPIO DE LA LISTA
			print("\n3.- Insertar al Final");//OPCION TRES DEL MENU, INSERTAR UN NUMERO AL FINAL DE LA LISTA
			print("\n4.- Insertar a una Posicion");//OPCION CUATRO DEL MENU, INSERTAR UN NUMERO EN ALGUNA POSICION DE LA LISTA
			print("\n5.- Localizar");//OPCION CINCO DEL MENU, LOCALIZAR ALGUN VALOR DENTRO DE LA LISTA
			print("\n6.- Buscar");//OPCION SEIS DEL MENU, BUSQUEDA DE UN VALOR EN LA LISTA
			print("\n7.- Imprimir lista");//OPCION SIETE DEL MENU, IMPRIMIR TODA LA LISTA
			print("\n8.- Eliminar");//OPCION OCHO DEL MENU, ELIMINAR UN NODO EN LA LISTA
			print("\n9.- Salir\n");//OPCION NUEVE DEL MENU, SALIR DEL PROGRAMA
			opc = sc.nextInt();//LECTURA DE LA VARIABLE
			
			switch(opc){//INICIO DE SWICH CON BASE A LA VARIABLE OPC 
			case 1://CASE NUMERO UNO
				//VACIO
				if(ls.isEmpty()){//SI LA LISA ESTA VACIA IMPRIME
					print("\n<--- Lista Vacia! --->\n");
				}else{
					print("\n<--- No está Vacia --->\n");
				}
				break;
			case 2://CASE NUMERO DOS
				//INSERTAR AL INICIO
				print("\nInsgresa el número a insertar: ");
				ls.insertarPrincipio(sc.nextInt());//SE LLAMA AL METODO CON LOS VALORES INTRODUCIDOS POR TECLADO
				print("Número Insertado Exitosamente");
				break;
			case 3://CASE NUMERO TRES
				//INSERTAR AL FINAL
				print("\nInsgresa el número a insertar: ");
				ls.insertarFinal(sc.nextInt());//SE LLAMA AL METODO CON LOS VALORES INTRODUCIDOS POR TECLADO
				print("Número Insertado Exitosamente");
				break;
			case 4://CASE NUMERO CUATRO
				//INSERAT EN UNA POSICIÓN
				print("\nInsgresa el número a insertar: ");
				int val = sc.nextInt();
				print("\nInsgresa la posicion: ");
				int pos=sc.nextInt();
				ls.insertarPos(val,pos);//SE LLAMA AL METODO CON LOS VALORES INTRODUCIDOS POR TECLADO
				print("Número Insertado Exitosamente");
				break;
			case 5://CASE NUMERO CINCO
				//LOCALIZAR
				print("\nInsgresa el número a localizar: ");
				ls.localizar(sc.nextInt());//SE LLAMA AL METODO CON LOS VALORES INTRODUCIDOS POR TECLADO
				print("Número Insertado Exitosamente");
				break;
			case 6://CASE NUMERO SEIS
				//BUSCAR
				print("Número a buscar");
				int obj = sc.nextInt();
				ls.busqueda(obj);//SE LLAMA AL METODO CON LOS VALORES INTRODUCIDOS POR TECLADO
				break;
			case 7://CASE NUMERO SIETE
				print(""+ls.printls());//LLAMA EL METODO PRA IMPRIMIR LA LISTA
				print("\nLista impresa!");
				break;
			case 8://CASE NUMERO OCHO
				//ELIMINAR
				print("Número a eliminar");
				int ob = sc.nextInt();
				if(ls.delete(ob)){//SE LLAMA AL METODO CON LOS VALORES INTRODUCIDOS POR TECLADO
					print("Número eliminado");
				}else{
					print("No fue posible eliminar el numero =(\nNúmero no encontrado / Lista vacia");
				}
				break;
			case 9://CASE NUMERO NUEVE
				//SALIR
				print("Bye! =D");
				opc=10;//PONE A LA VARIABLE CONTROL DEL CICLO FURA DE LA CONDISION
				break;
			default://CASE DEFAULT
				print("Ingresa una opcion correcta!");
			}
		}while(opc!=9);//CIERRE DE DO-WHILE MIENTRAS LA OPCION SEA DIFERENTE A 9 SE REPETIRA.
		
		sc.close();//CIERRE DE LA CLASE ESCANER
	}
	
	public static void print(String a){//METODO PARA IMPRIMIR MAS RAPIDAMENTE
		System.out.print(a);//IMPRESION POR PANTALLA DE LA VARIABLE A
	}
}
