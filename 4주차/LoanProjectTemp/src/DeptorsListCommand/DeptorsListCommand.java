package DeptorsListCommand;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Command.Command;
import com.Users.UserDao;
import com.Users.UserDto;

public class DeptorsListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		UserDao dao = UserDao.getInstance();
		
		ArrayList<UserDto> dtos = dao.list();
		request.setAttribute("list", dtos);
	}

}
