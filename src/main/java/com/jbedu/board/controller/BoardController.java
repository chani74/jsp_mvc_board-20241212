package com.jbedu.board.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do") //컨트롤러 기능의 클래스로 서버가 인식하도록 함
public class BoardController extends HttpServlet{

	public BoardController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet 호출!");
		
		request.setCharacterEncoding("utf-8");
		
		String viewPage = "list.jsp"; //글 목록 페이지 파일 이름
		
		String uri = request.getRequestURI();//http://localhost:8888/jsp_mvc_board-20241212/list.jsp
		String conPath = request.getContextPath();//http://localhost:8888/
		String com = uri.substring(conPath.length());//uri - conPath(길이)->/jsp_mvc_board-20241212/list.jsp
		
		System.out.println(uri);
		System.out.println(conPath);
		System.out.println(com);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
		
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}