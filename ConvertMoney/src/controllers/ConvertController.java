package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertController {
    @GetMapping("/")
    public String convert() {
        return "convert";
    }

    @RequestMapping(value = "/details", method = RequestMethod.POST)
    public ModelAndView convert(@RequestParam Double rate, Double usd) {
        ModelAndView modelAndView = new ModelAndView("details");
        modelAndView.addObject("rate", rate);
        modelAndView.addObject("usd", usd);
        Double vnd = rate*usd;
        modelAndView.addObject("vnd", vnd);
        return modelAndView;
    }
}