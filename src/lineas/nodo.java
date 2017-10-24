package lineas;
public class nodo{
	int valor;//VARAIBLE TIPO ENTERO
	nodo sig;//VARIABLE DE TIPO NODO
	
	public void setVal(int val){//METODO PARA DAR UN VALOR AL NODO
		this.valor=val;
	}
	public int obtenerVal(){//METODO PARA PEDIR O SABER EL VALOR DE UN NODO
		return valor;
	}
	public void enlazarSig(nodo n){//METODO PARA ENLAZAR A UN NODO OTRO NODO.
		 sig = n;
	}
	public nodo objeterSig(){//METODO QUE ARROJA EL VALOR DEL NODO QUE LE SIGUE
		return  sig;
	}
}

