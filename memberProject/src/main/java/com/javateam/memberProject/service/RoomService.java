package com.javateam.memberProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javateam.memberProject.dao.Room2DAO;
import com.javateam.memberProject.dao.RoomDAO;
import com.javateam.memberProject.domain.RoomVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RoomService {

	@Autowired
	private RoomDAO roomDAO;

	@Transactional
	public RoomVO save(RoomVO roomVO) {
		return roomDAO.save(roomVO);
	}
//	@Transactional(readOnly = true)
//	public RoomVO getRoom(int id) {
//		return roomDAO.findById(id).get();
//	}

}
