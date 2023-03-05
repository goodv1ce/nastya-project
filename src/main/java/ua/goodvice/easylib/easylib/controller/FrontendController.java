package ua.goodvice.easylib.easylib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {
    @GetMapping("/")
    public String helloPage() {
        return "hello";
    }
}
