package com.borovyksv.SpringAngularJS.mvc.interceptors;

/**
 * Created by user-pc on 09.01.2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class InterceptorController {

    @RequestMapping(value = "/interceptorCall/subLevel", method = RequestMethod.GET)
    public ModelAndView interceptorCall() {
        System.out.println("interceptorCall() is called");
        return new ModelAndView("/index");
    }
}