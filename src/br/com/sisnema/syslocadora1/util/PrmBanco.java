package br.com.sisnema.syslocadora1.util;


public class PrmBanco {
	
	private final String url;
	private final String user;
	private final String password;
	
	public PrmBanco(String url, String user, String password) {
		super();
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
	
	
}
