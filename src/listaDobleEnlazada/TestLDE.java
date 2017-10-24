package listaDobleEnlazada;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TestLDE extends JFrame{
	public int opc=0, x=300,y=300;
	private JTextField mat, author, song, album, style;
	private listaDobleEnlazada lde = new listaDobleEnlazada();
	public TestLDE(){
		super("Listas Doblemente Enlazadas");
		setResizable(false);
		setTitle("Inicio Sesion");
		setSize(277, 477);
		setVisible(true);
		
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JPanel menuPrincipal = new JPanel();
		menuPrincipal.setBackground(Color.GRAY);
		menuPrincipal.setBounds(6, 47, 260, 401);
		menuPrincipal.setVisible(true);
		
		getContentPane().add(menuPrincipal);
		menuPrincipal.setLayout(null);
		
		JButton borrarNodo = new JButton("ELIMINAR PRIMER NODO");
		borrarNodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lde.deleteFirstNode()){
					JOptionPane.showMessageDialog(TestLDE.this,"Nodo eliminado =)");
				}else{
					JOptionPane.showMessageDialog(TestLDE.this, "Lista vacia, no hay nodos por eliminar =(");
				}
			}
		});
		borrarNodo.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		borrarNodo.setBounds(6, 136, 248, 53);
		menuPrincipal.add(borrarNodo);
		
		JButton borrarNodoFinal = new JButton("ELIMINAR ULTIMO NODO");
		borrarNodoFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lde.deleteLastNode()){
					JOptionPane.showMessageDialog(TestLDE.this,"Nodo eliminado =)");
				}else{
					JOptionPane.showMessageDialog(TestLDE.this, "Lista vacia, no hay nodos por eliminar =(");
				}
			}
		});
		borrarNodoFinal.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		borrarNodoFinal.setBounds(6, 201, 248, 53);
		menuPrincipal.add(borrarNodoFinal);
		
		JButton btnRecorrerAlFrente = new JButton("RECORRER AL FRENTE");
		btnRecorrerAlFrente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(TestLDE.this, lde.printAhead());
			}
		});
		btnRecorrerAlFrente.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnRecorrerAlFrente.setBounds(6, 266, 248, 53);
		menuPrincipal.add(btnRecorrerAlFrente);
		
		JButton btnRecorrerAtras = new JButton("RECORRER ATRAS");
		btnRecorrerAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(TestLDE.this, lde.printBackward());
			}
		});
		btnRecorrerAtras.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnRecorrerAtras.setBounds(6, 331, 248, 53);
		menuPrincipal.add(btnRecorrerAtras);
		
		JLabel lblMenPrincipal = new JLabel("MENÚ PRINCIPAL");
		lblMenPrincipal.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblMenPrincipal.setBounds(58, 19, 171, 16);
		getContentPane().add(lblMenPrincipal);
		
		JPanel insertBeg = new JPanel();
		insertBeg.setBackground(Color.GRAY);
		insertBeg.setBounds(6, 47, 315, 401);
		getContentPane().add(insertBeg);
		insertBeg.setLayout(null);
		insertBeg.setVisible(false);
		
		JLabel lblNuevoAlumno = new JLabel("Matricula: ");
		lblNuevoAlumno.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNuevoAlumno.setBackground(Color.WHITE);
		lblNuevoAlumno.setBounds(6, 21, 300, 29);
		insertBeg.add(lblNuevoAlumno);
		
		mat = new JTextField();
		mat.setBounds(6, 49, 300, 34);
		insertBeg.add(mat);
		mat.setColumns(10);
		
		JLabel lblAut = new JLabel("Autor:");
		lblAut.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblAut.setBackground(Color.WHITE);
		lblAut.setBounds(6, 84, 300, 29);
		insertBeg.add(lblAut);
		
		author = new JTextField();
		author.setColumns(10);
		author.setBounds(6, 112, 300, 34);
		insertBeg.add(author);
		
		JLabel lblCancin = new JLabel("Canción: ");
		lblCancin.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblCancin.setBackground(Color.WHITE);
		lblCancin.setBounds(6, 147, 300, 29);
		insertBeg.add(lblCancin);
		
		song = new JTextField();
		song.setColumns(10);
		song.setBounds(6, 175, 300, 34);
		insertBeg.add(song);
		
		JLabel lblAlbum = new JLabel("Album: ");
		lblAlbum.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblAlbum.setBackground(Color.WHITE);
		lblAlbum.setBounds(6, 209, 300, 29);
		insertBeg.add(lblAlbum);
		
		album = new JTextField();
		album.setColumns(10);
		album.setBounds(6, 237, 300, 34);
		insertBeg.add(album);
		
		style = new JTextField();
		style.setColumns(10);
		style.setBounds(6, 299, 300, 34);
		insertBeg.add(style);
		
		JLabel lblEstilo = new JLabel("Estilo: ");
		lblEstilo.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblEstilo.setBackground(Color.WHITE);
		lblEstilo.setBounds(6, 271, 300, 29);
		insertBeg.add(lblEstilo);
		
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertBeg.setVisible(false);
				menuPrincipal.setVisible(true);
				setSize(272,477);
				setTitle("Inicio Sesion");
				lblMenPrincipal.setText("MENÚ PRINCIPAL");
				lblMenPrincipal.setBounds(58, 19, 171, 16);
				
			}
		});
		btnCancelar.setBounds(6, 342, 80, 43);
		insertBeg.add(btnCancelar);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton insertatPrincipio = new JButton("INSERTAR NODO AL PRINCIPIO");
		insertatPrincipio.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		insertatPrincipio.setBounds(6, 6, 248, 53);
		menuPrincipal.add(insertatPrincipio);
		insertatPrincipio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertBeg.setVisible(true);
				menuPrincipal.setVisible(false);
				setSize(327,475);
				setTitle("Insertar al Principio");
				lblMenPrincipal.setText("INSERTAR ALUMNO");
				lblMenPrincipal.setBounds(80, 0, 200, 40);
				opc=1;
			}
		});
		
		JButton insertatFinal = new JButton("INSERTAR NODO AL FINAL");
		insertatFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertBeg.setVisible(true);
				menuPrincipal.setVisible(false);
				setSize(327,475);
				setTitle("Insertar al Final");
				lblMenPrincipal.setText("INSERTAR ALUMNO");
				lblMenPrincipal.setBounds(80, 0, 200, 40);
				opc=2;
			}
		});
		insertatFinal.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		insertatFinal.setBounds(6, 71, 248, 53);
		menuPrincipal.add(insertatFinal);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				music newSong = new music();
				boolean flag=false;
				if(mat.getText().isEmpty() || author.getText().isEmpty() || album.getText().isEmpty() || style.getText().isEmpty() || song.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Asegurate de llenar todos los campos!");
					flag=false;
				}else{
					try{
						newSong.setId(Integer.parseInt(mat.getText()));
						newSong.setAlbum(album.getText());
						newSong.setAuthor(author.getText());
						newSong.setmStyle(style.getText());
						newSong.setSong(song.getText());
						flag=true;
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Ingresa un valor numerico en matricula");
						flag=false;
					}
					System.out.println(newSong.ToString());
				}
				if(flag){
					switch(opc){
					case 1:
						lde.insertBeginning(newSong);
						JOptionPane.showMessageDialog(null, "Nodo agregado al principio");
						break;
					case 2:
						lde.insertEnd(newSong);
						JOptionPane.showMessageDialog(null, "Nodo agregado al final");
						break;
					}
				}
				
				insertBeg.setVisible(false);
				menuPrincipal.setVisible(true);
				setSize(272,477);
				setTitle("Inicio Sesion");
				lblMenPrincipal.setText("MENÚ PRINCIPAL");
				lblMenPrincipal.setBounds(58, 19, 171, 16);
			}
		});
		btnGuardar.setBounds(86, 342, 80, 43);
		insertBeg.add(btnGuardar);
		
		JLabel lblRivasOntiverosEdgar = new JLabel("Rivas Ontiveros Edgar Fernando");
		lblRivasOntiverosEdgar.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		lblRivasOntiverosEdgar.setBounds(6, 6, 260, 16);
		getContentPane().add(lblRivasOntiverosEdgar);
	}
	public static void main(String[] args){
		new TestLDE();
	}
}