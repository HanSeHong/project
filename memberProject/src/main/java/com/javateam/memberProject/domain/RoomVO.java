package com.javateam.memberProject.domain;

import java.lang.reflect.Field;
import java.sql.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import lombok.Data;
import lombok.NoArgsConstructor;

@ToString
@Slf4j
@Entity
@NoArgsConstructor
@Table(name="ROOM_TBL")
public class RoomVO {
	@Id
	//@GeneratedValue
	@Column(name="MEMBERID")
	private String memberId;
	
	@Column(name ="ROOMNUM")
	private String roomNum;
	
	@Column(name="RESERVE1")
	@CreationTimestamp
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date reserve1;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@CreationTimestamp
	@Column(name="RESERVE2")
	private Date reserve2;

	public RoomVO(String MEMBERID, String ROOMNUM, String RESERVE1, String RESERVE2) {
		this.memberId = MEMBERID;
		this.roomNum = ROOMNUM;
		this.reserve1 = Date.valueOf(RESERVE1);
		this.reserve2 = Date.valueOf(RESERVE2);
	}
}
