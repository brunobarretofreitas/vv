package com.bruno.filme.iterator;

import java.util.Iterator;
import java.util.List;

import com.bruno.filme.contrato.IFilme;
import com.bruno.filme.contrato.IPessoa;

public class FilmeIterator implements Iterator<IFilme>{

private List<IFilme> filmes; 
	
	public FilmeIterator(List<IFilme> filmes) {
		// TODO Auto-generated constructor stub
		this.filmes = filmes;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(filmes.size() > 0)
			return true;
		else 
			return false;
	}

	@Override
	public IFilme next() {
		// TODO Auto-generated method stub
		return filmes.get(0);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		this.filmes.remove(0);
	}
	
	
}
