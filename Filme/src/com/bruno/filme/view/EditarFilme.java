package com.bruno.filme.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.bruno.filme.listener.*;

public class EditarFilme extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeDoFilme;
	private JTextField textFieldGenero;
	private JTextField textFieldAnoFilmagem;
	private JTextField textFieldAnoLancamento;
	private JTextField textFieldEstudio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarFilme frame = new CadastrarFilme();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditarFilme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEditarFilme = new JLabel("Editar Filme");
		lblEditarFilme.setBounds(141, 0, 171, 15);
		contentPane.add(lblEditarFilme);
		
		JLabel lblNomeDoFilme = new JLabel("Nome do Filme: ");
		lblNomeDoFilme.setBounds(12, 42, 123, 15);
		contentPane.add(lblNomeDoFilme);
		
		textFieldNomeDoFilme = new JTextField();
		textFieldNomeDoFilme.setBounds(153, 40, 265, 19);
		contentPane.add(textFieldNomeDoFilme);
		textFieldNomeDoFilme.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(12, 80, 70, 15);
		contentPane.add(lblGenero);
		
		textFieldGenero = new JTextField();
		textFieldGenero.setBounds(151, 78, 267, 19);
		contentPane.add(textFieldGenero);
		textFieldGenero.setColumns(10);
		
		JLabel lblAnoFilmagem = new JLabel("Ano Filmagem");
		lblAnoFilmagem.setBounds(12, 124, 113, 15);
		contentPane.add(lblAnoFilmagem);
		
		textFieldAnoFilmagem = new JTextField();
		textFieldAnoFilmagem.setBounds(153, 122, 265, 19);
		contentPane.add(textFieldAnoFilmagem);
		textFieldAnoFilmagem.setColumns(10);
		
		JLabel lblAnoLancamento = new JLabel("Ano Lancamento");
		lblAnoLancamento.setBounds(12, 163, 123, 19);
		contentPane.add(lblAnoLancamento);
		
		textFieldAnoLancamento = new JTextField();
		textFieldAnoLancamento.setBounds(153, 163, 265, 19);
		contentPane.add(textFieldAnoLancamento);
		textFieldAnoLancamento.setColumns(10);
		
		JLabel lblSinopse = new JLabel("Sinopse");
		lblSinopse.setBounds(12, 207, 70, 15);
		contentPane.add(lblSinopse);
		
		JTextPane textPaneSinopse = new JTextPane();
		textPaneSinopse.setBounds(153, 201, 265, 51);
		contentPane.add(textPaneSinopse);
		
		JLabel lblId = new JLabel("id: ");
		lblId.setBounds(12, 15, 406, 15);
		contentPane.add(lblId);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(151, 298, 117, 25);
				
		JLabel lblEstudioDeFilmagem = new JLabel("Estudio de Filmagem");
		lblEstudioDeFilmagem.setBounds(12, 276, 165, 15);
		contentPane.add(lblEstudioDeFilmagem);
		
		textFieldEstudio = new JTextField();
		textFieldEstudio.setBounds(198, 274, 220, 19);
		contentPane.add(textFieldEstudio);
		textFieldEstudio.setColumns(10);
		
		
		btnEditar.addActionListener(new EditarListener(Integer.valueOf(lblId.getText()), this.textFieldNomeDoFilme.getText(), 
				textPaneSinopse.getText(), textFieldGenero.getText(), textFieldEstudio.getText(),
				textFieldAnoLancamento.getText(), textFieldAnoFilmagem.getText()));
		
		contentPane.add(btnEditar);
		
	}
}
