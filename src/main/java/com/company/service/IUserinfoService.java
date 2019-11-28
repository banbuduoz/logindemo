package com.company.service;

import java.util.List;

import com.company.mapper.Userinfo;

/**
 * @author banbuduo
 * @category 人员接口
 */
public interface IUserinfoService {

	/**
	 * 查询所有用户
	 * 
	 * @return 用户列表
	 */
	public List<Userinfo> findUsers();

	/**
	 * 登录
	 * 
	 * @param name 用户名
	 * @param pass 密码
	 * @return 用户对象
	 */
	public Userinfo login(String name, String pass);
}
