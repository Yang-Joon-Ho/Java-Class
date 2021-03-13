package JoinCommand;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Command.Command;
import com.Users.UserDao;
import com.Users.UserDto;

// user join
public class JoinCommand implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		UserDto dto = new UserDto();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		String name = request.getParameter("name");
		String eMail = request.getParameter("email");
		String address = request.getParameter("address");
		String phoneNum = request.getParameter("phoneNum");
		
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.seteMail(eMail);
		dto.setAddress(address);
		dto.setPhone(phoneNum);
		
		UserDao dao = UserDao.getInstance();
		
		dao.insertMember(dto);
		
	}
	
}
