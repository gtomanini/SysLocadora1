package br.com.sisnema.syslocadora1.util;

import javax.servlet.ServletContext;

public class Util {

	public static PrmBanco obterPrmBanco(ServletContext contexto){
		
		return new PrmBanco(contexto.getInitParameter("URL"), 
							contexto.getInitParameter("USER"), 
							contexto.getInitParameter("PASSWORD"));
	}
	
}
