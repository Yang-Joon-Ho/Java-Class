package com.javaEdu.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaEdu.ex.dao.BDao;
import com.javaEdu.ex.dto.BDto;

public class BReplyViewCommand implements BCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String bId = request.getParameter("bId");
		BDao dao = new BDao();
		BDto dto = dao.reply_view(bId);
		
		//reply_view page로 갈건데 dto 가지고 가라
		request.setAttribute("reply_view", dto);
	}

}
