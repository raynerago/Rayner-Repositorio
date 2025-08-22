package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NotasAluno extends JFrame {
	
	private JLabel lbDisciplina;
	private JLabel lbNota;
	private JLabel lbNota2;
	private JLabel lbNota3;
	private JLabel lbNota4;
	private JTextField txDisciplina;
	private JTextField txNota;
	private JTextField txNota2;
	private JTextField txNota3;
	private JTextField txNota4;
	private JButton btExibirMedia;
	
	public NotasAluno() {
		
		setTitle("Média ALunos");
		setSize(350, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setBackground(Color.GRAY);
		
		
		lbDisciplina = new JLabel();
		lbDisciplina.setText("Disciplina: ");
		lbDisciplina.setBounds(80, 50, 100, 30);
		add (lbDisciplina);
		
		lbNota = new JLabel();
		lbNota.setText("Nota 1: ");
		lbNota.setBounds(80, 100, 100, 30);
		add (lbNota);
		
		lbNota2 = new JLabel();
		lbNota2.setText("Nota 2: ");
		lbNota2.setBounds(80, 150, 100, 30);
		add (lbNota2);
		
		lbNota3 = new JLabel();
		lbNota3.setText("Nota 3: ");
		lbNota3.setBounds(80, 200, 100, 30);
		add (lbNota3);
		
		lbNota4 = new JLabel();
		lbNota4.setText("Nota 4: ");
		lbNota4.setBounds(80, 250, 100, 30);
		add (lbNota4);
		
		txDisciplina = new JTextField();
		txDisciplina.setBounds(180, 50, 100, 30);
		add (txDisciplina);
		
		txNota = new JTextField();
		txNota.setBounds(180, 100, 100, 30);
		add (txNota);
		
		txNota2 = new JTextField();
		txNota2.setBounds(180, 150, 100, 30);
		add (txNota2);
		
		txNota3 = new JTextField();
		txNota3.setBounds(180, 200, 100, 30);
		add (txNota3);
		
		txNota4 = new JTextField();
		txNota4.setBounds(180, 250, 100, 30);
		add (txNota4);
		
		
		
		
		btExibirMedia = new JButton();
		btExibirMedia.setForeground(Color.WHITE);
		btExibirMedia.setBackground(Color.BLACK);
		btExibirMedia.setText("Exibir Média");
		btExibirMedia.setBounds(100, 300, 150, 30);
		btExibirMedia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nota = txNota.getText();
				int notaConvertida1 = Integer.parseInt(nota);
				
				String nota2 = txNota2.getText();
				int notaConvertida2 = Integer.parseInt(nota2);
				
				String nota3 = txNota3.getText();
				int notaConvertida3 = Integer.parseInt(nota3);
				
				String nota4 = txNota4.getText();
				int notaConvertida4 = Integer.parseInt(nota4);
				
				int media = (notaConvertida1 + notaConvertida2 + notaConvertida3 + notaConvertida4) / 4;
				
				String disciplina = txDisciplina.getText();
				JOptionPane.showMessageDialog(null, "A sua média de notas na disciplina de " + disciplina + 
													" é " + media);
					
				
			}
		});
		add (btExibirMedia);
		
		setVisible(true);
	}

}
