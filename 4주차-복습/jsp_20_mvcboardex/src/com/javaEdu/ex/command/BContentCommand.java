package com.javaEdu.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaEdu.ex.dao.BDao;
import com.javaEdu.ex.dto.BDto;

public class BContentCommand implements BCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String bId = request.getParameter("bId");
		BDao dao = new BDao();
		BDto dto = dao.contentView(bId);
		
		//content_view로 이동하면서 dto까지 같이 주면서 포워딩 함. 
		request.setAttribute("content_view", dto);
	}
}
