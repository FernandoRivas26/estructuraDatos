package pilas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
@SuppressWarnings("serial")
public class testPila extends JFrame{
	private JTextField tfNombre,tfDep,textField,tfId;
	public JPanel panel, panel_1;
	public actionWorker ak = new actionWorker();
	public testPila(){
		super("Pilas");
		setResizable(false);
		setTitle("Pilas de Datos");
		setSize(279, 381);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PILAS DE DATOS");
		lblNewLabel.setBounds(84, 6, 103, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rivas Ontiveros Edgar Fernando");
		lblNewLabel_1.setBounds(36, 23, 199, 16);
		getContentPane().add(lblNewLabel_1);
		
		panel_1 = new JPanel();
		panel_1.setVisible(true);
		panel_1.setBounds(6, 45, 265, 305);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("PUSH");
		btnNewButton.setBounds(9, 5, 250, 38);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				panel_1.setVisible(false);
				setSize(302, 422);
			}
		});
		panel_1.add(btnNewButton);
		
				
				JButton btnLimite = new JButton("LIMITE");
				btnLimite.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(testPila.this, "El limite de celdas es de "+ak.getLimit());
					}
				});
				btnLimite.setBounds(9, 107, 253, 38);
				panel_1.add(btnLimite);
				panel_1.add(btnLimite);
		
		JButton btnPop = new JButton("POP");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(testPila.this, "¿Deseas eliminar la celda?")==0){
					if(ak.pop()){
						JOptionPane.showMessageDialog(testPila.this, "Celda eliminado");
					}else{
						JOptionPane.showMessageDialog(testPila.this, "No fue posible eliminar la celda\nNo existen datos dentro de la pila","ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnPop.setBounds(9, 56, 250, 38);
		panel_1.add(btnPop);
		panel_1.add(btnPop);
		
		JButton btnImprimir = new JButton("IMPRIMIR");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(testPila.this,ak.printBattery());
			}
		});
		btnImprimir.setBounds(9, 157, 250, 38);
		panel_1.add(btnImprimir);
		panel_1.add(btnImprimir);
		
		JButton btnFull = new JButton("FULL");
		btnFull.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ak.full()){
					JOptionPane.showMessageDialog(testPila.this, "Espacio disponible: "+ak.count()+"/"+ak.getLimit());
				}else{
					JOptionPane.showMessageDialog(testPila.this, "No hay espacio disponible: "+ak.count()+"/"+ak.getLimit());
				}
			}
		});
		btnFull.setBounds(9, 207, 250, 38);
		panel_1.add(btnFull);
		
		JButton btnNuevoLimite = new JButton("NUEVO LIMITE");
		btnNuevoLimite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ak.setLimit(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo limite de celdas\nLimite anterior:"+ak.getLimit()+"\nNuevo Limite:")));
			}
		});
		btnNuevoLimite.setBounds(9, 257, 250, 38);
		panel_1.add(btnNuevoLimite);

		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Capturar Trabajador", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(6, 45, 293, 349);
		getContentPane().add(panel);
		panel.setLayout(null);
		setVisible(false);
		
		JButton btnNewButton_1 = new JButton("CANCELAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNombre.setText("");
				tfDep.setText("");
				textField.setText("");
				tfId.setText("");
				panel.setVisible(false);
				panel_1.setVisible(true);
				setSize(279, 381);
			}
		});
		btnNewButton_1.setBounds(6, 306, 142, 29);
		panel.add(btnNewButton_1);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				worker wr = new worker();
				if(tfNombre.getText().isEmpty() || tfDep.getText().isEmpty() || textField.getText().isEmpty() || tfId.getText().isEmpty()){
					JOptionPane.showMessageDialog(testPila.this, "Asegurate de llenar todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
				}else{
					wr.setId_worker(Integer.parseInt(tfId.getText()));
					wr.setName(tfNombre.getText());
					wr.setDepartment(tfDep.getText());
					wr.setWork(textField.getText());
					if(ak.push(wr)){
						JOptionPane.showMessageDialog(testPila.this, "Trabajador incertado");
						tfNombre.setText("");
						tfDep.setText("");
						textField.setText("");
						tfId.setText("");
						panel.setVisible(false);
						panel_1.setVisible(true);
						setSize(279, 381);
					}else{
						JOptionPane.showMessageDialog(testPila.this, "No fue posible guardar los datos","ERROR",JOptionPane.ERROR_MESSAGE);	
					}
				}
				
			}
		});
		btnGuardar.setBounds(145, 306, 142, 29);
		panel.add(btnGuardar);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(6, 115, 281, 41);
		panel.add(tfNombre);
		tfNombre.setColumns(10);
		tfNombre.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				tfNombre.setText(tfNombre.getText().toUpperCase());
			}
		});
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(6, 98, 61, 16);
		panel.add(lblNombre);
		
		JLabel lblDepartamento = new JLabel("Departamento:");
		lblDepartamento.setBounds(6, 168, 131, 16);
		panel.add(lblDepartamento);
		
		tfDep = new JTextField();
		tfDep.setColumns(10);
		tfDep.setBounds(6, 184, 281, 42);
		panel.add(tfDep);
		tfDep.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				tfDep.setText(tfDep.getText().toUpperCase());
			}
		});
		
		JLabel lblPuesto = new JLabel("Puesto:");
		lblPuesto.setBounds(6, 238, 131, 16);
		panel.add(lblPuesto);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(6, 253, 281, 41);
		textField.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				textField.setText(textField.getText().toUpperCase());
			}
		});
		panel.add(textField);
		
		JLabel lblIdTrabajador = new JLabel("ID Trabajador");
		lblIdTrabajador.setBounds(6, 28, 115, 16);
		panel.add(lblIdTrabajador);
		
		tfId = new JTextField();
		tfId.setColumns(10);
		tfId.setBounds(6, 45, 281, 41);
		panel.add(tfId);
		tfId.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				tfId.setText(tfId.getText().toUpperCase());
			}
		});
		setVisible(true);
		
		
	}
	public static void main(String[] args){
		new testPila();
	}
}
