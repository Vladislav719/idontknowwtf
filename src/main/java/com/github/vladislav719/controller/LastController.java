package com.github.vladislav719.controller;

import com.github.vladislav719.ez.DBConnection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Владислав on 27.12.2014.
 */
@Controller
@RequestMapping(value = "control")
public class LastController {

    private Connection connection = DBConnection.getConnection();

    @RequestMapping(method = RequestMethod.POST, value = "update")
    public String updateList(ModelMap model) {
        List<String> passports = new ArrayList<String>();
        try {
            ResultSet rs = connection.createStatement().executeQuery("SELECT N_PASSPORT from OWNER");
            while (rs.next()) {
                passports.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        model.addAttribute("owners", passports);
        return "3/task1";
    }

    @RequestMapping(method = RequestMethod.POST, value = "updateBuilding")
    public String updateList(ModelMap model, @RequestParam String passport) {
        List<String> kadastrList = new ArrayList<String>();

        try {
            ResultSet rs = connection.createStatement().executeQuery("SELECT FLAT.ID FROM FLAT_BUILDING ");
            while (rs.next()) {
                kadastrList.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        model.addAttribute("kadastrList", kadastrList);
        return "3/task1";
    }

    @RequestMapping(method = RequestMethod.POST, value = "getResult")
    public String getResult(ModelMap model) {
        List resultList = new ArrayList();

        try {
            ResultSet rs = connection.createStatement().executeQuery("SELECT * from FLAT INNER JOIN OWNER, ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
