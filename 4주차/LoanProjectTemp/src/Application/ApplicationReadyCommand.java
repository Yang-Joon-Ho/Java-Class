package Application;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Command.Command;
import com.Users.UserDao;
import com.Users.UserDto;

public class ApplicationReadyCommand implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		//get id from request
		String id = request.getParameter("id");
		
		UserDao dao = UserDao.getInstance();
		UserDto dto = new UserDto();
		
		dto = dao.getMember(id);
		
		request.setAttribute("dto", dto);
	}
}
