package com.guilherme.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>(10);
		
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("F");
		arrayList.add("G");
		
		System.out.println(arrayList);
		
		arrayList.add(2, "D");
		System.out.println(arrayList);
		
		//busca com contains
		boolean existe = arrayList.contains("A");
		if(existe == true) {
			System.out.println("Este item contém no array");
		} else {
			System.out.println("Desculpe, mas este item não está no array");
		}
		
		
		//busca com o indexOf
		int pos = arrayList.indexOf("B");
		
		if(pos > -1) {
			System.out.println("Existe no array");
		} else {
			System.out.println("Não existe no Array");
		}
		
		//busca por posição
		System.out.println(arrayList.get(5));
		
		//remover passando a posição
		arrayList.remove(3);
		
		//remover passando objeto, bem mais simples que o método
		arrayList.remove("G");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
		
		//sobrescrever o item de alguma posição
		arrayList.set(0, "A");
		System.out.println(arrayList);
		
	}

}
