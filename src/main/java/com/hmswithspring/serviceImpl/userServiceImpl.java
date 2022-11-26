package com.hmswithspring.serviceImpl;

import java.util.List;

import com.hmswithspring.dto.userDTO;
import com.hmswithspring.exception.globalException;
import com.hmswithspring.model.user;
import com.hmswithspring.repository.userRepository;
import com.hmswithspring.service.userService;
import com.hmswithspring.util.valueMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService{
	
	@Autowired
	
	private userRepository userrepo;

	@Override
	public user addUser(userDTO u1) {
		user u2=valueMapper.converttoUser(u1);
		return userrepo.save(u2);
	}

	@Override
	public List<user> getUser() {
		return userrepo.findAll();
	}

	@Override
	public user updateUser(userDTO u1) {
		user u2=valueMapper.converttoUser(u1);
		return userrepo.save(u2);
	}

	@Override
	public String deleteuser(int userid) throws globalException {
		
		user u2=userrepo.findByUserId(userid);
		if(u2!=null) {
			userrepo.deleteById(userid);
			return "deleted";
		}
		else {
			throw new globalException("user not found");
		}
	}

	@Override
	public String updatePhone(int userid, String phone) throws globalException {
		
		int st=userrepo.updatePhone(userid, phone);
		if(st==1) {
			return "updated!....";
		}
		else {
			throw new globalException("Sonething went wrong");
		}
	}

	@Override
	public String allotRoom(int userid, int roomid) throws globalException {
		
		int st=userrepo.allotRoom(userid, roomid);
		if(st==1) {
			return "Room Allted to"+userid;		
	}
	else {
		throw new globalException("Something Went Wrong");
		
	}
}

	@Override
	public String updateFee(int userid, int userfee) throws globalException {
	
		int st=userrepo.updateFee(userid, userfee);
		if(st==1) {
			return "Fee Updated to"+userid;
		}
		else {
			throw new globalException("Something Went Wrong");
		}
		
	
	}

}
