package com.company.service.impl;

import java.util.List;

import com.company.service.ISSOTokenService;
import com.company.service.OnlineUserinfo;

public class SSOTokenServiceImpl implements ISSOTokenService {

	@Override
	public OnlineUserinfo getUserByToken(String token) {
		return SSOOnlineUserList.getUserByToken(token);
	}

	@Override
	public void addUserToken(String token, OnlineUserinfo user) {
		SSOOnlineUserList.putUserToken(token, user);
	}

	@Override
	public boolean isUserOnline(String username) {
		return SSOOnlineUserList.isUserOnline(username);
	}

	@Override
	public List<OnlineUserinfo> getOnlineUserListByRole(int role) {
		return SSOOnlineUserList.getOnlineUserListByRole(role);
	}

	@Override
	public List<OnlineUserinfo> getAllOnlineUser() {
		return SSOOnlineUserList.getAllOnlineUser();
	}

	@Override
	public int getOnlineUserNum() {
		return SSOOnlineUserList.getOnlineUserNum();
	}

}
