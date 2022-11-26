package com.hmswithspring.service;

import java.util.List;

import com.hmswithspring.dto.roomDTO;
import com.hmswithspring.exception.globalException;
import com.hmswithspring.model.room;

public interface roomService {
	
	public room addRoom(roomDTO r1);
	public List<room> getRoom();
	public room updateRoom(roomDTO r1);
	public String deleteRoom(int roomid) throws globalException;
	
	

}
