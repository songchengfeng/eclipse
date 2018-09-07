package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iotek.entity.Pagination;
import com.iotek.entity.User;
import com.iotek.service.MailService;
import com.iotek.service.impl.MailServiceImpl;

public class NewsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private MailService mailService = new MailServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
				String currPage = req.getParameter("page");
				
				if (currPage == null) {
					currPage = "1";
				}
				User user = (User) req.getSession().getAttribute("user");
				
				Pagination page = mailService.queryMailByPagination(user.getEmail(), Integer.parseInt(currPage));
				req.setAttribute("pagination", page);
				req.getRequestDispatcher("mail.jsp").forward(req, resp);
		
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
	
}
