package listaDobleEnlazada;
public class listaDobleEnlazada {
	private node head;
	public node getHead() {
		return head;
	}
	public void setHead(node cabeza) {
		this.head = cabeza;
	}
	public boolean isEmpty(){
		boolean resp=false;
		if(this.head==null){
			resp=true;
		}
		return resp;
	}
	public void insert (music valor){
		node nuevo = new node();
		nuevo.setValue(valor);
		nuevo.setNext(null);
		nuevo.setBefore(null);
		this.head=nuevo;
	}
	public void insertBeginning (music valor){
		if(isEmpty()){
			insert(valor);
		}else{
			node nuevo = new node();
			nuevo.setValue(valor);
			nuevo.setNext(this.head);
			this.head.setBefore(nuevo);
			nuevo.setBefore(null);
			this.head=nuevo;
		}
	}
	public void insertEnd(music valor){
		if(isEmpty()){
			insert(valor);
		}else{
			node nuevo = new node();
			nuevo.setValue(valor);
			nuevo.setNext(null);
			
			node temporal = this.head;
			while(temporal.getNext()!=null){	
				temporal=temporal.getNext();
			}
			temporal.setNext(nuevo);
			nuevo.setBefore(temporal);
		}
	}
	public boolean deleteNode(int pos){
		boolean flag=false;
		int n = count();
		if(isEmpty()){
			flag=false;
		}else if (n==1){
			this.setHead(this.head.getNext());
			head.setBefore(null);
		}else{
			node temporal=this.find(pos-1); 
			temporal.setNext(temporal.getNext().getNext());
			temporal.getNext().getNext().setBefore(temporal);
			flag=true;
		}
		
		return flag;
	}
	public  int count(){
		int resp=0;
		node temporal = this.head;
		while(temporal.getNext()!=null){
			resp++;
			temporal=temporal.getNext();
			}
		return resp;
	}
	public node find(int pos){
		node temporal=null, anterior=this.head;
		int i=0; 
		while(i<=pos){
			i++;
			anterior=temporal;
			temporal=temporal.getNext();
		}
		return anterior;
	}
	public StringBuilder printAhead(){
		StringBuilder cadena = new StringBuilder();
		cadena.append("Cabeza/Null <===>");
		node temporal = this.head;		
		while(temporal!=null){
			cadena.append(temporal.getValue().getSong()+"<===>");
			temporal=temporal.getNext();
		}
		cadena.append("Null");
		return cadena;
	}
	public StringBuilder printBackward(){
		StringBuilder cadena = new StringBuilder();
		if(isEmpty()){
			cadena.append("Null <===> Cabeza/Null");
		}else{
			cadena.append("Null <===>");
			node temporal = this.head;
			//System.out.print("While 1");
			while(temporal.getNext()!=null){
				//System.out.println(temporal.getValue().getSong());
				temporal=temporal.getNext();
			}
			//System.out.print("While 2");
			while(temporal!=null){
				//System.out.println(temporal.getValue().getSong());
				
					cadena.append(temporal.getValue().getSong()+"<===>");
					temporal=temporal.getBefore();
			}
			cadena.append("Cabeza/Null");
		}
		return cadena;
	}
	public boolean deleteFirstNode(){
		boolean flag=false;
		if(isEmpty()){
			flag=false;
		}else{
			node temporal=this.head;
			if(temporal.getNext()!=null){
				this.head=temporal.getNext();
				this.head.getBefore().setNext(null);
				this.head.setBefore(null);
				flag=true;
			}else{
				temporal.setBefore(null);
				temporal.setNext(null);
				this.head=null;
			}
			
		}
		return flag;
	}
	public boolean deleteLastNode(){
		boolean flag=false;
		if(isEmpty()){
			flag=false;
		}else{
			node temporal=this.head;
			if(temporal.getNext()==null){
				temporal.setBefore(null);
				temporal.setNext(null);
				this.head=null;
				flag=true;
			}else{
				while(temporal.getNext()!=null){
					temporal=temporal.getNext();
				}
				temporal.getBefore().setNext(null);
				temporal.setBefore(null);
				temporal.setNext(null);
				flag=true;
			}
			
		}
		return flag;
	}
}