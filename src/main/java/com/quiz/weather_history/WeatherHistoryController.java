package com.quiz.weather_history;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/weather-history")
public class WeatherHistoryController {
	
	//날씨 목록
	@RequestMapping("weatherlist")
	public String weatherlist() {
		
		
		return "weather_history/weatherlist";
	}
	
	
	//날씨 추가 화면
	@RequestMapping("addweather")
	public String weatherhistory() {
		
		return "weather_history/addweather";
	}
}
