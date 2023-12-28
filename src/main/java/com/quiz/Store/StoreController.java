package com.quiz.Store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.Store.bo.StoresBO;
import com.quiz.Store.domain.Store;

@Controller
@RequestMapping("/store")
public class StoreController {

	@Autowired
	private StoresBO storeBO;
	@RequestMapping("/store-list")
	public String storeListView(Model model) {
		List<Store> storeList = storeBO.getStore();
		
		model.addAttribute("storeList", storeList);
		return "store/StoreList";
	}
}
