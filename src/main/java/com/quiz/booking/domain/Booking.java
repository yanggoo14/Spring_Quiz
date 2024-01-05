package com.quiz.booking.domain;

import java.util.Date;

import lombok.Data;

@Data //getter와 setter만들어주는 객체
public class Booking {
	private int id;
	private String name;
	private int headcount;
	private int day;
	private Date date;
	private String phoneNumber;
	private String state;
	private Date createdAt;
	private Date updatedAt;
	
}
