package controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class GreetSping {

//    thuc hanh 1
//@GetMapping("/greeting")
//    public String greeting(@RequestParam String name, Model model){
//    model.addAttribute("name",name);
//    return"tam";
//}


//    baitapchuyendoitiente;
    @RequestMapping("/home")
    public String home(HttpServletRequest request){
        return "/index.jsp";
    }
    @RequestMapping("/convert")
        public String convert(HttpServletRequest request){
        int mot=Integer.parseInt(request.getParameter("money"));
        int hai=Integer.parseInt(request.getParameter("giatri"));
        int thanhtien=mot*hai;
        request.setAttribute("thanhtien",thanhtien);
        return "/noo.jsp";
        }


}
