package MyPageCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Command.Command;
import com.Users.UserDao;
import com.Users.UserDto;

public class MyPageCommand implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		
		System.out.println(id);
		
		UserDao dao = UserDao.getInstance();
		UserDto dto = dao.getMember(id); //회원정보 불러옴
		
		request.setAttribute("myPage", dto);
	}
}
