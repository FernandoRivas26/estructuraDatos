package listaDobleEnlazada;
public class node {
	private music value;
	private node next, before;
	public music getValue() {
		return value;
	}
	public void setValue(music value) {
		this.value = value;
	}
	public node getNext() {
		return next;
	}
	public void setNext(node next) {
		this.next = next;
	}
	public node getBefore() {
		return before;
	}
	public void setBefore(node before) {
		this.before = before;
	}
}