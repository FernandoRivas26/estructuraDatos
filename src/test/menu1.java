package test;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
@SuppressWarnings("serial")
public class menu1 extends JFrame {

	public menu1(){
		super("MENU 1");
		setVisible(true);
		setTitle("Menu 1");
		setSize(500,400);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("MENU 2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu2 m2 = new menu2();
				m2.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(17, 20, 117, 29);
		getContentPane().add(btnNewButton);
		//CODIGO MAMALON!!
	}
	public static void main(String[] args){
		new menu1();
	}
}
