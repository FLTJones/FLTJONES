package com.fltjones.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fltjones.entity.Department;
import com.fltjones.entity.Employee;
import com.fltjones.service.DepartmentService;
import com.fltjones.service.EmployeeService;
import com.sun.javafx.collections.MappingChange.Map;

/**
 * employee 控制层
 * 
 * @author fltjones on 2016年12月21日
 */

@Controller
@RequestMapping("/") // url:模块/资源/{id}/细分/department/list
public class EmployeeController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DepartmentService departmentService;

	/**
	 * 列表查询
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/Employee_list", method = RequestMethod.GET)
	public String list(Model model) {
		log.debug("In list, list = {}", model);
		// 获取列表页
		List<Employee> list = employeeService.getEmployeeList();
		model.addAttribute("list", list);
		// list.jsp + model = ModelAndeView
		return "Employee_list";/// WEB-INF/jsp/"list".jsp
	}

	/**
	 * 条件查询
	 * 
	 * @param eid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/{eid}/Employee_detail", method = RequestMethod.GET)
	public String detail(@PathVariable("eid") int eid, Model model) {
		if (eid == 0) {
			return "redircet:/employee/Employee_list";
		}
		Employee employee = employeeService.getById(eid);
		if (employee == null) {
			return "redircet:/employee/Employee_list";
		}
		model.addAttribute("employee", employee);
		return "Employee_detail";
	}

	/**
	 * 删除信息
	 * 
	 * @param deid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/delEmployee/{eid}", method = RequestMethod.GET)
	public String delDepartment(@PathVariable("eid") int eid, Model model) {
		log.debug("In delEmployee, eid = {}", eid);
		System.out.println(eid);
		employeeService.delEmployee(eid);
		// List<Department> department = departmentService.getDepartmentList();
		// model.addAttribute("department", department);
		return "../../index";
	}

	/**
	 * 增加数据
	 * 
	 * @param ename
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/Employeeadd", method = RequestMethod.POST)
	public String add(Employee employee, Model model) {
		int eid;
		eid = employeeService.addEmployee(employee);
		return "../../index";
	}

	/**
	 * 通过id进行跳转到add页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/Employee_add", method = RequestMethod.GET)
	public String edit(Model model) {
		return "/Employee_add";
	}

	/**
	 * 通过id进行跳转到到update页面
	 * 
	 * @param eid
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/Employee_update", method = RequestMethod.GET)
	public String toupadate(int eid, Model model, HttpServletRequest request) {
		request.setAttribute("eid", employeeService.getById(eid));
		model.addAttribute("employee", employeeService.getById(eid));
		return "/Employee_update";
	}

	/**
	 * 数据更新
	 * 
	 * @param employee
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/Employeeupdate", method = RequestMethod.POST)
	public String update(Employee employee, Model model) {
		int line = employeeService.updateEmployee(employee);
		model.addAttribute("employee", employee);
		return "../../index";
	}

}
