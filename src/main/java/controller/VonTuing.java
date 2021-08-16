package controller;

import model.VonTu;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ListVonTu;

import javax.servlet.http.HttpServletRequest;

public class VonTuing {
    ListVonTu listVonTu=new ListVonTu();
    @RequestMapping("seach")
    public String seach(HttpServletRequest request){
        String word=request.getParameter("word");
        String result="";
        for (VonTu w :listVonTu.list) {
            if (w.getEnglish().equals(word)){
                result=w.getMeaning();
                break;
            }
        }
        request.setAttribute("result",result);
        return "tam.jsp";
    }
    @RequestMapping("/home")
    public String home(){
        return "tam.jsp";
    }
}
