package com.Killer.controladordedatos;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Killer.model.Producto;

/**
 * Servlet implementation class ServeleteControler
 */
public class ServeleteControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeleteControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String acction = request.getParameter("btn");
		
		EntityManager em;
		EntityManagerFactory emf;
		
		emf = Persistence.createEntityManagerFactory("JPA-HIBERNATE-1");
		em = emf.createEntityManager();
		
		Producto p = new Producto();
		
		try {
		String id = request.getParameter("id");
		String nombreP = request.getParameter("Nproductos");
		String precioP = request.getParameter("Pproductos");
		String cantidadP = request.getParameter("Cproductos");
		String totalP = request.getParameter("Tproductos");
		
		
		p.setIdproducto(Integer.parseInt(id));
		p.setNombreProducto(nombreP);
		p.setPrecioProducto(Double.parseDouble(precioP));
		p.setCantidadProducto(Integer.parseInt(cantidadP));
		p.setTotalProduto(Double.parseDouble(totalP));
		
		
		
		}catch(Exception e) {
			
		}
		
		if(acction.equals("agregar")) {
			
			
			
			em.getTransaction().begin();
	        em.persist(p);
			em.flush();
			em.getTransaction().commit();
			
		
			
			
		
				
		}else if(acction.equals("eliminar")) {
			
		
			em.getTransaction().begin();
			p = em.getReference(Producto.class, p.getIdproducto());
			em.remove(p);
			em.flush();
			em.getTransaction().commit();
			
			
		}else if(acction.equals("modificar")) {
			
			em.getTransaction().begin();
			em.merge(p);
			em.flush();
			em.getTransaction().commit();
			
			
			
		}
				
		
		response.sendRedirect("index.jsp");	
		
	}
	
	

}
