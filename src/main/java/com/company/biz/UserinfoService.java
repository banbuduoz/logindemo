package com.company.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.mapper.Userinfo;
import com.company.mapper.UserinfoMapper;
import com.company.util.Passport;

/**
 * @author banbuduo
 * @category 用户业务逻辑类
 */
@Service
public class UserinfoService {

	@Autowired
	UserinfoMapper userinfoMapper;

	public void addUser(Userinfo userinfo) {
		userinfo.setUserpass(Passport.md5(userinfo.getUserpass()));
		userinfoMapper.addUser(userinfo);
	};

	public List<Userinfo> findList() {
		return userinfoMapper.findUsers();
	};
}
