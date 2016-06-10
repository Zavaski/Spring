package com.pucpr.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Component;

@Component
public class ConexaoBD {
	
	private final static String CONNECTION_STRING ="jdbc:mysql://localhost/lojajdbc?user=root&password=89ygf7";
	static{
		try{
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch(IllegalAccessError e){
				e.printStackTrace();
				}
			}
		catch(InstantiationException e){
			throw new RuntimeException("não foi possivel carregar o driver do MySQL" + e.getMessage());
		}
	} 
	public Connection obterConexao(){
		try{
			return DriverManager.getConnection(CONNECTION_STRING);
		}catch(Exception e){
			throw new RuntimeException("Não foi possivel obter uma conexao com MySQL" + e.getMessage());
		}
		
	}
	}
