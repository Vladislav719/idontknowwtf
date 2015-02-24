package com.github.vladislav719.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

import static com.github.vladislav719.controller.Constants.ATTR_ERROR;
import static com.github.vladislav719.controller.Constants.ATTR_MESSAGE;
import static com.github.vladislav719.controller.Constants.VIEW_MESSAGE;


/**
 * Created by Владислав on 28.11.2014.
 */
@Controller
public class BaseController {

    @Autowired
    protected HttpServletRequest request;

    public String redirectToMain() {
        return "redirect:/";
    }

    public String rendereErrorMessage(String errorMessage) {
        request.setAttribute(ATTR_MESSAGE, errorMessage);
        request.setAttribute(ATTR_ERROR, true);
        return VIEW_MESSAGE;
    }

}
