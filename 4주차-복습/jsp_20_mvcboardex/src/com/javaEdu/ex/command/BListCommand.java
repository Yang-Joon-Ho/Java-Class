package com.javaEdu.ex.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaEdu.ex.dao.BDao;
import com.javaEdu.ex.dto.BDto;

//뷰를 보여주는 경우와 수정이나 글 추가등의 작업을 하는 것과 형태가 약간 다르다.
public class BListCommand implements BCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		request.setAttribute("list", dtos);
	}

}
