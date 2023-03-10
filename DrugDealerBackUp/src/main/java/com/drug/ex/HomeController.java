package com.drug.ex;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.drug.dto.DrugDto;
import com.drug.service.IDrugService;
import com.drug.vo.PageMaker;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private IDrugService service;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
		
		return "index"; //사선 없으면 현재 프로젝트(실행하는 서버) 기반, 있으면 현재 위치 기준!
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(DrugDto drugDto) {
		System.out.println(drugDto);
		return "/update";
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateDB(DrugDto drugDto,RedirectAttributes rttr) throws Exception{
		service.update(drugDto);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/selectAll";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(int pn,RedirectAttributes rttr) throws Exception {
		service.delete(pn);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/selectAll";
	}
	
	@RequestMapping(value = "/selectName", method = RequestMethod.GET)
	public String selectName(PageMaker pm, String pn,Model model, Authentication at) throws Exception {			
		model.addAttribute("dto", service.selectName(pn) );
		model.addAttribute("list",service.listSearchCriteria(pm));
		pm.setTotalCount(service.listSearchCount(pm));
		if(at!=null){
	         UsernamePasswordAuthenticationToken upat = (UsernamePasswordAuthenticationToken)at;
	         String id = upat.getName();
	         model.addAttribute("id",id);
	         System.out.println(id);
	      }
		return "/view_Detail";
	}
	
	@RequestMapping(value = "/selectAll", method = RequestMethod.GET)
	public String selectAll(PageMaker pm, Model model,Authentication at) throws Exception {
		System.out.println("SelectAll 구동중");
//		model.addAttribute("list", service.selectAll());
		model.addAttribute("list",service.listSearchCriteria(pm));
		pm.setTotalCount(service.listSearchCount(pm));
		if(at!=null){
			UsernamePasswordAuthenticationToken upat = (UsernamePasswordAuthenticationToken)at;
			String id = upat.getName();
			System.out.println(id);
		}
		return "/productlist";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		return "/insert";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertDB(DrugDto drugDto,RedirectAttributes rttr) throws Exception{
		service.insert(drugDto);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/selectAll";
	}
	
}