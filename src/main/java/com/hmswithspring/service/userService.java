package com.hmswithspring.service;

import java.util.List;

import com.hmswithspring.dto.userDTO;
import com.hmswithspring.exception.globalException;
import com.hmswithspring.model.user;

public interface userService {
	
	public user addUser(userDTO u1);
	public List<user> getUser();
	public user updateUser(userDTO u1);
	public String deleteuser(int userid) throws globalException;
	public String updatePhone(int userid , String phone) throws globalException;
	public String allotRoom(int userid , int roomid) throws globalException;
	public String updateFee(int userid , int userfee) throws globalException;
}
