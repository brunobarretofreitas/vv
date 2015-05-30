package com.bruno.filme.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class VisualizacaoFilme extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizacaoFilme frame = new VisualizacaoFilme();
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
	public VisualizacaoFilme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeDoFilme = new JLabel("NOME DO FILME");
		lblNomeDoFilme.setBounds(141, 0, 161, 15);
		contentPane.add(lblNomeDoFilme);
		
		JLabel lblAnoFilmagem = new JLabel("Ano Filmagem:");
		lblAnoFilmagem.setBounds(12, 42, 406, 15);
		contentPane.add(lblAnoFilmagem);
		
		JLabel lblAnoLancamento = new JLabel("Ano Lancamento:");
		lblAnoLancamento.setBounds(12, 71, 406, 15);
		contentPane.add(lblAnoLancamento);
		
		JLabel lblDiretor = new JLabel("Diretor:");
		lblDiretor.setBounds(12, 98, 406, 15);
		contentPane.add(lblDiretor);
		
		JLabel lblSinopse = new JLabel("Sinopse:");
		lblSinopse.setBounds(12, 125, 70, 15);
		contentPane.add(lblSinopse);
		
		JTextPane textPaneSinopse = new JTextPane();
		textPaneSinopse.setBounds(86, 125, 332, 68);
		contentPane.add(textPaneSinopse);
		
		JLabel lblAtores = new JLabel("Atores:");
		lblAtores.setBounds(12, 225, 70, 15);
		contentPane.add(lblAtores);
		
		JTextArea textAreaAtores = new JTextArea();
		textAreaAtores.setBounds(86, 225, 332, 118);
		contentPane.add(textAreaAtores);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(12, 374, 406, 15);
		contentPane.add(lblGenero);
		
		JLabel lblEstudioDeFilmagem = new JLabel("Estudio de Filmagem: ");
		lblEstudioDeFilmagem.setBounds(12, 430, 406, 15);
		contentPane.add(lblEstudioDeFilmagem);
	}
}
