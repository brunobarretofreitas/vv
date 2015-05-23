package com.bruno.filme.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import com.bruno.filme.contrato.IPessoa;

public class PessoaIterator implements Iterator<IPessoa>{
	
	private List<IPessoa> atores; 
	private int iterator;
	
	
	public PessoaIterator(List<IPessoa> atores) {
		// TODO Auto-generated constructor stub
		this.atores = atores;
		iterator =  0;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(iterator < atores.size())
			return true;
		else 
			return false;
	}

	@Override
	public IPessoa next() {
		// TODO Auto-generated method stub
		return atores.get(iterator++);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		this.atores.remove(iterator);
	}

}
