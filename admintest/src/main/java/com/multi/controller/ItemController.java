package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.ItemDTO;
import com.multi.frame.Util;
import com.multi.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	ItemService service;
	
	String dir = "item/";
	
	@Value("${admindir}")
	String admindir;
	
	@Value("${custdir}")
	String custdir;
	
	@RequestMapping("/get")
	public String get(Model model) {
		List<ItemDTO> list = null;
		try {
			list=service.get();
			model.addAttribute("itemlist", list);
			model.addAttribute("center", dir+"get");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
	
	//get->detail
	@RequestMapping("/detail")
	public String itemdetail(Model model, int id) {
		ItemDTO item =null;
		try {
			item=service.get(id);
			model.addAttribute("i", item);
			model.addAttribute("center", dir+"detail");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
	
	//detail->update
	@RequestMapping("/update")
	public String update(Model model, ItemDTO modiitem) {
		try {
			service.modify(modiitem);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:detail?id="+modiitem.getId();
	}
	
	//detail->delete
	@RequestMapping("/delete")
	public String delete(Model model, int id) {
		try {
			service.remove(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:get";
	}
	
	//register
	@RequestMapping("/register")
	public String register(Model model) {
		//center는 cart folder밑에 get이 들어가게 된다!
		model.addAttribute("center", dir+"register");
		return "index";
	}
	
	//register->resisterimpl
	@RequestMapping("/registerimpl")
	public String registerimpl(Model model, ItemDTO item) {
		//사진 파일의 이름을 끄집어냄
		String imgname = item.getImg().getOriginalFilename();
		item.setImgname(imgname);
		try {
			//img를 admin과 cust에 각각 save를 하고 나서 refresh를 반드시 해줘야함
			//자동 refresh를 할수도 있음!
			Util.saveFile(item.getImg(), admindir, custdir);
			//db에는 파일의 이름만을 저장함
			service.register(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:get";
	}

}
