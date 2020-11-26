package controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("home.htm")
    public ModelAndView home(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        
        // Obtener parámetros de la URL
        String id1 = request.getParameter("id1");
        String id2 = request.getParameter("id2");
        
        // Pasar parámetros desde el controlador a la vista
        mav.addObject("id1", id1);
        mav.addObject("id2", id2);

        // Muestra la vista
        mav.setViewName("home/home");
        return mav;
    }

    @RequestMapping("nosotros.htm")
    public ModelAndView nosotros() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home/nosotros");
        return mav;
    }
}
