package com.javateam.memberProject.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javateam.memberProject.dao.Room2DAO;
import com.javateam.memberProject.dao.RoomDAO;
import com.javateam.memberProject.domain.RoomDTO;
import com.javateam.memberProject.domain.RoomVO;
import com.javateam.memberProject.service.RoomService;

import lombok.extern.slf4j.Slf4j;



@Controller
@Slf4j
public class RoomController {
	@Autowired
	RoomService roomService;
	
	/*
	 * @GetMapping("/reserveProc") public String save(RoomDTO dto) {
	 * log.info("asdasd"); //dto를 entity로 변환 RoomVO vo =dto.toEntity();
	 * log.info("vo : "+vo);
	 * 
	 * //변환한 entity를 저장 RoomVO saved = roomDAO.save(vo); log.info("saved : "+saved);
	 * 
	 * //페이지 리턴
	 * 
	 * return "/home"; }
	 */
	/*
	 * @GetMapping("/reserve") public String
	 * room(@RequestParam(value="id",defaultValue = "1") int id, Model model) {
	 * 
	 * log.info("reserve");
	 * 
	 * model.addAttribute("reserve", roomService.getRoom(id));
	 * 
	 * return "reserve"; }
	 */
	
	@PostMapping("/reserve")
	public String reserve(@RequestParam("ROOMNUM") String ROOMNUM, 
						  @RequestParam("RESERVE1") String RESERVE1,
						  @RequestParam("RESERVE2") String RESERVE2,
						  @RequestParam("MEMBERID") String MEMBERID){
		log.info("DBreserve");
		
		RoomVO roomVO = new RoomVO(MEMBERID, ROOMNUM, RESERVE1, RESERVE2);
		log.info("roomVO = "+roomVO);
		
		roomService.save(roomVO);
		
		return "reserve";
	}
	
	 /* @PostMapping("/reserve") public String reserve(RoomDTO dto) { RoomVO entity =
	 * dto.toEntity(); log.info("entity : "+entity);
	 * 
	 * RoomVO saved = dao.save(entity); log.info("saved : "+saved);
	 * 
	 * return "reserve"; }
	 */
}
