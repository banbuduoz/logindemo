package com.company.service;

import java.util.List;

public interface ISSOTokenService {

	public OnlineUserinfo getUserByToken(String token);

	public void addUserToken(String token, OnlineUserinfo user);

	public boolean isUserOnline(String username);

	public List<OnlineUserinfo> getOnlineUserListByRole(int role);

	public List<OnlineUserinfo> getAllOnlineUser();

	public int getOnlineUserNum();
}
