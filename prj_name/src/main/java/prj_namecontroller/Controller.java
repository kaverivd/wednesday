package prj_namecontroller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.EmployeeDao;
import dto.Employee;

public class Controller extends GenericServlet  {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String s1=arg0.getParameter("empid");
		int empid=Integer.parseInt(s1);
		
		String empname=arg0.getParameter("empname");
		String gender=arg0.getParameter("gender");
		String dob=arg0.getParameter("date");
		String contry=arg0.getParameter("country");
		
		Employee e1=new Employee();
		
		
		e1.setEmpid(empid);
		e1.setEmpname(empname);
		e1.setGender(gender);
		e1.setDate(dob);
		e1.setCountry(contry);
		
		
		EmployeeDao e2=new EmployeeDao();
		e2.insert(e1);
		}
	
}
