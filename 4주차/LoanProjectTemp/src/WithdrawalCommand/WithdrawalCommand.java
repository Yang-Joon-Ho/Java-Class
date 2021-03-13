package WithdrawalCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Command.Command;
import com.Users.UserDao;

public class WithdrawalCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		
		UserDao dao = UserDao.getInstance();
		
		int rn = dao.delete(id);
		
	}
	

}
