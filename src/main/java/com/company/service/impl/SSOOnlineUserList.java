package com.company.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.company.service.OnlineUserinfo;

public class SSOOnlineUserList {

	private static Map<String, OnlineUserinfo> onlineUserList = Collections
			.synchronizedMap(new HashMap<String, OnlineUserinfo>());

	public static OnlineUserinfo getUserByToken(String token) {
		return onlineUserList.get(token);
	}

	public static void putUserToken(String token, OnlineUserinfo user) {
		onlineUserList.put(token, user);
	}

	public static Set<String> getTokenSet() {
		return onlineUserList.keySet();
	}

	public static void removeToken(String Token) {
		onlineUserList.remove(Token);
	}

	public static boolean isUserOnline(String username) {
		Set<String> tokenSet = getTokenSet();
		for (String token : tokenSet) {
			OnlineUserinfo info = getUserByToken(token);
			if (username.equals(info.getUsername())) {
				return true;
			}
		}
		return false;
	}

	public static int getOnlineUserNum() {
		return getTokenSet().size();
	}

	public static List<OnlineUserinfo> getAllOnlineUser() {
		Set<String> keys = getTokenSet();
		List<OnlineUserinfo> list = new ArrayList<OnlineUserinfo>();
		for (String token : keys) {
			list.add(getUserByToken(token));
		}
		return list;
	}

	public static List<OnlineUserinfo> getOnlineUserListByRole(int role) {
		Set<String> keys = getTokenSet();
		List<OnlineUserinfo> list = new ArrayList<OnlineUserinfo>();
		for (String token : keys) {
			OnlineUserinfo info = getUserByToken(token);
			if (role == info.getRole()) {
				list.add(info);
			}
		}
		return list;
	}

}
