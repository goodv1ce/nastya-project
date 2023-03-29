package ua.goodvice.easylib.easylib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.goodvice.easylib.easylib.communicator.RestBookCommunicator;

@Controller
public class ViewController {
    @Autowired
    private RestBookCommunicator restBookCommunicator;

    @GetMapping("/")
    public ModelAndView showBookList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home_page");
        modelAndView.addObject("bookList", restBookCommunicator.getAllBooks());

        return modelAndView;
    }
}
