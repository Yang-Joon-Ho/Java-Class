package com.javaEdu.ex.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaEdu.ex.dao.BDao;
import com.javaEdu.ex.dto.BDto;

//�並 �����ִ� ���� �����̳� �� �߰����� �۾��� �ϴ� �Ͱ� ���°� �ణ �ٸ���.
public class BListCommand implements BCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		request.setAttribute("list", dtos);
	}

}
