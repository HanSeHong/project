package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Product {
	@Id
	@GeneratedValue
	private String name; //술이름  primarykey
	
	private String country; //원산지
	private int capacity; //용량
	private int alcol; //알콜도수
	private int price; //가격
	private int kind; //주류분류
}
