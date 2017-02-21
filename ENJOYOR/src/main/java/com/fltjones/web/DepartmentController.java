package com.fltjones.web;

import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.apache.ibatis.type.TypeAliasRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.auth0.jwt.internal.org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.detDSA;
import com.fltjones.entity.Department;
import com.fltjones.service.DepartmentService;
import com.mchange.v2.c3p0.impl.NewProxyDatabaseMetaData;
import com.sun.xml.internal.ws.Closeable;

/**
 * 
 * @author fltjones on2016年12月19日
 */
@Controller
@RequestMapping("/") // url:模块/资源/{id}/细分/department/list
public class DepartmentController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DepartmentService departmentService;

	/**
	 * 列表查询
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/Department_list", method = RequestMethod.GET)
	public String list(Model model) {
		log.debug("In list, list = {}", model);
		// 获取列表页
		List<Department> list = departmentService.getDepartmentList();
		model.addAttribute("list", list);
		// list.jsp + model = ModelAndeView
		return "Department_list";/// WEB-INF/jsp/"list".jsp
	}

	/**
	 * 增加数据
	 * 
	 * @param dename
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/Departmentadd", method = RequestMethod.POST)
	public String add(Department department, Model model) {
		int deid;
		deid = departmentService.addDepartment(department);
		return "../../index";
	}

	@RequestMapping(value = "/Department_add", method = RequestMethod.GET)
	public String edit(Model model) {
		return "/Department_add";
	}

	/**
	 * 根据传来的id取出，与update分开
	 * 
	 * @param deid
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/Department_update", method = RequestMethod.GET)
	public String toupadate(int deid, Model model, HttpServletRequest request) {
		request.setAttribute("deid", departmentService.getById(deid));
		model.addAttribute("department", departmentService.getById(deid));
		return "/Department_update";
	}

	/**
	 * 数据更新
	 * 
	 * @param department
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/Departmentupdate", method = RequestMethod.POST)
	public String update(Department department, Model model) {
		int line = departmentService.updateDepartment(department);
		model.addAttribute("department", department);
		return "../../index";
	}

	/**
	 * 删除信息
	 * 
	 * @param deid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/delDepartment/{deid}", method = RequestMethod.GET)
	public String delDepartment(@PathVariable("deid") int deid, Model model) {
		log.debug("In delDepartment, deid = {}", deid);
		System.out.println(deid);
		departmentService.delDepartment(deid);
		// List<Department> department = departmentService.getDepartmentList();
		// model.addAttribute("department", department);
		return "../../index";
	}

	/**
	 * 单个查询
	 * 
	 * @param deid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/Department_detail/{deid}", method = RequestMethod.GET)
	public String detail(@PathVariable("deid") int deid, Model model) {
		if (deid == 0) {
			return "redircet:/Department_list";
		}
		Department department = departmentService.getById(deid);
		if (department == null) {
			return "redircet:/Department_list";
		}
		model.addAttribute("department", department);
		return "Department_detail";
	}

}
