package io.holiday.bot.endpoint;

import io.holiday.bot.records.Account;
import io.holiday.bot.records.CentralData;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestHandler
 */
@WebServlet("/RequestHandler")
public class RequestHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CentralData centralData=new CentralData();

    /**
     * Default constructor. 
     */
    public RequestHandler() {
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String channel = request.getParameter("channel");
		 String contextobj = request.getParameter("contextobj");
		 String senderobj = request.getParameter("senderobj");
		 String messageobj = request.getParameter("messageobj");
		 String botname = request.getParameter("botname");
		if(centralData.getAccounts().get("") == null){
			
		}
		String intent="";
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
