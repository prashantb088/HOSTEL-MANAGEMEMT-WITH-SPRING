package com.hmswithspring.repository;

import com.hmswithspring.model.room;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface roomRepository extends JpaRepository<room,Integer>{

	@Query(value="select * from room where room_id=?1",nativeQuery=true)
	room findByRoomId(int roomid);
	
}
