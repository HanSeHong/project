package com.javateam.memberProject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.javateam.memberProject.domain.RoomVO;

public interface RoomDAO extends JpaRepository<RoomVO, String>{
	List<RoomVO> findAll();
}
