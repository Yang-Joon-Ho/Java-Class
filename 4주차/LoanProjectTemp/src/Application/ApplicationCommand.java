package Application;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Command.Command;
import com.Users.ApplicationDto;
import com.Users.UserDao;
import com.Users.UserDto;

public class ApplicationCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ApplicationDto dto = new ApplicationDto();

		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		String name = request.getParameter("name");
		String eMail = request.getParameter("email");
		String account = request.getParameter("account");
		String address = request.getParameter("address");
		String bank = request.getParameter("bank");
		String amount = request.getParameter("amount");
		String company = request.getParameter("company");
		String license = request.getParameter("license");
		
		if (bank.equals("준호은행"))
			dto.setBank("joonhoBank");
		
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.seteMail(eMail);
		dto.setAccount(account);
		dto.setAddress(address);
		
		dto.setAmount(amount);
		dto.setCompany(company);
		dto.setLicense(license);

		UserDao dao = UserDao.getInstance();

		dao.insertApplication(dto);
	}

}
