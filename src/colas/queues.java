package colas;
import javax.swing.JOptionPane;
public class queues {
private node pick;

public boolean isEmpty(){
	boolean flag= false;
	if(this.pick==null) flag=true;
	return flag;
}
public void insert(worker wr){
	node newNode = new node();
	newNode.setData(wr);
	newNode.setNext(null);
	pick=newNode;
}
public boolean enqueue(worker wr)/*INCERT*/{
	if(isEmpty()){
		insert(wr);
		return true;
	}else{
		node newNode = new node();
		newNode.setData(wr);
		newNode.setNext(null);
		node temporal = pick;
		while(temporal.getNext()!=null){
			temporal=temporal.getNext();
		}
		temporal.setNext(newNode);
		return true;
	}
}
public boolean dequeue()/*DELETE*/{
	if(isEmpty()){
		JOptionPane.showMessageDialog(null, "No hay datos por eliminar! =(");
		return false;
	}else{
		if(pick.getNext()!=null){
			node temporal = pick.getNext();
			pick=null;
			pick=temporal;
			return true;
		}else{
			pick=null;
			return true;
		}
	}
}
public StringBuilder print(){
	StringBuilder chain = new StringBuilder();
	node temporal = pick;
	chain.append("PICK->");
	while(temporal!=null){
		chain.append(temporal.getData().getName()+"->");
		temporal=temporal.getNext();
	}
	chain.append("NULL");
	return chain;
}
public String peak(){
	if(pick!=null){
		return this.pick.getData().getName();
	}else{
		return "Null";
	}
}
}