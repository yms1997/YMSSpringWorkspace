package com.myspring.mvc;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.myspring.mapper.BoardMapper;
import com.myspring.vo.Board;


@Controller
public class BoardController {
	
	@Autowired
	private BoardMapper mapper;
	
	@GetMapping("/")
	public String main() {
		return "template";
	}
	
	@GetMapping("/boardList.do")
	public String boardList(Model model) {
		ArrayList<Board> list = (ArrayList<Board>)mapper.getLists();
		model.addAttribute("list", list);
		return "boardList";
	}
	
	
	
	
}







