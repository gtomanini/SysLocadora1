package br.com.sisnema.syslocadora1.model;

import java.io.Serializable;

public class Pessoa implements Serializable{
 
		private static final long serialVersionUID = -1077573104242693416L;
		private int id;
		private String nome;
		private String endereco;
		private String cidade;
		private String estado;
		private String usuario;
		private String senha;
		
		public Pessoa(int id) {
			super();
			this.id = id;
		}
		
		
		
		public Pessoa() {
			// TODO Auto-generated constructor stub
		}



		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pessoa other = (Pessoa) obj;
			if (id != other.id)
				return false;
			return true;
		}



		@Override
		public String toString() {
			return "Pessoa [id=" + id + ", nome=" + nome + ", endereco="
					+ endereco + ", cidade=" + cidade + ", estado=" + estado
					+ ", usuario=" + usuario + ", senha=" + senha + "]";
		}
		
		
		
		
	
}
