package br.com.senaibrasilia.projetoinical;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Login extends JFrame implements ActionListener{
	
	private JButton btnLogar;
	private FlowLayout layout;
	private Container container;
	public Login() {
		super();
		layout = new FlowLayout();
		container = getContentPane();
		btnLogar = new JButton("Logar");
		add(btnLogar);
		setLayout(layout);
		btnLogar.addActionListener(this);
		setSize(800, 600);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null, "Você clicou aqui!");
		
	}

}
