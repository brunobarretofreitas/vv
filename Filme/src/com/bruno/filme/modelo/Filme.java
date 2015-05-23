package com.bruno.filme.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bruno.filme.contrato.IFilme;
import com.bruno.filme.contrato.IPessoa;
import com.bruno.filme.iterator.PessoaIterator;

public class Filme implements IFilme{

	private int id;
	private String titulo;
	private String sinopse;
	private String genero;
	private IPessoa diretor;
	private List<IPessoa> atores;
	private String anoFilmagem;
	private String anoLancamento;
	private String estudioFilmagem;
	
	public Filme() {
		// TODO Auto-generated constructor stub
		this.atores = new ArrayList<IPessoa>();
	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return this.titulo;
	}

	@Override
	public void setTitulo(String titulo) {
		// TODO Auto-generated method stub
		this.titulo = titulo;
	}

	@Override
	public String getSinopse() {
		// TODO Auto-generated method stub
		return this.sinopse;
	}

	@Override
	public void setSinopse(String sinopse) {
		// TODO Auto-generated method stub
		this.sinopse = sinopse;
	}

	@Override
	public String getGenero() {
		// TODO Auto-generated method stub
		return this.genero;
	}

	@Override
	public void setGenero(String genero) {
		// TODO Auto-generated method stub
		this.genero = genero;
	}

	@Override
	public IPessoa getDiretor() {
		// TODO Auto-generated method stub
		return this.diretor;
	}

	@Override
	public void setDiretor(IPessoa diretor) {
		// TODO Auto-generated method stub
		this.diretor = diretor;
	}

	@Override
	public Iterator<IPessoa> getAtores() {
		// TODO Auto-generated method stub
		Iterator<IPessoa> atoresRetorno = new PessoaIterator(this.atores);
		return atoresRetorno;
	}

	@Override
	public void setAtores(Iterator<IPessoa> atores) {
		// TODO Auto-generated method stub
		while(atores.hasNext()){
			this.atores.add(atores.next());
		}
	}

	@Override
	public String getAnoFilmagem() {
		// TODO Auto-generated method stub
		return anoFilmagem;
	}

	@Override
	public void setAnoFilmagem(String anoFilmagem) {
		// TODO Auto-generated method stub
		this.anoFilmagem = anoFilmagem;
	}

	@Override
	public String getAnoLancamento() {
		// TODO Auto-generated method stub
		return anoLancamento;
	}

	@Override
	public void setAnoLancamento(String anoLancamento) {
		// TODO Auto-generated method stub
		this.anoLancamento = anoLancamento;
	}

	@Override
	public String getEstudioDeFilmagem() {
		// TODO Auto-generated method stub
		return this.estudioFilmagem;
	}

	@Override
	public void setEstudioDeFilmagem(String estudioDeFilmagem) {
		// TODO Auto-generated method stub
		this.estudioFilmagem = estudioDeFilmagem;
	}
	
	
}
