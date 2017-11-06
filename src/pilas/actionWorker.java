package pilas;

import javax.swing.JOptionPane;

public class actionWorker {
	
	private cells top=null;
	@SuppressWarnings("unused")
	private int limit=3,actual=0;
	public void setLimit(int i){
		this.limit=i;
	}
	public int getLimit(){
		return this.limit;
	}
	public boolean isEmpty(){
		boolean flag= false;
		if(this.top==null) flag=true;
		return flag;
	}
	public void insert(worker wr){
		cells newCell = new cells();
		newCell.setWrk(wr);
		newCell.setNextWrk(null);
		top=newCell;
		this.actual++;
	}
	public boolean push(worker wr){
		if(count()<limit){
			if(isEmpty()){
				insert(wr);
				this.actual++;
				return true;
			}else{
				cells newCell = new cells();
				newCell.setWrk(wr);
				newCell.setNextWrk(top);
				top=newCell;
				this.actual++;
				return true;
			}
		}else{
			JOptionPane.showMessageDialog(null, "Llegaste al limite de celdas que es "+limit);
			return false;
		}
	}
	public boolean pop(){
		if(isEmpty()){
			return false;
		}else{
			if(top.getNextWrk()!=null){
				cells temporal = new cells();
				temporal=top.getNextWrk();
				top=null;
				top=temporal;
				this.actual--;
				return true;
			}else{
				top=null;
				this.actual--;
				return true;
			}
			
		}
	}
	public StringBuilder printBattery(){
		StringBuilder chain = new StringBuilder();
		
		if(isEmpty()){
			chain.append("Pila vacia");
		}else{
			cells temporal = top;
			 while(temporal!=null){
				 chain.append("|"+temporal.getWrk().getName()+"|->");
				 temporal=temporal.getNextWrk();
			 }
			 chain.append("Null");
		}
		
		return chain;
	}
	public int count(){
		int c =0;
		cells temporal = this.top;
		while(temporal!=null){
			temporal=temporal.getNextWrk();
			c++;
		}
			
		return c;
	}
	public boolean full(){
		if(count()<limit){
			return true;
		}else{
			return false;
		}
	}
}