package com.company.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author banbuduo
 * @category 用户映射实体类
 */
@Mapper
public interface UserinfoMapper {

	// 增加用户
	@Insert("insert into userinfo(userid,username,userpass,userheadimage,userrole) values #{userid},#{username},#{userpass},#{userheadimage},#{userrole}")
	public void addUser(@Param("user") Userinfo user);

	// 查询素有用户
	@Select("select * from userinfo order by userid desc")
	public List<Userinfo> findUsers();

	// 登录
	@Select("select * from userinfo where username=#{username} and userpass=#{userpass}")
	public List<Userinfo> findUsersByNameAndPass(@Param("username") String username,
			@Param("userpass") String userpass);

	@Select("select * from userinfo where username=#{username}")
	public List<Userinfo> findUsersByName(String username);
}
