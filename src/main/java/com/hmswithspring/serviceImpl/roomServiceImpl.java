package com.hmswithspring.serviceImpl;

import java.util.List;


import com.hmswithspring.dto.roomDTO;
import com.hmswithspring.exception.globalException;
import com.hmswithspring.util.valueMapper;
import com.hmswithspring.model.room;
import com.hmswithspring.repository.roomRepository;
import com.hmswithspring.service.roomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class roomServiceImpl implements roomService{

	@Autowired
	private roomRepository roomrepo;
	
	
	public room addRoom(roomDTO r1) {
		
		room r2 = valueMapper.converttoRoom(r1);
		return roomrepo.save(r2);
	}
	
	public List<room> getRoom(){
		return roomrepo.findAll();
	}
	
	public room updateRoom(roomDTO r1) {
		
		room r2= valueMapper.converttoRoom(r1);
		return roomrepo.save(r2);
	}
	
	public String deleteRoom(int roomid) throws globalException{
	room r2 = roomrepo.findByRoomId(roomid);
	if(r2!=null) {
		roomrepo.deleteById(roomid);
		return "deleted";
}
	else {
		throw new globalException("Room Not found");
	}

	}
}

