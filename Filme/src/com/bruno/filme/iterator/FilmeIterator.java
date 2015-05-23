package com.bruno.filme.iterator;

import java.util.Iterator;
import java.util.List;

import com.bruno.filme.contrato.IFilme;
import com.bruno.filme.contrato.IPessoa;

public class FilmeIterator implements Iterator<IFilme>{

private List<IFilme> filmes; 
	
	private int iterator;
	
	public FilmeIterator(List<IFilme> filmes) {
		// TODO Auto-generated constructor stub
		this.filmes = filmes;
		iterator = 0;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(iterator < filmes.size())
			return true;
		else 
			return false;
	}

	@Override
	public IFilme next() {
		// TODO Auto-generated method stub
		return filmes.get(iterator++);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		this.filmes.remove(iterator);
	}
	
	
}
