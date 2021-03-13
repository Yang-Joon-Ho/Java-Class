package Application;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Command.Command;
import com.Users.ApplicationDto;
import com.Users.UserDao;
import com.Users.UserDto;

//return the application list 
public class ApplicationListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		UserDao dao = UserDao.getInstance();
		
		String bank = request.getParameter("bank");
		
		System.out.println(bank);
		
		ArrayList<ApplicationDto> dtos = dao.applicationList(bank);
		request.setAttribute("list", dtos);
	}
}
