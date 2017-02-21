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

import com.fltjones.entity.Employee;
import com.fltjones.entity.User;
import com.fltjones.service.UserService;

/**
 * user 控制层
 * 
 * @author fltjones on 2017年1月5日
 *
 */
@Controller
@RequestMapping("/") // url:模块/资源/{id}/细分/department/list
public class UserController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	// 注入
	@Autowired
	private UserService userService;

	/**
	 * 删除
	 * 
	 * @param userid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/deleteUser/{userid}", method = RequestMethod.GET)
	public String deleteUser(@PathVariable("userid") int userid, Model model) {
		log.debug("In deleteUser, nameid = {}", userid);
		System.out.println(userid);
		userService.delUser(userid);
		return "../../index";
	}

	/**
	 * 条件查询
	 * 
	 * @param userid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/{userid}/User_detail", method = RequestMethod.GET)
	public String detail(@PathVariable("userid") int userid, Model model) {
		if (userid == 0) {
			return "  ";
		}
		User user = userService.getById(userid);
		if (user == null) {
			return "  ";
		}
		model.addAttribute("user", user);
		return "  ";
	}

	/**
	 * 列表查询
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/User_list", method = RequestMethod.GET)
	public String list(Model model) {
		log.debug("In list, list = {}", model);
		// 获取列表页
		List<User> list = userService.getUserList();
		model.addAttribute("list", list);
		// list.jsp + model = ModelAndeView
		return "User_list";// / WEB-INF/jsp/"list".jsp
	}

	/**
	 * 通过id进行跳转到add页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/User_add", method = RequestMethod.GET)
	public String edit(Model model) {
		return "/User_add";
	}

	/**
	 * 增加账户
	 * 
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/Useradd", method = RequestMethod.POST)
	public String add(User user, Model model) {
		int userid;
		userid = userService.addUser(user);
		return "../../index";
	}

	/**
	 * update链接跳转
	 * 
	 * @param userid
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/User_update", method = RequestMethod.GET)
	public String toupadate(int userid, Model model, HttpServletRequest request) {
		request.setAttribute("userid", userService.getById(userid));
		model.addAttribute("user", userService.getById(userid));
		return "/user_update";
	}

	/**
	 * 更新数据
	 * 
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/Userupdate", method = RequestMethod.POST)
	public String update(User user, Model model) {
		int line = userService.updateUser(user);
		model.addAttribute("user", user);
		return "../../index";
	}

}
