package com.github.vladislav719.controller;

import com.github.vladislav719.service.FlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.github.vladislav719.controller.Constants.MAIN_PAGE;

/**
 * Created by Владислав on 28.11.2014.
 */
@Controller
@RequestMapping(value = "flat")
public class FlatController {


    private FlatService flatService;

    @Autowired
    @Qualifier(value = "flatService")
    public void setFlatService(FlatService flatService) {
        this.flatService = flatService;
    }

    @RequestMapping(value = "/test")
    public String renderP(Model model) {
        model.addAttribute("log", "it's work");
        return "flats";
    }

    @RequestMapping(value = "/flats",method = RequestMethod.GET)
    public String renderRequestedPage(Model model, @PathVariable Double wear, @PathVariable String district) {
        model.addAttribute("listFlats", flatService.flats(wear, district));
        return "flats";
    }

}
