//package com.borovyksv.SpringAngularJS.mvc.scope;
//
//import com.borovyksv.SpringAngularJS.mvc.scope.bean.SessionUser;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.SessionAttributes;
//import org.springframework.web.bind.support.SessionStatus;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// * Created by user-pc on 11.01.2017.
// */
//
//@Controller
//@SessionAttributes(value = "userJSP")
//public class SpringSessionController {
//    @ModelAttribute("userJSP")
//    public SessionUser createUser() {
//        return new SessionUser();
//    }
//
//    @RequestMapping(value = "/springSession", method = RequestMethod.GET)
//    public ModelAndView main(@ModelAttribute("userJSP") SessionUser user) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("userJSP", new SessionUser());
//        modelAndView.setViewName("/springSession");
//        return modelAndView;
//    }
//
//
//    @RequestMapping(value = "/check-user")
//    public ModelAndView checkUser(@ModelAttribute("userJSP") SessionUser user) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("secondPage");
//        modelAndView.addObject("userJSP", user);
//        return modelAndView;
//    }
//
//    //удаление обьектов сессии
//    @RequestMapping(value = "/delete_session", method = RequestMethod.GET)
//    public ModelAndView delete(@ModelAttribute("userJSP") SessionUser user, SessionStatus sessionStatus) {
//        sessionStatus.setComplete();
//        return new ModelAndView("springSession");
//    }
//}
//
