package com.javateam.memberProject.dao;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.javateam.memberProject.domain.RoomVO;

public interface Room2DAO extends CrudRepository<RoomVO, String>{

	RoomVO save(Map<String, Object> map);

}
