package com.drug.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.drug.dto.UsersDto;
import com.drug.service.IUsersService;



/**
 * Handles requests for the application home page.
 */
@Controller
public class UsersController {
   
   @Autowired
   private IUsersService service;
   
   private static final Logger logger = LoggerFactory.getLogger(UsersController.class);
   
   /**
    * Simply selects the home view to render by returning its name.
    */
   
   @RequestMapping(value = "/users", method = RequestMethod.GET)
   public String admin(Locale locale, Model model) {
     
      return "redirect:/users/selectAll";
   }
   @RequestMapping(value = "/users/update", method = RequestMethod.GET)
   public String update(UsersDto usersDto) {
      System.out.println(usersDto);
      return "users/update";
   }
   @RequestMapping(value = "/users/update", method = RequestMethod.POST)
   public String updateDB(UsersDto usersDto,RedirectAttributes rttr) throws Exception{
      service.update(usersDto);
      rttr.addFlashAttribute("msg","success");
      return "redirect:/users/selectAll";
   }
   
   @RequestMapping(value = "/users/delete", method = RequestMethod.GET)
   public String delete(String id,RedirectAttributes rttr) throws Exception {
      service.delete(id);
      rttr.addFlashAttribute("msg","success");
      return "redirect:/users/selectAll";
   }
   
   @RequestMapping(value = "/users/selectId", method = RequestMethod.GET)
   public String selectName(String id,Model model) throws Exception {
      model.addAttribute("dto", service.selectId(id) );
      return "users/selectId";
   }
   
   @RequestMapping(value = "/users/selectAll", method = RequestMethod.GET)
   public String selectAll(Model model) throws Exception {
      model.addAttribute("list", service.selectAll() );
      return "users/selectAll";
   }
   @RequestMapping(value = "/users/insert", method = RequestMethod.GET)
   public String insert() {
      return "users/insert";
   }
   @RequestMapping(value = "/users/insert", method = RequestMethod.POST)
   public String insertDB(UsersDto usersDto,RedirectAttributes rttr) throws Exception{
      service.insert(usersDto);
      rttr.addFlashAttribute("msg","success");
      return "redirect:/users/selectAll";
   }
   
   @RequestMapping(value="/login/signup", method= RequestMethod.GET)
   public String register() throws Exception{
      System.out.println("success");
      return "/login/signup";
   }
   @RequestMapping(value="/login/signup", method= RequestMethod.POST)
   public String register(UsersDto userDto, RedirectAttributes rttr) throws Exception{
      System.out.println("dididi");
      service.insert(userDto);
      rttr.addFlashAttribute("msg","success");
      return "redirect:/users/selectAll";
   }
   @RequestMapping(value="/login/login", method=RequestMethod.GET)
   public String userLogin() {
      return "/login/login";
   }
   @RequestMapping(value="/login/login", method=RequestMethod.POST)
   public String userLogin( RedirectAttributes rttr, HttpServletRequest sr) throws Exception{
      
	   
	   System.out.println(sr.getParameter("id")); 
      
      
      
      
      return "redirect:/selectAll";
   }
}