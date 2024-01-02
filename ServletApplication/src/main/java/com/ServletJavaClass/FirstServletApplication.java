package com.ServletJavaClass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myServlet")
public class FirstServletApplication extends HttpServlet {
	
	//service method to Handle the req and give the resp to client:one of the lifecycle method
	public void service(HttpServletRequest req ,HttpServletResponse resp) {
		try {
			System.out.println("Servlet");
			PrintWriter pw = resp.getWriter();
			
			//below method with resp obj resposible for sending the response to client in html format using setContentType() method
			resp.setContentType("text/html");
			pw.print("<h1>Welcome to servlet Programming</h1>");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
