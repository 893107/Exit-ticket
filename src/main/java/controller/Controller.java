package controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/con")
public class Controller extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String name = request.getParameter("name");
		if (name.equals("김세진")) {

			System.out.println(name);
			request.getRequestDispatcher("KSJ.html").forward(request, response);

		} else if (name.equals("김진원")) {

			System.out.println(name);
			request.getRequestDispatcher("KJW.html").forward(request, response);

		} else if (name.equals("임가영")) {
			
			System.out.println(name);
			request.getRequestDispatcher("LGY.html").forward(request, response);
		} else {
			System.out.println("팀원의 이름이 아닙니다.");
			request.getRequestDispatcher("Fail.html").forward(request, response);
		}
	}
}