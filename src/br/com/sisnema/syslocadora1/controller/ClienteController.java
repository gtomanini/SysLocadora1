package br.com.sisnema.syslocadora1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sisnema.syslocadora1.model.Pessoa;


@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		
		if("pesquisar".equals(acao)){
			pesquisar(request, response);
			
		}else if("excluir".equals(acao)){
			excluir(request, response);
			
		}else if("editar".equals(acao)){
			editar(request, response);
			
		}else if("inserir".equals(acao)){
			response.sendRedirect("clientes/clienteCrud.jsp");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		if("pesquisar".equals(acao)){
			pesquisar(request, response);
		}else if("salvar".equals(acao)){
			salvar(request, response);
		}
	}
	
	private void salvar(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		Pessoa clienteDaTela = new Pessoa();
		
		clienteDaTela.setNome(request.getParameter("nome"));
		clienteDaTela.setEstado(request.getParameter("estado"));
		clienteDaTela.setCidade(request.getParameter("cidade"));
		clienteDaTela.setEndereco(request.getParameter("endereco"));
		clienteDaTela.setUsuario(request.getParameter("usuario"));
		clienteDaTela.setSenha(request.getParameter("senha"));
		
		String id = request.getParameter("id");
			if(id != null && !id.equals("")){
				clienteDaTela.setId(Integer.valueOf(id));
				// vai no banco e altera o registro
			}	else{
				// vai no banco e insere o registro
			}
			
		pesquisar(request, response);
	}

	private void excluir(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		Pessoa clienteDaTela = new Pessoa(Integer.valueOf(request.getParameter("id")));
		
		//VAI AO BANCO E EXCLUI A PESSOA ID
		pesquisar(request, response);
	}
	
	private void editar(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		Pessoa clienteDaTela = new Pessoa(Integer.valueOf(request.getParameter("id")));
		Pessoa clienteDoBanco = null;
		
		//VAI AO BANCO E BUSCA INFORMAÇÕES DO ID INFORMADO
		request.setAttribute("cliente", clienteDoBanco);
		
		request.getRequestDispatcher("clientes/clienteCrud.jsp").forward(request, response);
		
		
	}
	
	private void pesquisar(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		Pessoa clienteDaTela = new Pessoa();
		
		clienteDaTela.setNome(request.getParameter("nomePesq"));
		clienteDaTela.setEstado(request.getParameter("estadoPesq"));
		clienteDaTela.setCidade(request.getParameter("cidadePesq"));
		
		List<Pessoa> clientesDoBanco = null;
		
		request.setAttribute("clientes", clientesDoBanco);
		
		//RECUPERAR E ALTERAR O DESTINO DA REQUISIÇÃO, ENCAMINHANDO PARA CLIENTELIST.JSP
		request.getRequestDispatcher("clientes/clienteList.jsp")
								.forward(request, response);
		
		
		
		response.sendRedirect("clientes/clienteList.jsp");
	}
	
	
	
}
