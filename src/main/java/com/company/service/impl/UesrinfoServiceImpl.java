package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.company.mapper.Userinfo;
import com.company.mapper.UserinfoMapper;
import com.company.service.IUserinfoService;

/**
 * @author banbuduo
 * @category 人员业务逻辑实现类
 */
public class UesrinfoServiceImpl implements IUserinfoService {

	@Autowired
	UserinfoMapper userinfoMapper;

	@Override
	public List<Userinfo> findUsers() {
		return userinfoMapper.findUsers();
	}

	@Override
	public Userinfo login(String name, String pass) {
		List<Userinfo> list = userinfoMapper.findUsersByNameAndPass(name, pass);
		return list != null ? list.get(1) : null;
	}

}
