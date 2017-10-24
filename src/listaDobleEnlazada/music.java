package listaDobleEnlazada;
public class music{
	private String mStyle, author, song, album;
	private int id; 
	public String getmStyle() {
		return mStyle;
	}
	public void setmStyle(String mStyle) {
		this.mStyle = mStyle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String ToString(){
		String cad = "ID: "+this.getId()+"| Cancion: "+this.getSong()+"| Autor: "+this.getAuthor(); 
		return cad;
	}
}