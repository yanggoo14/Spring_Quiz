package com.quiz.booking;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lesson06")
public class BookingController {
	
	@GetMapping("/checkbooking")
	public String checkBooking() {
		return "booking/checkBooking";
	}
}
